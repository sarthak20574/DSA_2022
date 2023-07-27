package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;

public class Largest_Element_in_an_Array_after_Merge_Operations {

    //2789. Largest Element in an Array after Merge Operations
    //https://leetcode.com/problems/largest-element-in-an-array-after-merge-operations/description/


    public long maxArrayValue(int[] nums) {
//         // 2,3,7, 1,2,5 ,3

//         //last ele - sum
//         sort( by sum)

        ArrayList<Long> cur= new ArrayList<>();

        int n= nums.length;

        long sum=0L;
        int i=n-1;
        while(  i>=0){
            if( sum>=nums[i]) {
                sum+=nums[i];
            }
            else{
                cur.add(sum);
                sum=nums[i];
            }

            i--;
        }
        cur.add(sum);


        long ans=0;
        for( long x: cur)
            ans= Math.max(ans, x);

        return ans;
    }


}
