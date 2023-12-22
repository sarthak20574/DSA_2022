package com.company.LeetCode_DailyChallenge;

public class Minimum_One_Bit_Operations_to_Make_Integers_Zero {

    //1611. Minimum One Bit Operations to Make Integers Zero
    //https://leetcode.com/problems/minimum-one-bit-operations-to-make-integers-zero/description/?envType=daily-question&envId=2023-11-30
    //https://www.youtube.com/watch?v=yRI18_MaG7k

    public int minimumOneBitOperations(int n) {
        return fn( n);
    }

    int fn( int n){
        if( n==0) return 0;
        int cur=0;
        while(1<<cur <=n ) cur++;
        cur--;
        return ((1<<(cur+1))-1- fn( n ^ (1<<cur)));
    }
}
