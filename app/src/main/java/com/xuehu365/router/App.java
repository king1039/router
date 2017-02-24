package com.xuehu365.router;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.init(this);
        ARouter.openLog();
        ARouter.openDebug();
    }
}
