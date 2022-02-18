package com.iit.oodp;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BatTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    Bat bat;

    @Before
    public void setUp() {
        bat = new Bat("Robin");
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testBatName() {
        assertEquals("Robin", bat.getName());
    }

    @Test
    public void testEatThing() {
        Thing table = new Thing("Table");
        bat.eat(table);
        assertEquals("Robin Bat wont eat a Thing{name='Table'}.", outputStreamCaptor.toString()
                .trim());

    }

    @Test
    public void testEatCreature(){
        Tiger t = new Tiger("Jojo");
        bat.eat(t);
        assertEquals("Robin has just eaten a Jojo.", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    public void testNothingAte(){
        bat.whatDidYouEat();
        assertEquals("Robin Bat has had nothing to eat!", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    public void testAte(){
        Thing fox = new Thing("Fox");
        bat.lastAte = fox;
        bat.whatDidYouEat();
        assertEquals("Robin Bat has eaten a Fox!", outputStreamCaptor.toString()
                .trim());

    }

    @Test
    public void testMove() {
        bat.move();
        assertEquals("Robin Bat is swooping through the dark.", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    public void testFly(){
        bat.fly();
        assertEquals("Robin Bat is swooping through the dark.", outputStreamCaptor.toString()
                .trim());
    }
}
