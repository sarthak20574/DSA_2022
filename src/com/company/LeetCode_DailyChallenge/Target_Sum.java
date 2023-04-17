package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Target_Sum {

    //494. Target Sum
    //https://leetcode.com/problems/target-sum/description/



    public int findTargetSumWays(int[] nums, int target) {

        Map<Integer, Integer> m= new HashMap<>();
        int n= nums.length;

        Map<Integer, Integer> temp= new HashMap<>();

        temp.put(0,1);

        for( int i=0; i<n; i++){

            m= temp;
            temp= new HashMap<>();

            for( int k: m.keySet()){
                temp.put( k+nums[i], temp.getOrDefault(k+nums[i],0)+ m.get(k));
                temp.put( k-nums[i], temp.getOrDefault(k-nums[i],0)+ m.get(k));
            }
        }

        return temp.getOrDefault(target, 0);
    }

    Map<String, Integer> m;

    public int findTargetSumWays1(int[] nums, int target) {

        m= new HashMap<>();

        return fn( nums, target, 0 ,0);

    }

    /*

    either add or subtract a new item
    */

    int fn( int[] nums, int t, int cur, int i){

        if( i==nums.length){
            return cur==t?1:0;
        }

        if( m.containsKey( cur+ " : "+i) ) return m.get(cur+ " : "+i );


        int ans = fn( nums, t,  cur+nums[i], i+1) + fn(  nums, t, cur-nums[i], i+1);


        m.put( cur+ " : " + i, ans);
        return ans;
    }


}
