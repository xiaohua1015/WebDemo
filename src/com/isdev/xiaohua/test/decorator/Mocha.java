package com.isdev.xiaohua.test.decorator;

import com.isdev.xiaohua.test.decorator.base.Beverage;

/**
 * Created by lsh134667 on 2018/6/28.
 */
public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + ",with mocha";
    }

    @Override
    public double cost() {
        return super.cost() + 2.0;
    }
}
