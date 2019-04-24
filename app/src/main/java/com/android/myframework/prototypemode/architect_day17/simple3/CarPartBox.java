package com.android.myframework.prototypemode.architect_day17.simple3;

/**
 * Created by hcDarren on 2017/10/21.
 * 具体的出货的物品 - 汽车的零件
 */

public class CarPartBox extends IBox {
    private int number;
    private String name;
    private String carBrand;// 汽车的品牌
    @Override
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
}
