package com.iit.oodp;

public class Tiger extends Creature {

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " " + getClass().getSimpleName() + " has just pounced.");
    }
}

