package com.android.myframework.okhttp.architect_day25.okhttp;

/**
 * Created by hcDarren on 2017/11/18.
 * Call
 */

public interface Call {
    void enqueue(Callback callback);

    Response execute();
}
