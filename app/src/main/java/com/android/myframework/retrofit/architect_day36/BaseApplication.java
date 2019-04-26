package com.android.myframework.retrofit.architect_day36;

import android.app.Application;

import com.darren.architect_day01.simple5.PreferencesUtil;
import com.darren.architect_day01.simple7.HttpUtils;
import com.darren.architect_day01.simple6.RetrofitRequest;
import com.darren.architect_day01.simple7.EngineConfig;

import org.xutils.x;

/**
 * description:
 * author: Darren on 2017/8/21 15:05
 * email: 240336124@qq.com
 * version: 1.0
 */
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        PreferencesUtil.getInstance().init(this);
        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG); // 是否输出debug日志, 开启debug会影响性能.

        // 配置上层 配置
        EngineConfig config = new EngineConfig.Builder()
                .engineRequest(new RetrofitRequest())
                // 添加一个解析工厂 Gson Xml
                .converter(new GsonConvert())
                // 添加默认参数 platform = android
                .builder();
        HttpUtils.initConfig(config);
    }
}
