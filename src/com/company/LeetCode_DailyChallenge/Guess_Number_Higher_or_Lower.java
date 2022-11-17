package com.company.LeetCode_DailyChallenge;

public class Guess_Number_Higher_or_Lower {

    //Guess Number Higher or Lower
    //https://leetcode.com/problems/guess-number-higher-or-lower/description/

    // made just to remove error
int guess(int x){
    return  -1;
}

    public int guessNumber(int n) {

        int start=1, end=n, mid;

        while( start<=end){

            mid= start+(end- start)/2;

            if( guess(mid)==0) return mid;
            else if( guess(mid)==1) start=mid+1;
            else end=mid-1;
        }

        return -1;
    }

}
