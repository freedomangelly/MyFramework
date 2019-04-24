package com.joke.pay;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by hcDarren on 2017/9/10.
 * 这个类是用来处理微信支付的一些业务逻辑的，微信回调的Activity
 */
public class BaseWXPayActivity extends WXPayActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}
