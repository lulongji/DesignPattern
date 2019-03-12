package com.lu.pattern.proxy;

/**
 * Created by lu on 2019/3/12.
 */
public class BuyProxy implements BuyCar {


    private BuyCar buyCar;


    public BuyProxy(final BuyCar buyCar) {
        this.buyCar = buyCar;
    }

    @Override
    public void buyPorsche() {
        System.out.println("买之前！------------攒钱");

        buyCar.buyPorsche();

        System.out.println("买之后！------------还贷");
    }
}
