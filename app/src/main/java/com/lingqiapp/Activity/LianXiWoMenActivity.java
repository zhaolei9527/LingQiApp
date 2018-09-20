package com.lingqiapp.Activity;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.VolleyError;
import com.lingqiapp.App;
import com.lingqiapp.Base.BaseActivity;
import com.lingqiapp.R;
import com.lingqiapp.Utils.UrlUtils;
import com.lingqiapp.Volley.VolleyInterface;
import com.lingqiapp.Volley.VolleyRequest;

import java.util.HashMap;

import butterknife.ButterKnife;

/**
 * com.sakuraphonebtc.Activity
 *
 * @author 赵磊
 * @date 2018/3/31
 * 功能描述：
 */
public class LianXiWoMenActivity extends BaseActivity {

    @Override
    protected int setthislayout() {
        return R.layout.activity_lianxiwomen_layout;
    }

    @Override
    protected void initview() {

    }

    @Override
    protected void initListener() {
    }

    @Override
    protected void initData() {
    }

    /**
     * 新闻内容获取
     */
    private void getNews(final String id) {
        HashMap<String, String> params = new HashMap<>(1);
        params.put("pwd", UrlUtils.KEY);
        params.put("id", id);
        VolleyRequest.RequestPost(context, UrlUtils.BASE_URL + "news/detail", "news/detail", params, new VolleyInterface(context) {
            @Override
            public void onMySuccess(String result) {
                Log.e("NewsDetailsActivity", result);
                try {
                    result = null;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onMyError(VolleyError error) {
                error.printStackTrace();
            }
        });
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        App.getQueues().cancelAll("news/detail");
        System.gc();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
