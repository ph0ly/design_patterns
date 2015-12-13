package com.ph0ly.designpatterns.proxy;

/**
 * @author pholy.ht
 * @time 2015-12-13
 */
public class ProxyTest {

    public static void main(String[] args) {
        IComputer source = new Notebook();
        IComputer computer = ProxyFactory.getProxy(source);
        computer.on();
        computer.off();
    }

}
