package com.ph0ly.designpatterns.factory.abstract_factory;

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
