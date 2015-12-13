package com.ph0ly.designpatterns.factory.simple_factory;

/**
 * @author pholy.ht
 * @time 2015-12-13
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        IComputer computer = SimpleFactory.getComputer(ComputerType.DESKTOP);
        computer.on();
        computer.off();

        System.out.println("=====================");
        computer = SimpleFactory.getComputer(ComputerType.NOTEBOOK);
        computer.on();
        computer.off();

    }

}
