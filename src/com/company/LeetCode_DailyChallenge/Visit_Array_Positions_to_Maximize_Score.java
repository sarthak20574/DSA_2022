package com.company.LeetCode_DailyChallenge;

public class Visit_Array_Positions_to_Maximize_Score {

    //2786. Visit Array Positions to Maximize Score
    //https://leetcode.com/problems/visit-array-positions-to-maximize-score/description/


    public long maxScore(int[] nums, int x) {

        //
        //-5,

        //2 3 6 1 9 2
        //2 + 3-5, 2 +0   even just add, odd n-1 +num[i]


        //2+ 3-5+


        int n= nums.length;

        long[] dp1 = new long[n], dp2= new long[n];

        dp1[0]= nums[0]+ ((nums[0]%2==0)?0:-x);
        dp2[0]= nums[0]+  ((nums[0]%2==1)?0:-x);

        for( int i=1; i<n; i++){
            if( nums[i]%2==0){
                dp1[i]= Math.max(dp1[i-1]+nums[i], dp2[i-1]+nums[i]-x);
                dp2[i]= dp2[i-1];
            }
            else{
                dp1[i]= dp1[i-1];
                dp2[i]= Math.max(dp2[i-1]+nums[i], dp1[i-1]+nums[i]-x);
            }
        }
        // System.out.println(Arrays.toString(dp1));
        //  System.out.println(Arrays.toString(dp2));

        return Math.max( dp1[n-1], dp2[n-1]);

    }

}
