package com.nameof.algorithm.array;

public class 旋转数组 {

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] a,int l, int r) {
        while (l < r) {
            swap(a, l++, r--);
        }
    }

    private void swap(int[] a, int i, int i1) {
        int temp = a[i];
        a[i] = a[i1];
        a[i1] = temp;
    }
}
