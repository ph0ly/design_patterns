package com.ph0ly.designpatterns.factory.simple_factory;

/**
 * @author pholy.ht
 * @time 2015-12-13
 */
public class Desktop implements IComputer {

    @Override
    public void on() {
        System.out.println("desktop on...");
    }

    @Override
    public void off() {
        System.out.println("desktop off...");
    }
}
