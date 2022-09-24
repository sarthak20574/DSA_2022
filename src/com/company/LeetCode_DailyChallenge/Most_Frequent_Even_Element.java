package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Most_Frequent_Even_Element {

    //https://leetcode.com/problems/most-frequent-even-element/
    public int mostFrequentEven(int[] nums) {

        Map<Integer, Integer> freq= new HashMap<>();

        int ans=-1, ans_freq=0;;

        for( int i: nums){

            if( i%2==0){

                freq.put( i, freq.getOrDefault(i, 0)+1);
                // System.out.println(freq.to);

                //return smallest one
                //System.out.println(i +" "+ freq.get(i));
                if( freq.get(i)==ans_freq){
                    if( i<ans) ans= i;
                }
                else if( freq.get(i)>ans_freq){
                    ans=i;
                    ans_freq=freq.get(i);
                }

            }

        }

        return ans;

    }
}
