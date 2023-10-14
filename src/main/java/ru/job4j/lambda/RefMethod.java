package ru.job4j.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class RefMethod {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Ivan",
                "Petr Arsentev"
        );
        Consumer<String> out = RefMethod::cutOut;
        names.forEach(out);
    }

    public static void cutOut(String value) {
        Function<String, String> func = (s) -> (s.length() > 10) ? s.substring(0, 10) + ".." : s;
        Consumer<String> print = System.out::println;
        print.accept(func.apply(value));
    }
}