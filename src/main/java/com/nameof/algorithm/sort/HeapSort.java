package com.nameof.algorithm.sort;

public class HeapSort {

    public void sort(int[] arr) {
        for (int i = arr.length - 1; i >= 1; i--) {
            buildHeap(arr, i);
            swap(arr, 0, i);
        }
    }

    private void buildHeap(int[] arr, int i) {
        for (int j = (i + 1) / 2 - 1; j >= 0; j--) {
            int l = 2 * j + 1;
            int r = l + 1;

            int max = l;
            if (r <= i && arr[l] < arr[r]) {
                max = r;
            }
            if (arr[max] > arr[j]) {
                swap(arr, max, j);
            }
        }
    }

    private void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
