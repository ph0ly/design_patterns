package com.ph0ly.designpatterns.factory.factory_method;

/**
 * @author pholy.ht
 * @time 2015-12-13
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        IComputerFactory computerFactory = new NotebookFactory();
        IComputer computer = computerFactory.getComputer();
        computer.on();
        computer.off();

        System.out.println("====================");
        computerFactory = new DesktopFactory();
        computer = computerFactory.getComputer();
        computer.on();
        computer.off();

    }

}
