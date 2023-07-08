package ru.job4j.cast;

public class Bus implements Vehicle {

    String name;

    Bus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " ездит по дорогам.");
    }

    @Override
    public int maxSpeed() {
        return 110;
    }
}
