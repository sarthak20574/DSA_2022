package com.company.LeetCode_DailyChallenge;

public class Apply_Operations_to_Make_All_Array_Elements_Equal_to_Zero {

    //2772. Apply Operations to Make All Array Elements Equal to Zero
    //https://leetcode.com/problems/apply-operations-to-make-all-array-elements-equal-to-zero/description/

    public boolean checkArray(int[] nums, int k) {

        int n=nums.length;

        int cur=0;
        for( int i=0; i<n; i++){
            //k=3
            //0 1 _2 3 _4



            if( nums[i]<cur) return false;

            //System.out.println(i+" 1cur="+cur+" nums[i]="+nums[i]+" a[i]="+a[i]);

            nums[i]-=cur;

            //    if( i+k<n)
            cur+=nums[i];

            if(i-k+1>=0)
                cur-=nums[i-k+1];
            // else if( cur!=nums[i])
            //     return false;

            // if(i+k<n)
            //     cur-=nums[i];

            // if( i+k)
            // if(nums[i]!=0) return false;

            // System.out.println(i+" cur="+cur+" nums[i]="+nums[i]);
        }

        // System.out.println(Arrays.toString(nums));

        return cur==0;
    }
}
