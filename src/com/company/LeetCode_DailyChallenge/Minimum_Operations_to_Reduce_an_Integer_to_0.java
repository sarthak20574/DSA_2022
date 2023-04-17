package com.company.LeetCode_DailyChallenge;

public class Minimum_Operations_to_Reduce_an_Integer_to_0 {

    //2571. Minimum Operations to Reduce an Integer to 0
    //https://leetcode.com/problems/minimum-operations-to-reduce-an-integer-to-0/description/
    // https://leetcode.com/problems/minimum-operations-to-reduce-an-integer-to-0/solutions/3203994/java-c-python-1-line-solution/

    public int minOperations(int n) {

        int ans=0;


        while( n>0){

            // if the end is like 3 ie, 11
            if( (n & 3) == 3){
                n++;
                ans++;
            }
            else{
                ans+=(n&1);
                n>>=1;

            }
        }

        return ans;

    }


}
