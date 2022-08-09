package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Combination_Sum_IV {
    //377. Combination Sum IV
    //https://leetcode.com/problems/combination-sum-iv/

    //https://www.youtube.com/watch?v=dw2nMCxG0ik&ab_channel=NeetCode
    //https://www.youtube.com/watch?v=90z1w8XSWIU&ab_channel=CodewithAlisha
    //https://www.youtube.com/watch?v=Wct0mN2SCRQ&ab_channel=CodeHelp-byBabbar

    public int combinationSum4(int[] nums, int target) {

        Map<Integer, Integer> dp= new HashMap<>();
        dp.put(0,1);


        for( int i=1; i<=target; i++){

            int x= 0;
            for( int j=0; j<nums.length; j++){
                x+=dp.getOrDefault(i-nums[j],0);
            }
            dp.put(i,x);
        }


        return dp.get(target);
    }
}
