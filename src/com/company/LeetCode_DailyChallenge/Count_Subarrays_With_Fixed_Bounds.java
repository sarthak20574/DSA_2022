package com.company.LeetCode_DailyChallenge;

public class Count_Subarrays_With_Fixed_Bounds {

    //2444. Count Subarrays With Fixed Bounds
    //https://leetcode.com/problems/count-subarrays-with-fixed-bounds/description/
    //https://leetcode.com/problems/count-subarrays-with-fixed-bounds/solutions/2707995/simple-o-n-c-solution/


    public long countSubarrays(int[] nums, int minK, int maxK) {

        long ans=0;

        int minn_i=-1, maxx_i=-1, valid=0;
        boolean minn_reached=false, maxx_reached=false;

        for( int i=0; i<nums.length; i++){

            if( nums[i]>maxK || nums[i]<minK){
                minn_reached=false;
                maxx_reached=false;
                valid=i+1;
            }

            if(  nums[i]==maxK ){
                maxx_i=i;
                maxx_reached=true;
            }
            if( nums[i]== minK){
                minn_reached= true;
                minn_i=i;
            }

            if( minn_reached==true && maxx_reached==true){

                ans+= Math.min( minn_i, maxx_i)- valid +1 ;
            }

        }

        return  ans;
    }

}
