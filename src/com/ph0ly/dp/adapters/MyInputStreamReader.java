package com.ph0ly.dp.adapters;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/**
 * @author ph0ly
 * @time 2015-07-05
 */
public class MyInputStreamReader implements MyReader  {

    private MyInputStream in = null;

    public MyInputStreamReader(MyInputStream inputStream) {
        this.in = inputStream;
    }

    @Override
    public int read(char[] buf) {
        byte[] buffer = new byte[buf.length];
        int len = in.read(buffer);
        ByteBuffer bb = ByteBuffer.wrap(buffer);
        CharBuffer cb = Charset.forName("utf-8").decode(bb);

        char[] bufs = cb.array();
        for (int i=0; i<len; i++) {
            buf[i] = bufs[i];
        }

        return len;
    }
}
