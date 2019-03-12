package com.lu.pattern.proxy;


import com.lu.pattern.proxy.impl.BuyCarImpl;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * Created by lu on 2019/3/12.
 */
public class ProxyTest {


    @Test
    public void BuyProxyTest() {
        BuyCar buyCar = new BuyCarImpl();

        buyCar.buyPorsche();

        BuyProxy buyProxy = new BuyProxy(buyCar);

        buyProxy.buyPorsche();

    }

    @Test
    public void DyBuyProxyTest() {

        BuyCar buyCar = new BuyCarImpl();

        BuyCar proxyBuyCar = (BuyCar) Proxy.newProxyInstance(BuyCar.class.getClassLoader(), new Class[]{BuyCar.class}, new DynamicProxyHandler(buyCar));

        proxyBuyCar.buyPorsche();

    }

}
