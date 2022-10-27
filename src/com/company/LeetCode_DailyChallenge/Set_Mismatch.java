package com.company.LeetCode_DailyChallenge;

public class Set_Mismatch {

    //645. Set Mismatch
    //
    public int[] findErrorNums(int[] nums) {

        int[] ans= new int[2];
        int n= nums.length;

        for(int i: nums){
            if( nums[Math.abs(i)-1]<0) ans[0]= Math.abs(i);
            else nums[Math.abs(i)-1]*=-1;
        }


        for( int i=0; i< n; i++){
            if( nums[i]>0){
                ans[1]=i+1;
            }
        }
        return ans;

    }

    public int[] findErrorNums1(int[] nums) {

        int n= nums.length;
        boolean[] freq= new boolean[n+1];
        int[] ans= new int[2];

        for( int i:nums){

            if( freq[i]==true) ans[0]=i;
            freq[i]= true;
        }

        for( int i=1; i<n+1; i++){
            if( freq[i]==false) ans[1]=i;
        }

        return ans;

    }


}
