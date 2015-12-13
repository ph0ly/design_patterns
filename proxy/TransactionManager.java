package com.ph0ly.designpatterns.proxy;

/**
 * @author pholy.ht
 * @time 2015-12-13
 */
public interface TransactionManager {

    void beginTx();

    void endTx();

}
