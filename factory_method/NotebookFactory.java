package com.ph0ly.designpatterns.factory.factory_method;

/**
 * @author pholy.ht
 * @time 2015-12-13
 */
public class NotebookFactory implements IComputerFactory {

    @Override
    public IComputer getComputer() {
        return new Notebook();
    }
}
