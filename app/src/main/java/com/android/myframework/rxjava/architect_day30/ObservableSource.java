package com.android.myframework.rxjava.architect_day30;

/**
 * Created by hcDarren on 2017/12/2.
 */

public interface ObservableSource<T> {
    void subscribe(Observer<T> observer);
}