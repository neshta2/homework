package com.training.eggribanov.homework1.homework1_1;

public class Formula {
    public double value(Integer a, Integer p, double m1, double m2) {
        double x = 4 * Math.pow(Math.PI, 2) * (Math.pow(a, 3) / Math.pow(p, 2) * (m1 + m2));
        return x;
    }
}