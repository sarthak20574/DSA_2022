package com.company.LeetCode_DailyChallenge;

public class Sum_of_Two_Integers {

    //371. Sum of Two Integers
    //https://leetcode.com/problems/sum-of-two-integers/
    //https://www.youtube.com/watch?v=qq64FrA2UXQ&ab_channel=BackToBackSWE

    public int getSum(int a, int b) {

        // remember xor(^) gives us the sum of 2 numbers and and(&) gives us the carry
        // so keep adding untill

        int carry=a & b;
        int sum= a^b;

        //we left shift the carry and then add the carry to the sum( storing sum brfore adding in a temp variable) and then we calculat the carry with the old sum stored in the temp variable

        while( carry!=0){
            carry=carry<<1;
            int temp= sum;
            sum= sum^carry;
            carry= temp & carry;
        }


        return sum;
    }
}
