package com.lingqiapp.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.lingqiapp.Base.BaseActivity;
import com.lingqiapp.R;
import com.lingqiapp.Utils.SpUtil;
import com.lingqiapp.Utils.UrlUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * com.lingqiapp.Activity
 *
 * @author 赵磊
 * @date 2018/9/19
 * 功能描述：
 */
public class HuiYuanShengJiActivity extends BaseActivity {
    @BindView(R.id.rl_back)
    FrameLayout rlBack;
    @BindView(R.id.tv_Title)
    TextView tvTitle;
    @BindView(R.id.SimpleDraweeView)
    com.facebook.drawee.view.SimpleDraweeView SimpleDraweeView;
    @BindView(R.id.tv_username)
    TextView tvUsername;
    @BindView(R.id.tv_content)
    TextView tvContent;
    @BindView(R.id.tv_lv1)
    TextView tvLv1;
    @BindView(R.id.tv_lv2)
    TextView tvLv2;
    @BindView(R.id.tv_lv3)
    TextView tvLv3;
    @BindView(R.id.tv_msg_content)
    TextView tvMsgContent;

    @Override
    protected int setthislayout() {
        return R.layout.activity_huiyuanshengji_layout;
    }

    @Override
    protected void initview() {
        SimpleDraweeView.setImageURI(UrlUtils.URL + String.valueOf(SpUtil.get(context, "img", "")));
        tvUsername.setText(String.valueOf(SpUtil.get(context, "username", "")));

        if ("1".equals(String.valueOf(SpUtil.get(context, "lv", "1")))) {
            tvContent.setText("您还不是领七商城会员\n开通会员，立享权益");
        } else {
            tvContent.setText("尊敬的领七商城会员\n续费会员，续享权益");
        }

    }

    @Override
    protected void initListener() {
        rlBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
