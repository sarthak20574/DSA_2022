package com.company.LeetCode_DailyChallenge;

import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence {


    //128. Longest Consecutive Sequence
    //https://www.youtube.com/watch?v=P6RZZMu_maU&ab_channel=NeetCode
    //https://leetcode.com/problems/longest-consecutive-sequence/
    public int longestConsecutive(int[] nums) {

        Set<Integer> x= new HashSet<Integer>();
        int ans=0;
        for( int i: nums){
            x.add(i);
        }

        //check if this is the start of a sequence, if yes then calculate its length

        for( int i: nums){

            if( x.contains(i-1)==false){
                int l= 0;
                while( x.contains(i)){
                    l++;
                    i++;
                }
                ans= Math.max(l, ans);
            }
        }

        //still in worst case, we need to traverse 2 times through the array

        return ans;
    }
}
