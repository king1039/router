package com.xuehu365.router;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;

@Route(path = "/test/activity2")
public class Test2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        ((TextView) findViewById(R.id.test)).setText("I am " + this.getClass().getName());

    }
}
