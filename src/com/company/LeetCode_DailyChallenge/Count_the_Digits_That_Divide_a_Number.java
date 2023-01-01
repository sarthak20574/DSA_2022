package com.company.LeetCode_DailyChallenge;

public class Count_the_Digits_That_Divide_a_Number {

    //2520. Count the Digits That Divide a Number
    //https://leetcode.com/problems/count-the-digits-that-divide-a-number/description/

    public int countDigits(int num) {

        int ans=0, temp=num;

        while( temp>0){

            int dig= temp%10;
            temp/=10;
            if( num%dig==0) ans++;
        }

        return ans;
    }

}
