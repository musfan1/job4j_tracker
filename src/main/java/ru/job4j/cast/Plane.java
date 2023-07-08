package ru.job4j.cast;

public class Plane implements Vehicle {

    String name;

    Plane(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " летает по воздуху.");
    }

    @Override
    public int maxSpeed() {
        return 900;
    }
}
