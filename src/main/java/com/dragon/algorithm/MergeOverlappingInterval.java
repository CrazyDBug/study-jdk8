package com.dragon.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @date: 2024/3/19 14:29
 * @author: ybl
 * 合并重叠区间
 */
public class MergeOverlappingInterval {

    public static void main(String[] args) {
        MergeOverlappingInterval solution = new MergeOverlappingInterval();
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] mergedIntervals = solution.merge(intervals);
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }

    public int[][] merge(int[][] intervals) {
        // 如果区间列表为空，则直接返回空数组
        if (intervals == null || intervals.length == 0) {
            return new int[0][];
        }

        // 按照区间起点进行排序
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] currentInterval = intervals[i];
            int[] lastMergedInterval = merged.get(merged.size() - 1);

            // 如果当前区间的起点在前一个区间的范围内，则合并这两个区间
            if (currentInterval[0] <= lastMergedInterval[1]) {
                lastMergedInterval[1] = Math.max(lastMergedInterval[1], currentInterval[1]);
            } else {
                // 如果当前区间的起点不在前一个区间的范围内，则直接添加到结果列表中
                merged.add(currentInterval);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}
