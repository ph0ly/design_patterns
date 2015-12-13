package com.ph0ly.dp.decorators;

/**
 * @author ph0ly
 * @time 2015-07-05
 * 设计模式 - 装饰器模式
 * 对目标对象进行包装，不改变或扩展原有对象接口
 *
 *  1) 持有对象引用
 *  2) 实现目标对象类或接口
 *
 */
public class DecoratorsMain {

    public static void main(String[] args) throws Exception{
        MyInputStream myInputStream = new MyBufferedInputStream(new MyFileInputStream());
        byte[] buf = new byte[14];
        int len = myInputStream.read(buf);
        System.out.println(new String(buf, "utf-8"));

    }

}
