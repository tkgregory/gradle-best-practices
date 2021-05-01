package com.tomgregory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test1 {
    @Test
    public void newMathTheorem() throws InterruptedException {
        Thread.sleep(3000);
        assertEquals( 6, 2 * 3 );
    }
}
