package com.company.LeetCode_DailyChallenge;

public class Optimal_Partition_of_String {

    //https://leetcode.com/problems/optimal-partition-of-string/description/
    public int partitionString(String s) {


        int  n= s.length(), ans=1;

        // freq array
        int[] freq= new int[26];

        // for string of length 0 ans=0;
        if( n==0)return 0;

        // we try to take as many elements as we can utill there are no duplicates
        for( int i=0; i<n; i++){

            int c= s.charAt(i)-'a';

            // if we find a duplicate we creat a new substring
            if( freq[c]==1){
                ans++;
                freq= new int[26];
            }

            freq[c]++;
        }

        return ans;


    }
}
