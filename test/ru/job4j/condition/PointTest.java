package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void result() {
        int in = 0;
        int in1 = 0;
        int in2 = 2;
        int in3 = 0;
        double expected = 2.0;
        double out = Point.distance(in, in1, in2, in3);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void result1() {
        int in = 2;
        int in1 = 2;
        int in2 = 1;
        int in3 = 2;
        double expected = 1.0;
        double out = Point.distance(in, in1, in2, in3);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void result2() {
        int in = 2;
        int in1 = 2;
        int in2 = 2;
        int in3 = 6;
        double expected = 4.0;
        double out = Point.distance(in, in1, in2, in3);
        Assert.assertEquals(expected, out, 0.01);
    }
}