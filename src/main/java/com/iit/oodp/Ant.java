package com.iit.oodp;

public class Ant extends Creature {
    public Ant(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " " + getClass().getSimpleName() + " is crawling around.");
    }

    public void eat(Thing aThing) {
        lastAte = aThing;
        System.out.println(getName() + " has just eaten a " + aThing.getName() + ".");
    }

    public void whatDidYouEat() {
        if (null != lastAte)
            System.out.println(getName() + " " + getClass().getSimpleName() + " has eaten a " + lastAte.getName() + "!");
        else
            System.out.println(getName() + " " + getClass().getSimpleName() + " has had nothing to eat!");
    }

}
