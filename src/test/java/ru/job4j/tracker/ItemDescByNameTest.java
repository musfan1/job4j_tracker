package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ItemDescByNameTest {
    @Test
    public void whenItemDescByName() {
        Item anna = new Item("Anna");
        Item victor = new Item("Victor");
        Item boris = new Item("Boris");
        Item peter = new Item("Peter");
        List<Item> items = Arrays.asList(victor, anna, peter, boris);
        List<Item> expected = Arrays.asList(victor, peter, boris, anna);
        Collections.sort(items, new ItemDescByName());
        assertThat(expected).containsExactlyElementsOf(items);
    }
}