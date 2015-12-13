package com.ph0ly.designpatterns.proxy;

/**
 * @author pholy.ht
 * @time 2015-12-13
 */
public class Notebook implements IComputer {

    @Override
    public void on() {
        System.out.println("Notebook on...");
    }

    @Override
    public void off() {
        System.out.println("Notebook off...");
    }
}
