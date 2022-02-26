package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert270RblThen3Euro() {
        float in = 270;
        float expected = 3;
        float out = Converter.rubleToEuro(in);
        float eps = 0.001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert200RblThen2dot5Dollar() {
        float in = 200;
        float expected = 2.5f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.001f;
        Assert.assertEquals(expected, out, eps);
    }
}