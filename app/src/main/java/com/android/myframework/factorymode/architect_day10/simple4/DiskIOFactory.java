package com.android.myframework.factorymode.architect_day10.simple4;

/**
 * Created by hcDarren on 2017/9/24.
 */

public class DiskIOFactory implements IOFactory{
    @Override
    public IOHandler createIOHandler() {
        return new DiskIOHandler();
    }
}
