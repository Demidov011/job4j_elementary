package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 90;
    }

    public static float rubleToDollar(float value) {
        return value / 80;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(10);
        System.out.println("190 rubles are " + dollar + " dollars.");
    }
}
