package com.android.myframework.rxjava.architect_day30;

/**
 * Created by hcDarren on 2017/12/3.
 */

public interface Function<T,R> {
    R apply(T t) throws Exception;
}
