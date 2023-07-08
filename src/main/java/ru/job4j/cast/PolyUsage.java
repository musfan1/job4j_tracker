package ru.job4j.cast;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle bus1 = new Bus("bus1");
        Vehicle bus2 = new Bus("bus2");
        Vehicle plane1 = new Plane("plane1");
        Vehicle plane2 = new Plane("plane2");
        Vehicle train1 = new Train("train1");
        Vehicle train2 = new Train("train2");
        Vehicle[] vehicles = new Vehicle[]{bus1, bus2, plane1, plane2, train1, train2};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            System.out.println("Максимальная скорость " + vehicle.maxSpeed() + " км/ч.");
        }
    }
}
