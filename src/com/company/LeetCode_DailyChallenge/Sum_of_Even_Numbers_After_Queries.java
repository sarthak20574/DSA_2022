package com.company.LeetCode_DailyChallenge;

public class Sum_of_Even_Numbers_After_Queries {


    //Sum of Even Numbers After Queries
    //https://leetcode.com/problems/sum-of-even-numbers-after-queries/description/

    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {

        int n= nums.length, even_sum=0;


        // find all the sum of all the even elements
        for( int i=0; i< n; i++){
            if( nums[i]%2==0)  even_sum+=nums[i];
        }

        int nn= nums.length;

        int[] ans = new int[nn];

        int i=0;
        for( var x: queries){

            int value= x[0];
            int ind= x[1];

            //if the current element at the particular index is even, subtract it from the even_sum
            if( nums[ind]%2==0){
                even_sum-= nums[ind];
            }

            // now we add the value
            nums[ind]+=value;


            // if the new element( after adding value) is even we add it to our even_sum
            if(  nums[ind]%2==0){
                even_sum+= nums[ind];
            }

            ans[i++]= even_sum;

        }

        return ans;
    }

}
