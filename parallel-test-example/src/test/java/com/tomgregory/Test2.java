package com.tomgregory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test2 {
    @Test
    public void complexAlgebra() throws InterruptedException {
        Thread.sleep(3000);
        assertEquals( 3, 6 - 3 );
    }
}
