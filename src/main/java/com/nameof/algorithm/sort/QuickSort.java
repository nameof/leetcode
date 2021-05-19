package com.nameof.algorithm.sort;

public class QuickSort {
    public int[] sortArray(int[] nums) {
        sortArray(nums, 0, nums.length - 1);
        return nums;
    }

    public void sortArray(int[] nums, int l, int r) {
        if (l < r) {
            int left = l;
            int right = r;
            int x = nums[l];
            while (left < right) {
                while (left < right && nums[right] > x) {
                    right--;
                }
                if (left < right) {
                    nums[left++] = nums[right];
                }
                while (left < right && nums[left] < x) {
                    left++;
                }
                if (left < right) {
                    nums[right--] = nums[left];
                }
            }
            nums[left] = x;
            sortArray(nums, l, left - 1);
            sortArray(nums, left + 1, r);
        }
    }
}
