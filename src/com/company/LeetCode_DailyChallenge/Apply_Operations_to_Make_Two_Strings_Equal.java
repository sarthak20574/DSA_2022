package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Apply_Operations_to_Make_Two_Strings_Equal {

    //2896. Apply Operations to Make Two Strings Equal
    //https://leetcode.com/problems/apply-operations-to-make-two-strings-equal/
    //https://leetcode.com/problems/apply-operations-to-make-two-strings-equal/solutions/4143983/intuitive-python-o-n-dp-simple-readable-code/


    double[] dp;
    public int minOperations(String s1, String s2, int x) {

        // no of ones not equal and difference not even return -1

        List<Integer> diff= new ArrayList<>();

        for( int i=0; i<s1.length(); i++){

            if( s1.charAt(i)!=s2.charAt(i)){
                diff.add(i);
            }
        }

        dp= new double[diff.size()];

        Arrays.fill( dp, -1.0);

        if( diff.size()%2!=0) return -1;

        return (int)fn( 0,diff, x);
    }

    double fn(int i, List<Integer> diff, int x){

        if( i==diff.size()) return 0;

        if( dp[i]!=-1) return dp[i];

        double cur= 1.0 * x/2 + fn(i+1, diff, x);

        if( i+1< diff.size())
            cur= Math.min(cur, 1.0 *diff.get(i+1)- 1.0* diff.get(i) + fn(i+2, diff, x));

        dp[i]= cur;
        return cur;
    }

}
