package com.nameof.algorithm;

public class UglyNumber {
    public int getUglyNumber(int index) {
        if (index == 0 || index == 1) {
            return index;
        }
        int[] all = new int[index];
        int t2 = 0, t3 = 0, t5 = 0;
        all[0] = 1;
        for (int i = 1; i < index; i++) {
            int num2 = 2 * all[t2];
            int num3 = 3 * all[t3];
            int num5 = 5 * all[t5];
            all[i] = Math.min(Math.min(num2, num3), num5);
            if (all[i] == num2) {
                t2++;
            }
            if (all[i] == num3) {
                t3++;
            }
            if (all[i] == num5) {
                t5++;
            }
        }
        return all[index - 1];
    }
}
