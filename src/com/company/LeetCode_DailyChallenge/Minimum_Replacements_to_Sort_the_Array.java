package com.company.LeetCode_DailyChallenge;

public class Minimum_Replacements_to_Sort_the_Array {

    //2366. Minimum Replacements to Sort the Array
    //https://www.youtube.com/watch?v=2QEcQe95_ro&ab_channel=AryanMittal

    public long minimumReplacement(int[] nums) {


        int n= nums.length;

        // we can only reduce it so don't increase


        long prev=nums[n-1];

        long ans=0;

        for( int i=n-2; i>=0; i--){


            long no_parts= (long)Math.ceil((double)nums[i]/(double)prev);

            long part= nums[i]/no_parts;

            long rem=0;
            // if( nums[i]%no_parts!=0){
            //     rem= nums[i]%no_parts;
            // }
            // else rem= part;

            // // 9/3=3   3 3 3   10/3 = 4  3 3 2 2

            // prev=rem;
            prev =nums[i]/no_parts;

            ans+= no_parts-1;
        }

        return ans;
    }

}
