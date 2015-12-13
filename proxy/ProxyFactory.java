package com.ph0ly.designpatterns.proxy;

import java.lang.reflect.Proxy;

/**
 * @author pholy.ht
 * @time 2015-12-13
 */
public class ProxyFactory {

    public static <T> T getProxy(T target) throws IllegalArgumentException {
        TransactionInvocationHandler transactionInvocationHandler = new TransactionInvocationHandler(target);
        return (T)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), transactionInvocationHandler);
    }

}
