package com.coolweather.android.base;

import android.app.Application;

import org.litepal.LitePal;

/**
 * @author gton
 * @date 2020/7/17
 * @sub
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
    }
}
