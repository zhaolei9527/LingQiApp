package com.lingqiapp.Activity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.VolleyError;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.gson.Gson;
import com.lingqiapp.App;
import com.lingqiapp.Base.BaseActivity;
import com.lingqiapp.Bean.GoodsOrderBean;
import com.lingqiapp.Bean.OrderOrderBean;
import com.lingqiapp.Bean.OrderYueBean;
import com.lingqiapp.Bean.PayYueBean;
import com.lingqiapp.R;
import com.lingqiapp.Utils.EasyToast;
import com.lingqiapp.Utils.SpUtil;
import com.lingqiapp.Utils.UrlUtils;
import com.lingqiapp.Utils.Utils;
import com.lingqiapp.Volley.VolleyInterface;
import com.lingqiapp.Volley.VolleyRequest;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OrderActivity extends BaseActivity implements View.OnClickListener {

    @BindView(R.id.rl_back)
    FrameLayout rlBack;
    @BindView(R.id.rl_title)
    RelativeLayout rlTitle;
    @BindView(R.id.img_dizhi)
    ImageView imgDizhi;
    @BindView(R.id.tv_check_address)
    TextView tvCheckAddress;
    @BindView(R.id.tv_name)
    TextView tvName;
    @BindView(R.id.tv_phone)
    TextView tvPhone;
    @BindView(R.id.tv_dizhi)
    TextView tvDizhi;
    @BindView(R.id.tv_add_dizhi)
    TextView tvAddDizhi;
    @BindView(R.id.img_checkaddress)
    ImageView imgCheckaddress;
    @BindView(R.id.rl_change_dizhi)
    RelativeLayout rlChangeDizhi;
    @BindView(R.id.ll_oreders)
    LinearLayout llOreders;
    @BindView(R.id.shopnow)
    Button shopnow;
    @BindView(R.id.tv_money)
    TextView tvMoney;
    @BindView(R.id.tv_goods)
    TextView tvGoods;
    @BindView(R.id.img_dismiss)
    ImageView imgDismiss;
    @BindView(R.id.img_checkwechat)
    ImageView imgCheckwechat;
    @BindView(R.id.ll_checkwechat)
    LinearLayout llCheckwechat;
    @BindView(R.id.img_checkali)
    ImageView imgCheckali;
    @BindView(R.id.ll_checkali)
    LinearLayout llCheckali;
    @BindView(R.id.tv_paymoney)
    TextView tvPaymoney;
    @BindView(R.id.tv_pay)
    TextView tvPay;
    @BindView(R.id.ll_pay)
    LinearLayout llPay;

    private Dialog dialog;
    private String yue;
    private double yuev;
    private int addressCode = 200;
    private String addressID = "";
    private OrderOrderBean orderOrderBean;
    private OrderYueBean orderYueBean;
    private GoodsOrderBean goodsOrderBean;
    private String type;


    @Override
    protected void onDestroy() {
        super.onDestroy();
        App.getQueues().cancelAll("order/index");
        App.getQueues().cancelAll("order/order");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == addressCode) {
            if (data == null) {

            } else {
                tvAddDizhi.setVisibility(View.INVISIBLE);
                tvName.setVisibility(View.VISIBLE);
                tvDizhi.setVisibility(View.VISIBLE);
                tvPhone.setVisibility(View.VISIBLE);
                String name = data.getStringExtra("name");
                tvName.setText(name);
                String phone = data.getStringExtra("phone");
                tvPhone.setText(phone);
                String address = data.getStringExtra("address");
                tvDizhi.setText(address);
                addressID = data.getStringExtra("addressid");
            }
        }
    }

    @Override
    protected int setthislayout() {
        return R.layout.activity_order;
    }

    @Override
    protected void initview() {
        llPay.setVisibility(View.GONE);
        rlBack.setOnClickListener(this);
        imgDismiss.setOnClickListener(this);
        llCheckali.setOnClickListener(this);
        llCheckwechat.setOnClickListener(this);
        tvPay.setOnClickListener(this);
        shopnow.setOnClickListener(this);
    }

    @Override
    protected void initListener() {
        rlBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        rlChangeDizhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(context, AddressActivitry.class).putExtra("type", "backAddress"), addressCode);
            }
        });
    }

    int num = 0;

    @Override
    protected void initData() {
        String order = getIntent().getStringExtra("order");

        type = getIntent().getStringExtra("type");

        if (!TextUtils.isEmpty(type)) {

            goodsOrderBean = new Gson().fromJson(order, GoodsOrderBean.class);

            Log.e("OrderActivity", order);
            tvMoney.setText("￥" + goodsOrderBean.getZ_price());

            if (goodsOrderBean.getDizhi() != null) {
                tvAddDizhi.setVisibility(View.INVISIBLE);
                tvName.setVisibility(View.VISIBLE);
                tvName.setText(goodsOrderBean.getDizhi().getName());
                tvDizhi.setVisibility(View.VISIBLE);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(goodsOrderBean.getDizhi().getProvince());
                stringBuilder.append(goodsOrderBean.getDizhi().getCity());
                stringBuilder.append(goodsOrderBean.getDizhi().getCountry());
                stringBuilder.append(goodsOrderBean.getDizhi().getAddress());
                tvDizhi.setText(stringBuilder.toString());
                tvPhone.setVisibility(View.VISIBLE);
                tvPhone.setText(goodsOrderBean.getDizhi().getTel());
                //地址id
                addressID = goodsOrderBean.getDizhi().getId();
            } else {
                tvAddDizhi.setVisibility(View.VISIBLE);
                tvName.setVisibility(View.INVISIBLE);
                tvDizhi.setVisibility(View.INVISIBLE);
                tvPhone.setVisibility(View.INVISIBLE);
            }

            Log.e("OrderActivity", order);

            View inflate = View.inflate(context, R.layout.item_oreder_layout, null);
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) inflate.findViewById(R.id.SimpleDraweeView);
            simpleDraweeView.setImageURI(UrlUtils.URL + goodsOrderBean.getGoods().getImg_feng());
            TextView tv_title = (TextView) inflate.findViewById(R.id.tv_title);
            tv_title.setText(goodsOrderBean.getGoods().getTitle());
            TextView tv_price = (TextView) inflate.findViewById(R.id.tv_price);
            tv_price.setText("￥" + goodsOrderBean.getGoods().getPrice());
            TextView tv_num = (TextView) inflate.findViewById(R.id.tv_num);
            tv_num.setText("数量 ×" + goodsOrderBean.getG_num());

            TextView tv_xiaojigoodsnum = (TextView) inflate.findViewById(R.id.tv_xiaojigoodsnum);
            tv_xiaojigoodsnum.setText("共" + goodsOrderBean.getG_num() + "件商品：");

            TextView tv_xiaojigoodprice = (TextView) inflate.findViewById(R.id.tv_xiaojigoodprice);
            tv_xiaojigoodprice.setText("￥" + goodsOrderBean.getZ_price());

            llOreders.addView(inflate);
            num = num + Integer.parseInt(goodsOrderBean.getG_num());

            tvGoods.setText("共" + num + "件商品");

            tvPaymoney.setText("￥ " + goodsOrderBean.getZ_price());

            if (Utils.isConnected(context)) {
                dialog = Utils.showLoadingDialog(context);
            } else {
                EasyToast.showShort(context, "网络未连接");
            }


        } else {
            orderOrderBean = new Gson().fromJson(order, OrderOrderBean.class);

            Log.e("OrderActivity", order);
            tvMoney.setText("￥" + orderOrderBean.getZf_money());

            if (orderOrderBean.getAddress() != null) {
                tvAddDizhi.setVisibility(View.INVISIBLE);
                tvName.setVisibility(View.VISIBLE);
                tvName.setText(orderOrderBean.getAddress().getName());
                tvDizhi.setVisibility(View.VISIBLE);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(orderOrderBean.getAddress().getProvince());
                stringBuilder.append(orderOrderBean.getAddress().getCity());
                stringBuilder.append(orderOrderBean.getAddress().getCountry());
                stringBuilder.append(orderOrderBean.getAddress().getAddress());
                tvDizhi.setText(stringBuilder.toString());
                tvPhone.setVisibility(View.VISIBLE);
                tvPhone.setText(orderOrderBean.getAddress().getTel());
                //地址id
                addressID = orderOrderBean.getAddress().getId();
            } else {
                tvAddDizhi.setVisibility(View.VISIBLE);
                tvName.setVisibility(View.INVISIBLE);
                tvDizhi.setVisibility(View.INVISIBLE);
                tvPhone.setVisibility(View.INVISIBLE);
            }

            Log.e("OrderActivity", order);
            for (int i = 0; i < orderOrderBean.getCart().size(); i++) {

                View inflate = View.inflate(context, R.layout.item_oreder_layout, null);
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) inflate.findViewById(R.id.SimpleDraweeView);
                simpleDraweeView.setImageURI(UrlUtils.URL + orderOrderBean.getCart().get(i).getImg_feng());
                TextView tv_title = (TextView) inflate.findViewById(R.id.tv_title);
                tv_title.setText(orderOrderBean.getCart().get(i).getTitle());
                TextView tv_price = (TextView) inflate.findViewById(R.id.tv_price);
                tv_price.setText("￥" + orderOrderBean.getCart().get(i).getPrice());
                TextView tv_num = (TextView) inflate.findViewById(R.id.tv_num);
                tv_num.setText("数量 ×" + orderOrderBean.getCart().get(i).getNumber());

                TextView tv_xiaojigoodsnum = (TextView) inflate.findViewById(R.id.tv_xiaojigoodsnum);
                tv_xiaojigoodsnum.setText("共" + orderOrderBean.getCart().get(i).getNumber() + "件商品：");

                TextView tv_xiaojigoodprice = (TextView) inflate.findViewById(R.id.tv_xiaojigoodprice);
                tv_xiaojigoodprice.setText("￥" + orderOrderBean.getCart().get(i).getZmoney());

                llOreders.addView(inflate);
                num = num + Integer.parseInt(orderOrderBean.getCart().get(i).getNumber());

            }

            tvGoods.setText("共" + num + "件商品");

            tvPaymoney.setText("￥ " + orderOrderBean.getZf_money());

            if (Utils.isConnected(context)) {
                dialog = Utils.showLoadingDialog(context);
            } else {
                EasyToast.showShort(context, "网络未连接");
            }

        }

    }

    /**
     * 订单生成
     */
    private void orderOrder() {
        HashMap<String, String> params = new HashMap<>(5);
        params.put("uid", String.valueOf(SpUtil.get(context, "uid", "")));
        if (TextUtils.isEmpty(type)) {
            params.put("totalprice", "" + orderOrderBean.getZf_money());
            params.put("cid", "" + getIntent().getStringExtra("cart_id"));
            params.put("gid", "" + getIntent().getStringExtra("gid"));
        } else {
            params.put("totalprice", "" + goodsOrderBean.getZ_price());
            params.put("gid", "" + goodsOrderBean.getGoods().getId());
            params.put("cid", "" + getIntent().getStringExtra("cart_id"));
        }
        params.put("aid", addressID);
        params.put("number", "" + num);
        Log.e("OrderActivity", params.toString());
        VolleyRequest.RequestPost(context, UrlUtils.BASE_URL + "order/tj_order", "order/tj_order", params, new VolleyInterface(context) {
            @Override
            public void onMySuccess(String result) {
                dialog.dismiss();
                Log.e("OrderActivity", result);
                try {
                    orderYueBean = new Gson().fromJson(result, OrderYueBean.class);
                    if (1 == orderYueBean.getStatus()) {
                        llPay.setVisibility(View.VISIBLE);
                    } else {
                        Toast.makeText(context, "订单异常", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onMyError(VolleyError error) {
                dialog.dismiss();
                error.printStackTrace();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    private int pay = 1;

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.shopnow:
                if (TextUtils.isEmpty(addressID)) {
                    dialog.dismiss();
                    EasyToast.showShort(context, "请填写收货地址");
                    return;
                }
                dialog.show();
                orderOrder();
                break;
            case R.id.rl_back:
                finish();
                break;
            case R.id.img_dismiss:
                llPay.setVisibility(View.GONE);
                break;
            case R.id.ll_checkali:
                pay = 1;
                imgCheckali.setVisibility(View.VISIBLE);
                imgCheckwechat.setVisibility(View.GONE);
                break;
            case R.id.ll_checkwechat:
                pay = 2;
                imgCheckali.setVisibility(View.GONE);
                imgCheckwechat.setVisibility(View.VISIBLE);
                break;
            case R.id.tv_pay:
                if (pay == 0) {
                    EasyToast.showShort(context, "请选择支付方式~");
                    return;
                }
                if (pay == 2) {
                    //orderZfpay();
                } else {
                    //orderWxpay();
                    dialog.show();
                    payYue(orderYueBean.getOrderid());
                }
                break;
            default:
                break;
        }
    }

    /**
     * 订单生成
     */
    private void payYue(final String oid) {
        HashMap<String, String> params = new HashMap<>(5);
        params.put("uid", String.valueOf(SpUtil.get(context, "uid", "")));
        params.put("oid", oid);
        Log.e("OrderActivity", params.toString());
        VolleyRequest.RequestPost(context, UrlUtils.BASE_URL + "order/pay_yue", "order/pay_yue", params, new VolleyInterface(context) {
            @Override
            public void onMySuccess(String result) {
                dialog.dismiss();
                Log.e("OrderActivity", result);
                try {
                    dialog.dismiss();
                    PayYueBean payYueBean = new Gson().fromJson(result, PayYueBean.class);
                    if (1 == payYueBean.getStatus()) {
                        startActivity(new Intent(context, GoodPayActivity.class)
                                .putExtra("type", "good")
                                .putExtra("order", oid)
                                .putExtra("orderid", oid));
                        finish();
                    } else {
                        startActivity(new Intent(context, GoodPayActivity.class)
                                .putExtra("order", oid)
                                .putExtra("orderid", oid));
                        finish();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onMyError(VolleyError error) {
                dialog.dismiss();
                error.printStackTrace();
            }
        });
    }

}
