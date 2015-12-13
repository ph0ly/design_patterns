package com.ph0ly.designpatterns.factory.simple_factory;

/**
 * @author pholy.ht
 * @time 2015-12-13
 */
public class SimpleFactory {

    public static IComputer getComputer(ComputerType type) {
        switch (type) {
            case NOTEBOOK:
                return new Notebook();
            case DESKTOP:
                return new Desktop();
            default:
                throw new RuntimeException("unknown type of computer");
        }
    }

}
