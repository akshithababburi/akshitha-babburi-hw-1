package com.iit.oodp;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class FlyTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    Fly fly;

    @Before
    public void setUp() {
        fly = new Fly("Wasp");
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testBatName() {
        assertEquals("Wasp", fly.getName());
    }



    @Test
    public void testEat() {
        Thing bag = new Thing("Bag");
        fly.eat(bag);
        assertEquals("Wasp Fly has eaten a Bag.", outputStreamCaptor.toString()
                .trim());

    }

    @Test
    public void testEatCreature() {
        Ant ant = new Ant("Ant");
        fly.eat(ant);
        assertEquals("Wasp Fly wont eat a Ant.", outputStreamCaptor.toString()
                .trim());

    }

    @Test
    public void testNothingAte(){
        fly.whatDidYouEat();
        assertEquals("Wasp Fly has had nothing to eat!", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    public void testAte(){
        Thing bag = new Thing("Bag");
        fly.lastAte = bag;
        fly.whatDidYouEat();
        assertEquals("Wasp Fly has eaten a Bag!", outputStreamCaptor.toString()
                .trim());

    }

    @Test
    public void testMove() {
        fly.move();
        assertEquals("Wasp Fly is buzzing around in flight.", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    public void testFly(){
        fly.fly();
        assertEquals("Wasp Fly is buzzing around in flight.", outputStreamCaptor.toString()
                .trim());
    }
}
