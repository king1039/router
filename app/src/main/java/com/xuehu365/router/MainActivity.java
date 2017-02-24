package com.xuehu365.router;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.webkit.WebView;

import com.alibaba.android.arouter.facade.annotation.Route;

@Route(path = "/test/webview")
public class MainActivity extends AppCompatActivity {
    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webview = (WebView) findViewById(R.id.webview);

        //默认加载schame-test.html。SchameFilterActivity跳转页面失败会打开baidu
        String url = getIntent().getStringExtra("url");
        if (TextUtils.isEmpty(url)) {
            url = "file:///android_asset/schame-test.html";
        }
        webview.loadUrl(url);

//        ARouter.getInstance().build("/test/activity1")
//                .withString("name","li")
//                .withInt("age",18)
//                .withBoolean("girl",true)
//                .navigation();
    }
}
