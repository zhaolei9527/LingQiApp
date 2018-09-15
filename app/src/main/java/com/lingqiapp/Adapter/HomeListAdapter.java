package com.lingqiapp.Adapter;

import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.jude.rollviewpager.hintview.IconHintView;
import com.lingqiapp.Activity.MainActivity;
import com.lingqiapp.R;
import com.lingqiapp.Utils.DensityUtils;
import java.util.ArrayList;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * com.wenguoyi.Adapter
 *
 * @author 赵磊
 * @date 2018/5/15
 * 功能描述：首页商品列表适配器，包括了头部，轮播，和列表
 */
public class HomeListAdapter extends RecyclerView.Adapter<HomeListAdapter.ViewHolder> {

    private MainActivity mContext;
    // private HomeBean homeBean;

    private ArrayList<String> datas = new ArrayList();
    private ArrayList<String> titleList = new ArrayList<String>();

    public ArrayList<String> getDatas() {
        return datas;
    }

    public HomeListAdapter(MainActivity context
                           //        , HomeBean homeBean
    ) {
        this.mContext = context;
        //   this.homeBean = homeBean;
    }

    public void setDatas(ArrayList<String> datas) {
        this.datas.addAll(datas);
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return 1;
        } else {
            return 2;
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == 1) {
            View view = LayoutInflater.from(mContext).inflate(R.layout.home_head_layout, parent, false);
            ViewHolder vp = new ViewHolder(view);
            return vp;
        } else {
            View view = LayoutInflater.from(mContext).inflate(R.layout.item_home_shop_layout, parent, false);
            ViewHolder vp = new ViewHolder(view);
            return vp;
        }
    }

    private boolean isfirst = false;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        if (position == 0) {
            if (!isfirst) {
                //轮播图设置
                holder.RollPagerView.setHintView(new IconHintView(mContext, R.drawable.shape_selected, R.drawable.shape_noraml, DensityUtils.dp2px(mContext, mContext.getResources().getDimension(R.dimen.x7))));
                holder.RollPagerView.setPlayDelay(3000);
                holder.RollPagerView.setAdapter(new LoopAdapter(holder.RollPagerView));
                holder.simNow.setImageURI("https://ss3.baidu.com/-fo3dSag_xI4khGko9WTAnF6hhy/image/h%3D300/sign=06023fafd82a28345ca6300b6bb4c92e/e61190ef76c6a7efa8408794f1faaf51f3de6619.jpg");
                holder.sim1.setImageURI("https://ss3.baidu.com/-fo3dSag_xI4khGko9WTAnF6hhy/image/h%3D300/sign=06023fafd82a28345ca6300b6bb4c92e/e61190ef76c6a7efa8408794f1faaf51f3de6619.jpg");
                holder.sim2.setImageURI("https://ss3.baidu.com/-fo3dSag_xI4khGko9WTAnF6hhy/image/h%3D300/sign=06023fafd82a28345ca6300b6bb4c92e/e61190ef76c6a7efa8408794f1faaf51f3de6619.jpg");
                holder.sim3.setImageURI("https://ss3.baidu.com/-fo3dSag_xI4khGko9WTAnF6hhy/image/h%3D300/sign=06023fafd82a28345ca6300b6bb4c92e/e61190ef76c6a7efa8408794f1faaf51f3de6619.jpg");
                holder.sim4.setImageURI("https://ss3.baidu.com/-fo3dSag_xI4khGko9WTAnF6hhy/image/h%3D300/sign=06023fafd82a28345ca6300b6bb4c92e/e61190ef76c6a7efa8408794f1faaf51f3de6619.jpg");
                holder.sim5.setImageURI("https://ss3.baidu.com/-fo3dSag_xI4khGko9WTAnF6hhy/image/h%3D300/sign=06023fafd82a28345ca6300b6bb4c92e/e61190ef76c6a7efa8408794f1faaf51f3de6619.jpg");
                holder.sim6.setImageURI("https://ss3.baidu.com/-fo3dSag_xI4khGko9WTAnF6hhy/image/h%3D300/sign=06023fafd82a28345ca6300b6bb4c92e/e61190ef76c6a7efa8408794f1faaf51f3de6619.jpg");
                isfirst = !isfirst;
            }
        } else {
            holder.simShopimg.setImageURI("https://ss3.baidu.com/-fo3dSag_xI4khGko9WTAnF6hhy/image/h%3D300/sign=06023fafd82a28345ca6300b6bb4c92e/e61190ef76c6a7efa8408794f1faaf51f3de6619.jpg");
        }
    }

    @Override
    public int getItemCount() {
        return 11;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        @Nullable
        @BindView(R.id.RollPagerView)
        com.jude.rollviewpager.RollPagerView RollPagerView;
        @Nullable
        @BindView(R.id.sim_now)
        SimpleDraweeView simNow;
        @Nullable
        @BindView(R.id.sim_1)
        SimpleDraweeView sim1;
        @Nullable
        @BindView(R.id.sim_2)
        SimpleDraweeView sim2;
        @Nullable
        @BindView(R.id.sim_3)
        SimpleDraweeView sim3;
        @Nullable
        @BindView(R.id.sim_4)
        SimpleDraweeView sim4;
        @Nullable
        @BindView(R.id.sim_5)
        SimpleDraweeView sim5;
        @Nullable
        @BindView(R.id.sim_6)
        SimpleDraweeView sim6;

        @Nullable
        @BindView(R.id.sim_shopimg)
        SimpleDraweeView simShopimg;
        @Nullable
        @BindView(R.id.tv_shoptitle)
        TextView tvShoptitle;
        @Nullable
        @BindView(R.id.tv_shopmoney)
        TextView tvShopmoney;
        @Nullable
        @BindView(R.id.btn_feelvip)
        Button btnFeelvip;
        @Nullable
        @BindView(R.id.tv_shopnum)
        TextView tvShopnum;
        @Nullable
        @BindView(R.id.btn_buy)
        Button btnBuy;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

}
