package com.dragon.sort;

import com.dragon.sort.util.SortUtil;

/**
 * @date: 2024/3/14 18:08
 * @author: ybl
 */
public class SelectionSort {
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1;  i++) {
            int temp = arr[i+1];
            int local = i + 1;
            for (int j = i + 2; j < arr.length ;j++) {
                if (arr[j] < temp) {
                    temp = arr[j];
                    local = j;
                }
            }
            if (temp < arr[i]) {
                SortUtil.swap(arr,i,local);
            }
        }
        return arr;
    }
}
