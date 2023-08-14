package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ivan@mail.ru", "Ivan Ivanov");
        map.put("petr@yandex.ru", "Petr Petrov");
        map.put("john@gmail.com", "John Johns");
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
