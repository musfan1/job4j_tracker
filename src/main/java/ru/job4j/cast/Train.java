package ru.job4j.cast;

public class Train implements Vehicle {

    private String name;

    public Train(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " ездит по рельсам.");
    }

    @Override
    public int maxSpeed() {
        return 250;
    }
}
