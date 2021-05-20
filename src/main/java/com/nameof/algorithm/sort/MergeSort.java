package com.nameof.algorithm.sort;

public class MergeSort {
    public int[] sortArray(int[] nums) {
        sortArray(nums, 0, nums.length - 1);
        return nums;
    }

    private static void sortArray(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            sortArray(arr, l, mid);
            sortArray(arr, mid+1, r);
            merge(arr, l, r);
        }
    }

    private static void merge(int[] arr, int l, int r) {
        int mid = (l + r) / 2;
        int[] temp = new int[arr.length];
        int lstart = l;
        int rstart = mid + 1;
        int index = 0;
        while (lstart <= mid && rstart <= r) {
            temp[index++] = arr[lstart] > arr[rstart] ? arr[rstart++] : arr[lstart++];
        }
        while (lstart <= mid) {
            temp[index++] = arr[lstart++];
        }
        while (rstart <= r) {
            temp[index++] = arr[rstart++];
        }
        for (int i = 0; i < index; i++) {
            arr[l + i] = temp[i];
        }
    }
}
