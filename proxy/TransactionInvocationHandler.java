package com.ph0ly.designpatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author pholy.ht
 * @time 2015-12-13
 */
public class TransactionInvocationHandler implements InvocationHandler {

    private Object target;

    public TransactionInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        TransactionManager transactionManager = new PlatformTransactionManager();
        transactionManager.beginTx();
        Object result = method.invoke(target, args);
        transactionManager.endTx();
        return result;
    }
}
