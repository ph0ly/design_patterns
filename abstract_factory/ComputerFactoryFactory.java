package com.ph0ly.designpatterns.factory.abstract_factory;

/**
 * @author pholy.ht
 * @time 2015-12-13
 */
public class ComputerFactoryFactory {

    public static IComputerFactory getComputerFactory(ComputerFactoryType type) {
        switch (type) {
            case DESKTOP_FACTORY:
                return new DesktopFactory();
            case NOTEBOOK_FACTORY:
                return new NotebookFactory();
            default:
                throw new RuntimeException("unknown type of computer factory");
        }
    }
}
