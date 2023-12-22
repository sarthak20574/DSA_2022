package com.company.LeetCode_DailyChallenge;

public class Shuffle_the_Array {

    //1470. Shuffle the Array
    //https://leetcode.com/problems/shuffle-the-array/

    // there is also a bit manipulation solution
    //https://www.youtube.com/watch?v=IvIKD_EU8BY&ab_channel=NeetCodeIO

    public int[] shuffle(int[] nums, int n) {
        n*=2;

        for( int i=0; i<n; i++){
            nums[i]*=1001;
        }

        int i=0, j=n/2;

        for( int k=0; k<n; k++){
            if( k%2==0)
                nums[k]+=nums[i++]/1001;
            else
                nums[k]+=nums[j++]/1001;
        }

        for( int l=0; l<n; l++){
            nums[l]%=1001;
        }


        return nums;
    }

}
