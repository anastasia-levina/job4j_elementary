package ru.job4j.condition;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax2To1Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax12To4And8Then12() {
        int result = Max.max(8, 4, 12);
        assertThat(result, is(12));
    }

    @Test
    public void whenMax15To5And7And8Then15() {
        int result = Max.max(5, 8, 7, 15);
        assertThat(result, is(15));
    }
}