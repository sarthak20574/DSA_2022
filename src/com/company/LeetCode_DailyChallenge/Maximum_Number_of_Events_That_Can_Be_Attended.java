package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Maximum_Number_of_Events_That_Can_Be_Attended {
    //1353. Maximum Number of Events That Can Be Attended
    //https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended/?envType=list&envId=r94it777


    public int maxEvents(int[][] e) {

        int ans=0;

        Arrays.sort(e,(a, b)->a[0]-b[0]);

        Queue<int[]> q= new PriorityQueue<>((a, b)->a[1]-b[1]);

        int cur=0;
        for( int i=1; i<1_00_002; i++){
            // if( cur==e.length) break;

            while( cur<e.length && i==e[cur][0]){
                q.add( e[cur++]);
                // System.out.println(Arrays.toString(e[cur-1]));
            }
            if( q.isEmpty()==false){
                //  System.out.println(Arrays.toString(q.peek())+" polled" );

                while(q.isEmpty()==false && i>q.peek()[1])
                    q.poll();
                if(q.isEmpty()==false && i<=q.peek()[1]){
                    q.poll();
                    ans++;
                }


            }

        }
        return ans;


    }
}
