package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.assertNull;

class StartUITest {

    @Test
    void whenCreateItemFirst() {
        String[] answers = {"Первый"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Первый");
        assertThat(created.getName()).isEqualTo(expected.getName());
    }

    @Test
    void whenEditItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Первый");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId()),
                "Второй"
        };
        StartUI.editItem(new StubInput(answers), tracker);
        Item edited = tracker.findById(item.getId());
        assertThat(edited.getName()).isEqualTo("Второй");
    }

    @Test
    void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Третий");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId())
        };
        StartUI.deleteItem(new StubInput(answers), tracker);
        Item deleted = tracker.findById(item.getId());
        assertNull(deleted);
    }
}