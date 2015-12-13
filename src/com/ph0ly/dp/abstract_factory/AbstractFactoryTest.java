package com.ph0ly.designpatterns.factory.abstract_factory;

/**
 * @author pholy.ht
 * @time 2015-12-13
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        IComputerFactory computerFactory = ComputerFactoryFactory.getComputerFactory(ComputerFactoryType.DESKTOP_FACTORY);
        IComputer computer = computerFactory.getComputer();
        computer.on();
        computer.off();

        System.out.println("====================");

        computerFactory = ComputerFactoryFactory.getComputerFactory(ComputerFactoryType.NOTEBOOK_FACTORY);
        computer = computerFactory.getComputer();
        computer.on();
        computer.off();

    }

}
