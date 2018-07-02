package com.isdev.xiaohua.test.decorator.base;

/**
 * Created by lsh134667 on 2018/6/28.
 */
public class HouseBlend implements Beverage {
    @Override
    public String getDesc() {
        String desc = "House Blend coffee";
        return desc;
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
