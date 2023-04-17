package com.company.LeetCode_DailyChallenge;

import java.util.PriorityQueue;
import java.util.Queue;

public class Minimize_Deviation_in_Array {

    //1675. Minimize Deviation in Array
    //https://leetcode.com/problems/minimize-deviation-in-array/description/
    // NeetCode IO 's video

    public int minimumDeviation(int[] nums) {


        // *2 increases value therefore use it on the lower numbers and
        //  /2 decreases the value therefore use it on the higher nos

        //store the largest elements all odd

        int minn=Integer.MAX_VALUE, ans=Integer.MAX_VALUE;

        Queue<Integer> q= new PriorityQueue<>((a, b)->b-a);

        for( int i: nums){

            while( i%2==1){
                i= i*2;
            }

            minn= Math.min( minn, i);
            q.add(i);
        }

        ans= Math.min( ans, q.peek()-minn);

        while( q.peek()%2==0){
            int x= q.poll();
            x/=2;
            q.add(x);
            minn= Math.min( minn, x);
            ans= Math.min( ans, q.peek()-minn);
        }


        return ans;

    }


}
