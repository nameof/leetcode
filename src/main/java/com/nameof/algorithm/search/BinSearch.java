package com.nameof.algorithm.search;

public class BinSearch {
    public int search(int[] arr, int i) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == i) {
                return mid;
            } else if (arr[mid] > i) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}
