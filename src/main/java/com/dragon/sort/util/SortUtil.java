package com.dragon.sort.util;

/**
 * @date: 2024/3/14 18:08
 * @author: ybl
 */
public class SortUtil {
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
