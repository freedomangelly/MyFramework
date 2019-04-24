package com.android.myframework.butterKnife.architect_day06;

import android.app.Application;

import com.joke.pay.BaseWXPayActivity;

import joke.annotations.WXPayEntry;

/**
 * Created by hcDarren on 2017/9/10.
 */
@WXPayEntry(packageName = "com.darren.architect_day06",
        entryClass = BaseWXPayActivity.class)
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

    }
}
