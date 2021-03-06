package com.android.myframework.iteratormode.architect_day18.simple2.iterator;

/**
 * Created by hcDarren on 2017/10/22.
 * 迭代器的接口
 */
public interface Iterator<T> {
    /**
     * 获取下一个
     * @return
     */
    T next();

    /**
     * 是否有下一个
     * @return
     */
    boolean hasNext();
}
