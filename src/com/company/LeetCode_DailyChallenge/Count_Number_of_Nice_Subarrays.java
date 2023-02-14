package com.company.LeetCode_DailyChallenge;

public class Count_Number_of_Nice_Subarrays {

    //1248. Count Number of Nice Subarrays
    //https://leetcode.com/problems/count-number-of-nice-subarrays/description/

    public int numberOfSubarrays(int[] nums, int k) {

        // atmost k - atmost k-1

        return (int) (fn( nums, k)- fn( nums, k-1));
    }

    long fn( int[] nums, int k){

        int j=0, n= nums.length, odds=0;
        long ans=0;

        for( int i=0; i<n; i++){

            if( nums[i]%2==1) odds++;

            while(odds>k){
                if( nums[j]%2==1) odds--;
                j++;
            }
            //System.out.println(i+" "+j+" "+odds+" "+k);

            ans+=i-j+1;
        }

        return ans;
    }

}
