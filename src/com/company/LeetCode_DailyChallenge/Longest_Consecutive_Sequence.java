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

    //128. Longest Consecutive Sequence

    public int longestConsecutive1(int[] nums) {

        Set<Integer> s= new HashSet<>();
        int ans=0;

        for( int i: nums){
            s.add(i);
        }

        for( int i: nums){

            int len=1, cur=i+1;
            if( s.contains(i)){
                s.remove(i);
                while(s.contains(cur)){
                    cur++;
                    len++;
                    s.remove(cur-1);
                }
                cur=i-1;
                while(s.contains(cur)){
                    cur--;
                    len++;
                    s.remove(cur+1);
                }
            }
            ans= Math.max(ans, len);
        }


        return ans;
    }
}
