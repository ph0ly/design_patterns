package com.ph0ly.dp.decorators;

/**
 * @author ph0ly
 * @time 2015-07-05
 */
public class MyFileInputStream implements MyInputStream {

    @Override
    public int read(byte[] buf) {
        for (int i=0; i<buf.length; i++) {
            buf[i] = 0x38;
        }
        return buf.length;
    }
}
