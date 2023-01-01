package com.company.LeetCode_DailyChallenge;

public class Partition_String_Into_Substrings_With_Values_at_Most_K {


    //2522. Partition String Into Substrings With Values at Most K
    //https://leetcode.com/problems/partition-string-into-substrings-with-values-at-most-k/description/

    public int minimumPartition(String s, int k) {

        long cur=0;

        int ans=1, n=s.length();


        for( int i=0;i<n; i++){
            if( (s.charAt(i)-'0')>k) return -1;
            cur= cur*10+ s.charAt(i)-'0';
            if( cur>k){
                ans++;
                cur=s.charAt(i)-'0';
            }
        }

        return ans;
    }
}
