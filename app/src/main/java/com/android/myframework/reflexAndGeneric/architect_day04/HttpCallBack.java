package com.android.myframework.reflexAndGeneric.architect_day04;

/**
 * Created by hcDarren on 2017/9/4.
 */

public abstract class HttpCallBack<T> {

    public abstract void onSuccess(T result);
}
