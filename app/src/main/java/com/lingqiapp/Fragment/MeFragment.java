package com.lingqiapp.Fragment;


import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lingqiapp.Activity.BanQuanDetailsActivity;
import com.lingqiapp.Activity.LoginActivity;
import com.lingqiapp.Activity.MYTuiJianMaActivity;
import com.lingqiapp.Activity.MyMessageActivity;
import com.lingqiapp.Activity.PingTaiDetailsActivity;
import com.lingqiapp.Activity.YiJianFanKuiActivity;
import com.lingqiapp.R;
import com.lingqiapp.Utils.SpUtil;
import com.lingqiapp.Utils.UrlUtils;
import com.lingqiapp.View.CommomDialog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @author 赵磊
 * @date 2018/5/21
 * 功能描述：
 */
public class MeFragment extends BaseLazyFragment implements View.OnClickListener {

    @BindView(R.id.SimpleDraweeView)
    com.facebook.drawee.view.SimpleDraweeView SimpleDraweeView;
    @BindView(R.id.tv_username)
    TextView tvUsername;
    @BindView(R.id.tv_userlv)
    TextView tvUserlv;
    @BindView(R.id.tv_yue)
    TextView tvYue;
    @BindView(R.id.fl_mymessage)
    FrameLayout flMymessage;
    @BindView(R.id.ll_myorder)
    LinearLayout llMyorder;
    @BindView(R.id.ll_daifukuan)
    LinearLayout llDaifukuan;
    @BindView(R.id.ll_daifahuo)
    LinearLayout llDaifahuo;
    @BindView(R.id.ll_daishouhuo)
    LinearLayout llDaishouhuo;
    @BindView(R.id.ll_daipingjia)
    LinearLayout llDaipingjia;
    @BindView(R.id.ll_caiwumingxi)
    LinearLayout llCaiwumingxi;
    @BindView(R.id.ll_yinhangkaguanli)
    LinearLayout llYinhangkaguanli;
    @BindView(R.id.ll_shenqingtixian)
    LinearLayout llShenqingtixian;
    @BindView(R.id.ll_tixianjilu)
    LinearLayout llTixianjilu;
    @BindView(R.id.ll_zhanneixiaoxi)
    LinearLayout llZhanneixiaoxi;
    @BindView(R.id.ll_pingtaijieshao)
    LinearLayout llPingtaijieshao;
    @BindView(R.id.ll_lianxiwomen)
    LinearLayout llLianxiwomen;
    @BindView(R.id.ll_yijianfankui)
    LinearLayout llYijianfankui;
    @BindView(R.id.ll_banquanxinxi)
    LinearLayout llBanquanxinxi;
    @BindView(R.id.btn_exit)
    Button btnExit;
    @BindView(R.id.ll_wdeshoucang)
    LinearLayout llWdeshoucang;
    @BindView(R.id.ll_shouhuodizhi)
    LinearLayout llShouhuodizhi;
    @BindView(R.id.ll_erweima)
    LinearLayout llErweima;
    @BindView(R.id.ll_yaoqingliebiao)
    LinearLayout llYaoqingliebiao;
    Unbinder unbinder;

    @Override
    protected void initPrepare() {

    }

    @Override
    protected void onInvisible() {

    }

    @Override
    protected void initData() {
    }

    @Override
    public void onResume() {
        super.onResume();
        SimpleDraweeView.setImageURI(String.valueOf(UrlUtils.URL + SpUtil.get(mContext, "img", "")));
        tvUsername.setText(String.valueOf(SpUtil.get(mContext, "username", "")));
        tvYue.setText("账户余额：" + String.valueOf(SpUtil.get(mContext, "money", "")));
        llYijianfankui.setOnClickListener(this);
        llPingtaijieshao.setOnClickListener(this);
        llBanquanxinxi.setOnClickListener(this);
        flMymessage.setOnClickListener(this);
        llErweima.setOnClickListener(this);
        btnExit.setOnClickListener(this);
    }

    @Override
    protected View initView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.me_fragment_layout, container, false);
        return view;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ll_erweima:
                startActivity(new Intent(mContext, MYTuiJianMaActivity.class));
                break;
            case R.id.fl_mymessage:
                startActivity(new Intent(mContext, MyMessageActivity.class));
                break;
            case R.id.ll_pingtaijieshao:
                startActivity(new Intent(mContext, PingTaiDetailsActivity.class));
                break;
            case R.id.ll_banquanxinxi:
                startActivity(new Intent(mContext, BanQuanDetailsActivity.class));
                break;
            case R.id.ll_yijianfankui:
                startActivity(new Intent(mContext, YiJianFanKuiActivity.class));
                break;
            case R.id.btn_exit:
                new CommomDialog(mContext, R.style.dialog, "您确定退出登录么？", new CommomDialog.OnCloseListener() {
                    @Override
                    public void onClick(Dialog dialog, final boolean confirm) {
                        if (confirm) {
                            dialog.dismiss();
                        } else {
                            dialog.dismiss();
                            SpUtil.clear(mContext);
                            Intent intent = new Intent(mContext, LoginActivity.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(intent);
                        }
                    }
                }).setTitle("提示").show();
                break;
            default:
                break;
        }
    }
}