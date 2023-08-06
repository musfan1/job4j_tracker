package ru.job4j.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class FullSearch {
    public Set<String> extractNumber(List<Task> tasks) {
        Set<String> strings = new HashSet<>();
        for (Task task : tasks) {
            strings.add(task.getNumber());
        }
        return strings;
    }
}
