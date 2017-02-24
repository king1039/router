package com.xuehu365.router;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * https://m.aliyun.com/test/activity1?name=老王&age=23&boy=true&high=180
 */
@Route(path = "/test/activity1")
public class Test1Activity extends AppCompatActivity {

    @Autowired
    String name;

    @Autowired
    int age;

    @Autowired(name = "boy")
    boolean girl;

    @Autowired
    long high;

    @Autowired
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        ARouter.getInstance().inject(this);

        // No more getter ...
        // name = getIntent().getStringExtra("name");
        // age = getIntent().getIntExtra("age", 0);
        // girl = getIntent().getBooleanExtra("girl", false);
        // high = getIntent().getLongExtra("high", 0);
        // url = getIntent().getStringExtra("url");

        String params = String.format("name=%s, age=%s, girl=%s, high=%s, url=%s", name, age, girl, high, url);

        ((TextView)findViewById(R.id.test)).setText("I am " + this.getClass().getName());
        ((TextView)findViewById(R.id.test2)).setText(params);
    }
}
