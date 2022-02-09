package com.iit.oodp;

public class Bat extends Creature implements Flyer {
    public Bat(String name) {
        super(name);
    }

    public void eat(Thing aThing) {
        if (!(aThing instanceof Creature)) {
            System.out.println(getName() + " " + getClass().getSimpleName() + " wont eat a " + aThing + ".");
        } else if (aThing instanceof Creature) {
            lastAte = aThing;
            System.out.println(getName() + " has just eaten a " + aThing.getName()+ ".");
        }

    }


    @Override
    public void move() {
        fly();
    }

    @Override
    public void fly() {
        System.out.println(getName() + " " + getClass().getSimpleName() + " is swooping through the dark.");

    }

    public void whatDidYouEat() {
        if (null != lastAte)
            System.out.println(getName() + " " + getClass().getSimpleName() + " has eaten a " + lastAte.getName() + "!");
        else
            System.out.println(getName() + " " + getClass().getSimpleName() + " has had nothing to eat!");
    }
}
