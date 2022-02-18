package com.iit.oodp;

public class TestCreature {
    public static final int CREATURE_COUNT = 5;
    public static final int THING_COUNT = 6;

    public TestCreature() {
    }

    public static void main(String[] args) {
        Thing[] thingArr = new Thing[THING_COUNT];
        Creature[] creatureArray = new Creature[CREATURE_COUNT];


        String[] thingNames = {"Fan", "Car", "Book"};

        for (int i = 0; i < thingNames.length; i++) {
            thingArr[i] = new Thing(thingNames[i]);
        }

        for (int i = 3; i < thingArr.length; i++) {
            thingArr[i] = new Tiger("Tiger" + i);
        }

        System.out.println("Things:");
        System.out.println();
        for (int i = 0; i < thingArr.length; i++) {
            System.out.println(thingArr[i].getName());
        }
        System.out.println();
        Ant redAnt = new Ant("RedAnt");
        creatureArray[0] = redAnt;
        Ant fireAnt = new Ant("FireAnt");
        creatureArray[1] = fireAnt;
        Bat batman = new Bat("Batman");
        creatureArray[2] = batman;
        Fly butterFly = new Fly("Butterfly");
        creatureArray[3] = butterFly;
        Tiger bengalTiger = new Tiger("BengalTiger");
        creatureArray[4] = bengalTiger;

        System.out.println("Creatures:");
        System.out.println();
        for (int i = 0; i < creatureArray.length; i++) {
            System.out.println(creatureArray[i].getName());
        }
        System.out.println();

        redAnt.move();
        redAnt.whatDidYouEat();
        redAnt.eat(thingArr[2]);
        redAnt.whatDidYouEat();

        batman.move();
        batman.whatDidYouEat();
        batman.eat(thingArr[1]);
        batman.eat(creatureArray[0]);
        batman.fly();
        batman.whatDidYouEat();

        butterFly.move();
        butterFly.whatDidYouEat();
        butterFly.eat(creatureArray[1]);
        butterFly.eat(thingArr[1]);
        butterFly.fly();
        butterFly.whatDidYouEat();

        bengalTiger.move();
        bengalTiger.whatDidYouEat();
        bengalTiger.eat(thingArr[0]);
        bengalTiger.whatDidYouEat();

        System.out.println();
    }
}
