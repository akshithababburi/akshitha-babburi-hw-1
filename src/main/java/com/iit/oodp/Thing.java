package com.iit.oodp;

public class Thing {

    private String name;

    public String getName() {
        return name;
    }

    public Thing(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + '{' +
                "name='" + name + '\'' +
                '}';
    }

}
