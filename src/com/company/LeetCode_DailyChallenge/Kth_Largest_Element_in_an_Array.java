package com.company.LeetCode_DailyChallenge;

import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array {

    //215. Kth Largest Element in an Array

    //https://leetcode.com/problems/kth-largest-element-in-an-array/
    //https://www.youtube.com/watch?v=FrWq2rznPLQ

    /*
    int findKthLargest(vector<int>& nums, int k) {
        sort( nums.begin(), nums.end());

        return nums[nums.size()-k];

    }
     */


    // runtime of building heap O(n)
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int x : nums) {

            minHeap.add(x);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }

}
