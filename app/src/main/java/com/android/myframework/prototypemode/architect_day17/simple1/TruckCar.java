package com.android.myframework.prototypemode.architect_day17.simple1;

/**
 * Created by hcDarren on 2017/10/21.
 * 装箱子的卡车
 */

public class TruckCar {
    public IBox box;

    public void addBox(IBox box){
        this.box = box;
    }

    public IBox remove(){
        return box;
    }
}
