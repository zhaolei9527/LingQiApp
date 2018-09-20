package com.lingqiapp.Activity;

import android.Manifest;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.lingqiapp.Base.BaseActivity;
import com.lingqiapp.Fragment.HomeFragment;
import com.lingqiapp.Fragment.KeFuFragment;
import com.lingqiapp.Fragment.MeFragment;
import com.lingqiapp.Fragment.NewsFragment;
import com.lingqiapp.R;
import com.lingqiapp.Utils.EasyToast;
import com.lingqiapp.Utils.SpUtil;
import com.lingqiapp.View.CustomViewPager;
import com.mylhyl.acp.Acp;
import com.mylhyl.acp.AcpListener;
import com.mylhyl.acp.AcpOptions;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import sakura.bottomtabbar.BottomTabBar;

public class MainActivity extends BaseActivity {

    @BindView(R.id.fl_content)
    CustomViewPager flContent;
    @BindView(R.id.BottomTabBar)
    sakura.bottomtabbar.BottomTabBar BottomTabBar;
    @BindView(R.id.tv_Cartnum)
    TextView tvCartnum;

    @Override
    protected int setthislayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initview() {
        Acp.getInstance(this).request(new AcpOptions.Builder()
                        .setPermissions(Manifest.permission.WRITE_EXTERNAL_STORAGE
                                , Manifest.permission.READ_EXTERNAL_STORAGE
                                , Manifest.permission.CAMERA)
                        .setDeniedMessage(getString(R.string.requstPerminssions))
                        .build(),
                new AcpListener() {
                    @Override
                    public void onGranted() {
                        try {
                            // 从API11开始android推荐使用android.content.ClipboardManager
                            // 为了兼容低版本我们这里使用旧版的android.text.ClipboardManager，虽然提示deprecated，但不影响使用。
                            ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                            // 将文本内容放到系统剪贴板里。
                            cm.setText("支付宝发红包啦！人人可领，天天可领！长按复制此消息，打开支付宝领红包！VavJvm63sZ");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onDenied(List<String> permissions) {
                        Toast.makeText(MainActivity.this, R.string.Thepermissionapplicationisrejected, Toast.LENGTH_SHORT).show();
                    }
                });
        final ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new NewsFragment());
        fragments.add(new HomeFragment());
        fragments.add(new KeFuFragment());
        fragments.add(new MeFragment());
        CustomViewPager viewpager = (CustomViewPager) findViewById(R.id.fl_content);
        viewpager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public int getCount() {
                return fragments.size();
            }

            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }
        });
        ((BottomTabBar) findViewById(R.id.BottomTabBar)).setPadding(0, 0, 0, 0);
        ((BottomTabBar) findViewById(R.id.BottomTabBar))
                .initFragmentorViewPager(viewpager)
                .setImgSize(getResources().getDimension(R.dimen.x19), getResources().getDimension(R.dimen.y16))
                .setChangeColor(getResources().getColor(R.color.bgtitle), getResources().getColor(R.color.text666))
                .setDividerHeight(3)
                .isShowDivider(true)
                .setFontSize(12)
                .setDividerColor(getResources().getColor(R.color.bgea))
                .addTabItem("首页", getResources().getDrawable(R.mipmap.bot01_after), getResources().getDrawable(R.mipmap.bot01_before))
                .addTabItem("达人推荐", getResources().getDrawable(R.mipmap.bot02_after), getResources().getDrawable(R.mipmap.bot02_before))
                .addTabItem("购物车", getResources().getDrawable(R.mipmap.bot03_after), getResources().getDrawable(R.mipmap.bot03_before))
                .addTabItem("客服", getResources().getDrawable(R.mipmap.bot04_after), getResources().getDrawable(R.mipmap.bot04_before))
                .addTabItem("个人中心", getResources().getDrawable(R.mipmap.bot05_after), getResources().getDrawable(R.mipmap.bot05_before))
                .setOnTabChangeListener(new BottomTabBar.OnTabChangeListener() {
                    @Override
                    public void onTabChange(int position, View view) {
                        if (position == 3 || position == 4) {
                            if (TextUtils.isEmpty((String) SpUtil.get(MainActivity.this, "uid", ""))) {
                                EasyToast.showShort(MainActivity.this, "请先登录");
                                finish();
                                startActivity(new Intent(MainActivity.this, LoginActivity.class));
                            }
                        }
                        if (!TextUtils.isEmpty((String) SpUtil.get(MainActivity.this, "uid", ""))) {
                            // indexCatr();
                        }

                    }
                })
                .commit();
    }

    @Override
    protected void initListener() {

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
