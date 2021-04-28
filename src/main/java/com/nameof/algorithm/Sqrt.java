package com.nameof.algorithm;

public class Sqrt {
    public int sqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int l = 0;
        int r = x / 2;
        int result = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long target = (long)mid * (long)mid;
            if (target == x) {
                return mid;
            }
            if (target > x) {
                r = mid - 1;
            } else {
                result = mid;
                l = mid + 1;
            }
        }
        return result;
    }
}
