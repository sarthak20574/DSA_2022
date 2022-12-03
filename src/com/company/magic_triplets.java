package com.company;

public class magic_triplets {

    //magic triplets
    //https://practice.geeksforgeeks.org/problems/magic-triplets4003/1
    //https://www.youtube.com/watch?v=mWGsPPEE7cM&ab_channel=SagarMalhotra

    public int countTriplets(int[] nums){


        int n= nums.length, ans=0;

        for( int i=1; i<n; i++){

            int ai=0;
            for( int k=0; k<i; k++){
                if( nums[k]<nums[i])ai++;
            }

            int ak=0;
            for( int k=i+1; k<n; k++){
                if( nums[k]>nums[i])ak++;
            }
            ans+=(ai * ak);



        }


        return ans;
    }


}
