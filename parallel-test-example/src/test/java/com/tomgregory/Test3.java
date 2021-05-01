package com.tomgregory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test3 {
    @Test
    public void verifyingJavaDivisionActuallyWorks() throws InterruptedException {
        Thread.sleep(3000);
        assertEquals( 5, 10 / 2 );
    }
}
