package com.ph0ly.designpatterns.factory.simple_factory;

/**
 * @author pholy.ht
 * @time 2015-12-13
 */
public class Notebook implements IComputer {

    @Override
    public void on() {
        System.out.println("notebook on...");
    }

    @Override
    public void off() {
        System.out.println("notebook off...");
    }
}
