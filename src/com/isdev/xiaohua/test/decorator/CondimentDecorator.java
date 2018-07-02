package com.isdev.xiaohua.test.decorator;

import com.isdev.xiaohua.test.decorator.base.Beverage;

/**
 * Created by lsh134667 on 2018/6/28.
 */
public class CondimentDecorator implements Beverage {
    private Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc();
    }

    @Override
    public double cost() {
        return beverage.cost();
    }
}
