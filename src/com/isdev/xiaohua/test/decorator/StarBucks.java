package com.isdev.xiaohua.test.decorator;

import com.isdev.xiaohua.test.decorator.base.Beverage;
import com.isdev.xiaohua.test.decorator.base.HouseBlend;

/**
 * Created by lsh134667 on 2018/6/28.
 */
public class StarBucks {

    public static void main(String[] args) {
        Beverage beverage = new Mocha(new Milk(new Mocha(new HouseBlend())));
        System.out.println(beverage.getDesc() + ": " + beverage.cost());
    }
}
