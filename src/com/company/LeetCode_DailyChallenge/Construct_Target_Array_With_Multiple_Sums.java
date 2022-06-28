package com.company.LeetCode_DailyChallenge;

import java.util.PriorityQueue;

public class Construct_Target_Array_With_Multiple_Sums {


    //1354. Construct Target Array With Multiple Sums
    //https://www.youtube.com/watch?v=wVBMvVc5Na4
    //https://leetcode.com/problems/construct-target-array-with-multiple-sums/


    // go backwards and check if at stage the sum goes negative as the max element is
    // being replaced with the max element at each stage,
    public boolean isPossible(int[] target) {

        PriorityQueue<Integer> maxHeap= new PriorityQueue<>((a,b)->b-a);

        int n= target.length;
        int sum=0;
        for (int j : target) {
            maxHeap.add(j);
            sum += j;
        }

        while(true){

            int x= maxHeap.poll();
            sum-=x;
            if( sum==1|| x==1) return true;
            if( sum<=0 || sum>x || x%sum==0)  return false;

            x=x%sum;
                maxHeap.add(x);
                sum+=x;
            }

    }

}
