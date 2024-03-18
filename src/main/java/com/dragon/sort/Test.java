package com.dragon.sort;

import java.util.Arrays;

/**
 * @date: 2024/3/14 17:52
 * @author: ybl
 * 冒泡排序
 * 归并排序
 * 快速排序
 * 堆排序
 */
public class Test {

    public static void sout(String name, int[] arr) {
        StringBuilder stringBuilder = new StringBuilder(name);
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append("\t").append(arr[i]);
        }
        System.out.println(stringBuilder.toString());
    }


    public static void main(String[] args) {
        int[] arr = new int[]{7, 4, 2, 8, 1, 9, 3};
        int[] sort1 = SelectionSort.sort(Arrays.copyOf(arr, arr.length));
        sout("选择排序", sort1);
        int[] sort2 = BubbleSort.sort(Arrays.copyOf(arr, arr.length));
        sout("冒泡排序", sort2);
        int[] sort3 = HeapSort.sort(Arrays.copyOf(arr, arr.length));
        sout("堆排序", sort3);
        int[] sort4 = QuickSort.sort(Arrays.copyOf(arr, arr.length));
        sout("快速排序", sort4);
        int[] sort5 = MergeSort.sort(Arrays.copyOf(arr, arr.length));
        sout("归并排序", sort5);
    }
}
