package com.code.problems.easy;

public class MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];

        int j = 0, k = 0;
        for (int i = 0; i < m + n; i++) {

            if (k > n || (j < m && nums1[j] <= nums2[k])) {
                result[i] = nums1[j];
                j++;
            } else {
                result[i] = nums2[k];
                k++;
            }
        }
        nums1=result;
    }

    public static void main(String[] args) {

        int m = 3, n = 3;
        int[] nums1 = {1, 2, 3};

        int[] nums2 = {1, 2, 3};

        merge(nums1, m, nums2, n);

        System.out.println(nums1);

    }
}
