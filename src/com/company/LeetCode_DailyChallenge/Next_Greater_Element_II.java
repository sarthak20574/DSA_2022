package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element_II {
    //503. Next Greater Element II
    //https://leetcode.com/problems/next-greater-element-ii/


    public int[] nextGreaterElements(int[] nums) {

        Stack<Integer> s= new Stack<>();

        int n= nums.length;

        int[] ans= new int[n];
        Arrays.fill(ans, -1);
        for( int i=0; i<n; i++){

            while( s.isEmpty()==false && nums[s.peek()]<nums[i]){
                int ind=s.pop();

                if( ans[ind]==-1){
                    ans[ind]=nums[i];
                }
            }
            s.add( i);
        }

        for( int i=0; i<n; i++){

            while( s.isEmpty()==false && nums[s.peek()]<nums[i]){
                int ind=s.pop();

                if( ans[ind]==-1){
                    ans[ind]=nums[i];
                }
            }
            s.add( i);
        }


        return ans;
    }
}
