package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Majority_Element_II {

    //229. Majority Element II
    //https://leetcode.com/problems/majority-element-ii/
    //https://www.youtube.com/watch?v=vwZj1K0e9U8

    public List<Integer> majorityElement(int[] nums) {

        int n=nums.length;


        int num1=-1, num2=-1, c1=0, c2=0;

        for( int i: nums){

            if( num1==i) c1++;

            else if( num2==i) c2++;

            else if( c1==0){
                num1=i;
                c1=1;
            }
            else if( c2==0){
                num2=i;
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
        }



        List<Integer> ans= new ArrayList<>();
        c1=0;
        c2=0;

        for( int i: nums){
            if( num1==i)c1++;
            else if( num2==i) c2++;
        }
        if( c1>n/3) ans.add(num1);
        if( c2>n/3) ans.add(num2);

        return ans;
    }
}
