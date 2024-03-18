package com.dragon.sort;

import com.dragon.sort.util.SortUtil;

/**
 * @date: 2024/3/14 17:54
 * @author: ybl
 */
public class BubbleSort {

    public static int[] sort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    SortUtil.swap(arr, j + 1, j);
                }
            }
        }
        return arr;
    }
}
