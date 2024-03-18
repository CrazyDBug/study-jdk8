package com.dragon.sort;

import java.util.PriorityQueue;

/**
 * @date: 2024/3/14 18:22
 * @author: ybl
 */
public class HeapSort {
    public static int[] sort(int[] arr) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i : arr) {
            queue.offer(i);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = queue.poll();
        }
        return arr;
    }
}
