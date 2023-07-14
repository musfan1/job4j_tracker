package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.assertj.core.api.Assertions.assertThat;

class FactTest {
    @Test
    public void whenCalcException() {
        Fact fact = new Fact();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    fact.calc(-1);
                });
        assertThat(exception.getMessage()).isEqualTo("N could not be less than 0");
    }

    @Test
    public void whenN0Calc1() {
        Fact fact = new Fact();
        int n = 0;
        int expected = 1;
        int result = fact.calc(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenN5Calc120() {
        Fact fact = new Fact();
        int n = 5;
        int expected = 120;
        int result = fact.calc(n);
        assertThat(result).isEqualTo(expected);
    }

}