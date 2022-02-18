package com.iit.oodp;

public class Ant extends Creature {
    public Ant(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " " + getClass().getSimpleName() + " is crawling around.");
    }
}
