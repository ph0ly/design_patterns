package com.ph0ly.dp.adapters;

/**
 * @author ph0ly
 * @time 2015-07-05
 *
 * 设计模式 - 适配器模式
 * 该模式是将源对象转成目标类或接口对象
 *  1) 持有源对象的引用
 *  2) 实现目标类的接口或者继承类
 */
public class AdaptersMain {

    public static void main(String[] args) {
        
        MyInputStream myInputStream = new MyFileInputStream();
        MyReader myReader = new MyInputStreamReader(myInputStream);
        char[] buf = new char[12];
        int len = myReader.read(buf);

        System.out.println(len);
        for (int i=0; i<len; i++) {
            System.out.print(buf[i]);
        }

    }

}
