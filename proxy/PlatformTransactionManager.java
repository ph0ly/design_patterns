package com.ph0ly.designpatterns.proxy;

/**
 * @author pholy.ht
 * @time 2015-12-13
 */
public class PlatformTransactionManager implements TransactionManager {

    @Override
    public void beginTx() {
        System.out.println("Begin transaction...");
    }

    @Override
    public void endTx() {
        System.out.println("End transaction...");
    }

}
