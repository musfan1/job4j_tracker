package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
    }

    @Override
    public void passengers(int number) {
    }

    @Override
    public double fill(int litres) {
        return litres * 1.0;
    }
}
