package com.company.LeetCode_DailyChallenge;

public class Difference_Between_Element_Sum_and_Digit_Sum_of_an_Array {

    //2535. Difference Between Element Sum and Digit Sum of an Array
    //https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/description/

    public int differenceOfSum(int[] nums) {

        long x= 0, y=0;

        for( int i: nums){

            x+=i;

            int z= i;
            while(z>0){
                int rem= z%10;
                z/=10;
                y+=rem;
            }
        }

        return (int) Math.abs(x-y);
    }

}
