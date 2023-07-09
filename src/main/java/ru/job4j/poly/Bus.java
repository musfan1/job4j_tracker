package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("Автобус едет.");
    }

    @Override
    public void passengers(int number) {
        System.out.println("В автобусе " + number + " пассажиров.");
    }

    @Override
    public double fill(int litres) {
        return litres * 1.0;
    }
}
