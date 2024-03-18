package com.dragon.sort;

/**
 * @date: 2024/3/17 14:21
 * @author: ybl
 */
public class MergeSort {
    public static int[] sort(int[] arr) {
        return split(arr, 0, arr.length - 1);
    }

    public static int[] split(int[] arr, int left, int right) {
        if (right > left) {
            int mid = left + (right - left) / 2;
            split(arr, left, mid);
            split(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
        return arr;
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int r = mid + 1;
        int start = 0;
        while (i <= mid && r <= right) {
            while (i <= mid &&arr[i] <=arr[r]) {
                temp[start++] = arr[i++];
            }
            while (r <= right &&arr[r] <=arr[i]) {
                temp[start++] = arr[r++];
            }
        }
        while (i <= mid) {
            temp[start++] = arr[i++];
        }
        while (r <= right) {
            temp[start++] = arr[r++];
        }
        int t = left;
        for (int num : temp) {
            arr[t++] = num;
        }
    }


}
