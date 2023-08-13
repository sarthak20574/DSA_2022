package com.company.LeetCode_DailyChallenge;

public class Minimum_Flips_to_Make_a_OR_b_Equal_to_c {

    //1318. Minimum Flips to Make a OR b Equal to c
    //https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/description/
    // see aryan mittal's vid

    public int minFlips(int a, int b, int c) {

        int ans=0;

        while( a!=0 || b!=0 || c!=0){
            int x=a & 1, y=b & 1, z= c & 1;

            if( z==1){
                ans+=((x==0 && y==0) ?1:0);
            }
            else{
                ans+=x+y;
            }
            a>>=1;b>>=1;c>>=1;
        }

        return ans;
    }
}
