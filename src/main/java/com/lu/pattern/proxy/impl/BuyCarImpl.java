package com.lu.pattern.proxy.impl;

import com.lu.pattern.proxy.BuyCar;

/**
 * Created by lu on 2019/3/12.
 */
public class BuyCarImpl implements BuyCar {


    @Override
    public void buyPorsche() {
        System.out.println("买了一台保时捷！");
    }
}
