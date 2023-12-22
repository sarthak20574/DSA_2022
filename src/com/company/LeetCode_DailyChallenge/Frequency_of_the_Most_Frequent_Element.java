package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Frequency_of_the_Most_Frequent_Element {

    //1838. Frequency of the Most Frequent Element
    //https://leetcode.com/problems/frequency-of-the-most-frequent-element/description/?envType=daily-question&envId=2023-11-18
    // see lee's post
    public int maxFrequency(int[] nums, int k) {

        Arrays.sort( nums);
        int j= 0, ans=1;
        long cur=0;
        for( int i=0; i<nums.length; i++){
            // System.out.println( cur );
            cur+=nums[i];
            // System.out.println( cur+" "+nums[i]+" "+prev );


            while( j<i && cur+k<(i-j+1)* nums[i]){
                //  System.out.println( "in");
                //  System.out.println( cur );
                cur-=nums[j];
                //System.out.println( cur+" "+nums[i]+" "+prev );
                j++;
            }
            ans= Math.max( i-j+1, ans);
        }

        return ans;

    }
}

