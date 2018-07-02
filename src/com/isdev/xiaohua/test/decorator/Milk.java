package com.isdev.xiaohua.test.decorator;

import com.isdev.xiaohua.test.decorator.base.Beverage;

/**
 * Created by lsh134667 on 2018/6/28.
 */
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + ",with milk";
    }

    @Override
    public double cost() {
        return super.cost() + 1.2;
    }
}
