package com.company.LeetCode_DailyChallenge;

public class Count_the_Number_of_Incremovable_Subarrays_II {
    //2972. Count the Number of Incremovable Subarrays II
    //https://leetcode.com/problems/count-the-number-of-incremovable-subarrays-ii/
    //https://www.youtube.com/watch?v=VmTxOpyPtIE&t=2120s

    public long incremovableSubarrayCount(int[] nums) {


        int n= nums.length,f1=0, s1=n-1;
        long ans=0l;
        if( n==1) return 1;

        for( int i=1; i<n; i++){
            if( nums[i-1]<nums[i]){
                f1=i;
            }
            else break;
        }


        for( int j=n-1;j>=1 ; j--){
            if( nums[j-1]<nums[j]){
                s1=j-1;
            }
            else break;
        }

        System.out.print(f1);
        if( f1==n-1){
            return n*1L *(n*1l+1L)/2L;
        }

        int j=s1;
        for( int i=0; i<=f1; i++){
            while( j<n && nums[i]>=nums[j]){
                j++;
            }

            // for( int k=0; k<=i; k++){
            //      System.out.print(nums[k]);
            // }
            //System.out.println();

            //  for( int k=j; k<n; k++){
            //      System.out.print(nums[k]);
            // }
            // System.out.println();
            // System.out.println((n-j)+" added");System.out.println();
            ans+=n*1L-j*1L+1L;
        }
        ans+=n*1l-s1*1L+1L;

        return ans;
    }
}
