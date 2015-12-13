package com.ph0ly.dp.decorators;

/**
 * @author ph0ly
 * @time 2015-07-05
 */
public class MyBufferedInputStream implements MyInputStream {

    private MyInputStream in = null;

    public MyBufferedInputStream(MyInputStream inputStream) {
        this.in = inputStream;
    }

    @Override
    public int read(byte[] buf) {
        this.in.read(buf);

        for (int i=0; i<buf.length; i++) {
            buf[i] += 0x01;
        }

        return buf.length;
    }
}
