package com.iit.oodp;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class TigerTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    Tiger tiger;

    @Before
    public void setUp() {
        tiger = new Tiger("Cheetah");
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testTigerName() {
        assertEquals("Cheetah", tiger.getName());
    }

    @Test
    public void testLastAte() {
        Thing book = new Thing("Fox");
        tiger.eat(book);
        assertEquals("Thing{name='Fox'}", tiger.lastAte.toString());
    }

    @Test
    public void testEat() {
        Thing book = new Thing("Fox");
        tiger.eat(book);
        assertEquals("Cheetah has just eaten a Fox.", outputStreamCaptor.toString()
                .trim());

    }

    @Test
    public void testNothingAte(){
        tiger.whatDidYouEat();
        assertEquals("Cheetah Tiger has had nothing to eat!", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    public void testAte(){
        Thing fox = new Thing("Fox");
        tiger.lastAte = fox;
        tiger.whatDidYouEat();
        assertEquals("Cheetah Tiger has eaten a Fox!", outputStreamCaptor.toString()
                .trim());

    }

    @Test
    public void testMove() {
        tiger.move();
        assertEquals("Cheetah Tiger has just pounced.", outputStreamCaptor.toString()
                .trim());
    }
}
