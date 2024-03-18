package com.dragon.sort;

import com.dragon.sort.util.SortUtil;

/**
 * @date: 2024/3/14 18:08
 * @author: ybl
 */
public class QuickSort {

    public static int[] sort(int[] arr) {
        return res(arr,0,arr.length - 1);
    }

    public static int[] res(int[] arr, int left, int right) {
        if (left < right) {
            int mid = findMind(arr, left, right);
            res(arr, left, mid - 1);
            res(arr, mid + 1, right);
        }
        return arr;
    }

    public  static int findMind(int[] arr,int left,int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                SortUtil.swap(arr, i, j);
            }
        }
        SortUtil.swap(arr, i + 1, right);
        return i + 1;
    }

}
