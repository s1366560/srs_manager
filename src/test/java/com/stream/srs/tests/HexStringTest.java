package com.stream.srs.tests;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HexStringTest {


    @Test
    public void intToHex() {


        assertEquals("ffffffffffff", toHex(1530));

        assertEquals("ffff14",toHex(530));


    }


    public String toHex(int x) {

        int num = x / 255;
        int low = x % 255;

        StringBuffer buffer = new StringBuffer();


        for (int i = 0; i < num; i++) {
            buffer.append("ff");
        }
        if (low != 0)
            buffer.append(String.format("%02x", low));

        return buffer.toString();


    }

}
