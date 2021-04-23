package com.nameof.algorithm;

public class PowerXn {

    public double myPow(double x, int n) {
        if (x == 0) {
            return x;
        }

        long power = n;
        if (n < 0) {
            power = -1L * (long) n;
            x = 1 / x;
        }

        double weight = x;
        double res = 1;
        while (power != 0) {
            if (power % 2 == 1) {
                res *= weight;
            }
            weight *= weight;
            power /= 2;
        }
        return res;
    }
}
