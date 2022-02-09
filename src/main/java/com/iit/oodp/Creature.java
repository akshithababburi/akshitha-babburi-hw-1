package com.iit.oodp;

public abstract class Creature extends Thing {
    Thing lastAte;
    public Creature(String name) {
        super(name);
    }

    public void eat(Thing aThing) {
        lastAte = aThing;
        System.out.println(getName() + " has just eaten a " +aThing.getName() + ".");
    }

    public abstract void move();

    public void whatDidYouEat() {
        if(null != lastAte)
            System.out.println(getName() + " " + getClass().getSimpleName() + " has eaten a "+lastAte.getName()+ "!");
        else
            System.out.println(getName() + " " + getClass().getSimpleName() + " has had nothing to eat!");
    }
}
