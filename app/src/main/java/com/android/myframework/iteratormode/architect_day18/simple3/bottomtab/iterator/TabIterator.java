package com.android.myframework.iteratormode.architect_day18.simple3.bottomtab.iterator;

import com.android.myframework.iteratormode.architect_day18.simple3.bottomtab.BottomTabItem;

/**
 * Created by hcDarren on 2017/10/22.
 */

public interface TabIterator {
    BottomTabItem next();

    boolean hashNext();
}
