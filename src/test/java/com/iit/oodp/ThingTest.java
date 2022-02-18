package com.iit.oodp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ThingTest {

    @Test
    public void testThing() {
        Thing thing = new Thing("fan");
        assertEquals("Thing{name='fan'}", thing.toString());
    }

}
