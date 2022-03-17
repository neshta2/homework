package com.training.eggribanov.homework1.homework1_2;

public class SelectAlgorithm {

    public static void chooseAlgorithm(int algorithmId, int loopType, int n) {
        switch (algorithmId) {
            case 1:
                Fibonacci.chooseLoopType(loopType, n);
                break;
            case 2:
                Factorial.chooseLoopType(loopType, n);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + algorithmId);
        }
    }
}