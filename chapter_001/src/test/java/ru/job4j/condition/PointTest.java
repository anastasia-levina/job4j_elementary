package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void result() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2.0;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void result1() {
        int x1 = 2;
        int y1 = 2;
        int x2 = 1;
        int y2 = 2;
        double expected = 1.0;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void result2() {
        int x1 = 2;
        int y1 = 2;
        int x2 = 2;
        int y2 = 6;
        double expected = 4.0;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void result3() {
        int x1 = 2;
        int y1 = 2;
        int z1 = 2;
        int x2 = 6;
        int y2 = 2;
        int z2 = 2;
        double expected = 4.0;
        double out = new Point(x1, y1, z1).distance3d(new Point(x2, y2, z2));
        Assert.assertEquals(expected, out, 0.01);
    }
}

