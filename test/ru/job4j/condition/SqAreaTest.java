package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void result1() {
        int in = 4;
        int in1 = 1;
        double expected = 1;
        double out = SqArea.square(in, in1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void result2() {
        int in = 6;
        int in1 = 2;
        double expected = 2;
        double out = SqArea.square(in, in1);
        Assert.assertEquals(expected, out, 0.01);
    }
}