package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Top_K_Frequent_Elements {
    //347. Top K Frequent Elements
    // store in a min heap and keep popping( all small elements) till you get a heap with K elements
    //https://www.youtube.com/watch?v=7VoJn544QrM
    public int[] topKFrequent(int[] nums, int k) {

        int n= nums.length;
        Map<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<n; i++){
            if( map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else {
                map.put(nums[i], 1);
            }
        }

        PriorityQueue<int[]> minHeap= new PriorityQueue<>((a, b)->a[1]-b[1]);

        for (int ele: map.keySet()){
            minHeap.add(new int[]{ ele, map.get(ele)});
            if( minHeap.size()>k) minHeap.poll();
        }

        int[] ans= new int[k];
        int i=0;
        while (!minHeap.isEmpty()){
            ans[i++]=minHeap.poll()[0];
        }
        return ans;
    }
    // or can store in a max heap and output(poll) the first k elements as the answer


}
