package com.company.LeetCode_DailyChallenge;

import java.util.PriorityQueue;
import java.util.Queue;

public class Jump_Game_VI {

    //1696. Jump Game VI
    //https://leetcode.com/problems/jump-game-vi/
    //https://www.youtube.com/watch?v=LzyahBCAYfY&ab_channel=CodingDecoded

    public int maxResult(int[] nums, int k) {

        int ans=0;

        int n= nums.length;

        Queue<int[]> maxHeap= new PriorityQueue<int[]>((a, b)-> b[0]-a[0]);

        for( int i=0; i<n; i++){

            while( maxHeap.isEmpty()== false && i-maxHeap.peek()[1]>k){

                //System.out.println("before polling: "+(maxHeap.peek()[0]) +" "+maxHeap.peek()[1]);
                maxHeap.poll();
                //System.out.println("after polling: "+(maxHeap.peek()[0]) +" "+maxHeap.peek()[1]);
            }

            if( maxHeap.isEmpty()== false){
                //System.out.println("maxHeap.isEmpty()== false : "+(nums[i]+maxHeap.peek()[0]) +" "+i);
                ans=nums[i]+maxHeap.peek()[0];
                maxHeap.add(new int[]{nums[i]+maxHeap.peek()[0], i});
                // ans=nums[i]+maxHeap.peek()[0];
            }
            else{
                maxHeap.add(new int[]{nums[i], i});
                ans=nums[i];
            }

        }

        return ans;
    }
}
