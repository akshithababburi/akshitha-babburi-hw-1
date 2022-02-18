package com.iit.oodp;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class AntTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    Ant ant;

    @Before
    public void setUp() {
        ant = new Ant("RedAnt");
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testAntName() {
        assertEquals("RedAnt", ant.getName());
    }

    @Test
    public void testLastAte() {
        Thing book = new Thing("Book");
        ant.eat(book);
        assertEquals("Thing{name='Book'}", ant.lastAte.toString());
    }

    @Test
    public void testEat() {
        Thing book = new Thing("Book");
        ant.eat(book);
        assertEquals("RedAnt has just eaten a Book.", outputStreamCaptor.toString()
                .trim());

    }

    @Test
    public void testNothingAte(){
        ant.whatDidYouEat();
        assertEquals("RedAnt Ant has had nothing to eat!", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    public void testAte(){
        Thing book = new Thing("Book");
        ant.lastAte = book;
        ant.whatDidYouEat();
        assertEquals("RedAnt Ant has eaten a Book!", outputStreamCaptor.toString()
                .trim());

    }

    @Test
    public void testMove() {
        ant.move();
        assertEquals("RedAnt Ant is crawling around.", outputStreamCaptor.toString()
                .trim());
    }


}
