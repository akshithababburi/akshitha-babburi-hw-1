package com.iit.oodp;

public class Fly extends Creature implements Flyer {

    public Fly(String name) {
        super(name);
    }

    public void eat(Thing aThing) {
        if (aThing instanceof Creature) {
            System.out.println(getName() + " " + getClass().getSimpleName() + " wont eat a " + aThing.getName());
        } else {
            lastAte = aThing;
            System.out.println(getName() + " " + getClass().getSimpleName() + " has eaten a " + aThing.getName());
        }
    }

    @Override
    public void move() {
        fly();
    }

    @Override
    public void fly() {
        System.out.println(getName() + " " + getClass().getSimpleName() + " is buzzing around in flight.");
    }

    public void whatDidYouEat() {
        if (null != lastAte)
            System.out.println(getName() + " " + getClass().getSimpleName() + " has eaten a " + lastAte.getName());
        else
            System.out.println(getName() + " " + getClass().getSimpleName() + " has had nothing to eat");
    }
}
