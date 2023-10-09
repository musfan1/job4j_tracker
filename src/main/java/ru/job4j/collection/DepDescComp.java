package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int rsl = 0;
        String[] s1 = o1.split("/");
        String[] s2 = o2.split("/");
        for (int i = 0; i < Math.min(s1.length, s2.length); i++) {
            if (i == 0) {
                rsl = s2[i].compareTo(s1[i]);
            } else {
                rsl = s1[i].compareTo(s2[i]);
            }
            if (rsl != 0) {
                break;
            }
        }
        if (rsl == 0) {
            rsl = Integer.compare(s1.length, s2.length);
        }
        return rsl;
    }
}