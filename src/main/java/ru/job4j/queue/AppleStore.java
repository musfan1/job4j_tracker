package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        String rsl = "";
        int sold = 0;
        for (Customer customer : queue) {
            if (sold == count) {
                break;
            }
            sold++;
            rsl = customer.name();
        }
        return rsl;
    }

    public String getFirstUpsetCustomer() {
        String rsl = "";
        int sold = 0;
        for (Customer customer : queue) {
            if (sold == count) {
                rsl = customer.name();
                break;
            }
            sold++;
        }
        return rsl;
    }
}