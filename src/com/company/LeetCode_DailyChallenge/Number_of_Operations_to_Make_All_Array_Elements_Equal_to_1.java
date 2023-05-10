package com.company.LeetCode_DailyChallenge;

import java.math.BigInteger;

public class Number_of_Operations_to_Make_All_Array_Elements_Equal_to_1 {


//2654. Minimum Number of Operations to Make All Array Elements Equal to 1
//https://leetcode.com/problems/minimum-number-of-operations-to-make-all-array-elements-equal-to-1/description/

//https://leetcode.com/problems/minimum-number-of-operations-to-make-all-array-elements-equal-to-1/solutions/3445895/smallest-subarray-gcd-equal-to-1-very-simple-easy-to-understand-solution/

    public int minOperations(int[] nums) {

        int minn=Integer.MAX_VALUE, n= nums.length, ones=0;

        for( int i: nums){
            if( i==1) ones++;
        }

        if( ones>0) return n-ones;

        for( int i=0; i<n; i++){
            BigInteger cur= new BigInteger(String.valueOf(nums[i]));
            for(int j=i+1; j<n; j++){
                BigInteger x1= new BigInteger(String.valueOf(nums[j]));
                cur= cur.gcd(x1);
                // System.out.println(cur.intValue()+ " i="+ nums[i]+" j="+x1.intValue());
                if( cur.intValue()==1){
                    minn =Math.min(j-i, minn);
                }
            }
        }
        return minn==Integer.MAX_VALUE?-1:minn+ n-1;
    }
}
