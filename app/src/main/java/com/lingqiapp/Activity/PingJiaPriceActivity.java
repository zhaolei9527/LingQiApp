package com.lingqiapp.Activity;

import android.Manifest;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.hss01248.frescopicker.FrescoIniter;
import com.lingqiapp.App;
import com.lingqiapp.Base.BaseActivity;
import com.lingqiapp.R;
import com.lingqiapp.Utils.EasyToast;
import com.lingqiapp.Utils.Utils;
import com.mylhyl.acp.Acp;
import com.mylhyl.acp.AcpListener;
import com.mylhyl.acp.AcpOptions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.iwf.photopicker.PhotoPickUtils;
import me.iwf.photopicker.widget.MultiPickResultView;

public class PingJiaPriceActivity extends BaseActivity implements View.OnClickListener {

    @BindView(R.id.rl_back)
    FrameLayout rlBack;
    @BindView(R.id.SimpleDraweeView)
    com.facebook.drawee.view.SimpleDraweeView SimpleDraweeView;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.img_1)
    ImageView img1;
    @BindView(R.id.img_2)
    ImageView img2;
    @BindView(R.id.img_3)
    ImageView img3;
    @BindView(R.id.img_4)
    ImageView img4;
    @BindView(R.id.img_5)
    ImageView img5;
    @BindView(R.id.editText)
    EditText editText;
    @BindView(R.id.recycler_view)
    MultiPickResultView recyclerView;
    @BindView(R.id.btn_submit)
    Button btnSubmit;
    private String id;
    private String img;
    private String title;
    private Dialog dialog;
    private ArrayList<String> imgpath = new ArrayList<>();

    /**
     * 删除文件夹以及目录下的文件
     *
     * @param pPath 被删除目录的文件路径
     * @return 目录删除成功返回true，否则返回false
     */
    public void deleteDir(final String pPath) {
        File dir = new File(pPath);
        deleteDirWihtFile(dir);
    }

    public void deleteDirWihtFile(final File dir) {
        new Thread() {
            @Override
            public void run() {
                super.run();
                if (dir == null || !dir.exists() || !dir.isDirectory()) {
                    return;
                }
                for (File file : dir.listFiles()) {
                    if (file.isFile()) {
                        file.delete(); // 删除所有文件
                    } else if (file.isDirectory()) {
                        deleteDirWihtFile(file); // 递规的方式删除文件夹
                    }
                }
                dir.delete();// 删除目录本身
            }
        }.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        App.getQueues().cancelAll("order/retreat");
        App.getQueues().cancelAll("order/doretreat");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //onActivityResult里一行代码回调
        recyclerView.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected int setthislayout() {
        return R.layout.activity_submit_pingjia_price;
    }

    @Override
    protected void initview() {
        recyclerView = (MultiPickResultView) findViewById(R.id.recycler_view);
        recyclerView.init(this, MultiPickResultView.ACTION_SELECT, null);
        id = getIntent().getStringExtra("id");
        img = getIntent().getStringExtra("img");
        title = getIntent().getStringExtra("title");

        Acp.getInstance(context).request(new AcpOptions.Builder()
                        .setPermissions(Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE)
                        .setDeniedMessage(getString(R.string.requstPerminssions))
                        .build(),
                new AcpListener() {
                    @Override
                    public void onGranted() {
                        PhotoPickUtils.init(getApplicationContext(), new FrescoIniter());//第二个参数根据具体依赖库而定
                    }

                    @Override
                    public void onDenied(List<String> permissions) {
                        Toast.makeText(context, R.string.Thepermissionapplicationisrejected, Toast.LENGTH_SHORT).show();
                    }
                });
    }

    @Override
    protected void initListener() {
        rlBack.setOnClickListener(this);
        btnSubmit.setOnClickListener(this);

    }

    @Override
    protected void initData() {
        if (Utils.isConnected(context)) {
            dialog = Utils.showLoadingDialog(context);
        } else {
            EasyToast.showShort(context, "网络未连接");
            finish();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rl_back:
                finish();
                break;
            case R.id.btn_submit:
                submit();
                break;
            default:
                break;
        }
    }

    /**
     * 提交退换货
     */
    private void submit() {
        final ArrayList<String> photos = recyclerView.getPhotos();
        Log.e("SubmitReturnPriceActivi", photos.toString());

        ArrayList<File> datas = new ArrayList<>();

        for (int i = 0; i < photos.size(); i++) {
            File file = new File(Environment.getExternalStorageDirectory().getPath() + "/ScreenCapture/" + i + ".png");
            datas.add(file);
        }

        if (!datas.isEmpty()) {
            dialog.show();


        } else {
            EasyToast.showShort(context, "请选择图片");
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
