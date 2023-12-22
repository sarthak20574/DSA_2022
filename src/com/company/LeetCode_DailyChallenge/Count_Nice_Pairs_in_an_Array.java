package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Count_Nice_Pairs_in_an_Array {

    //1814. Count Nice Pairs in an Array
    //https://leetcode.com/problems/count-nice-pairs-in-an-array/description/?envType=daily-question&envId=2023-11-21

    long fn(int x){
        char[] s= String.valueOf(x).toCharArray();
        int i=0, j=s.length-1;

        while( i<j){
            char c= s[i];
            s[i]=s[j];
            s[j]=c;
            i++;j--;
        }
        return Long.parseLong(new String(s));
    }

    public int countNicePairs(int[] nums) {

        long ans=0l;


        Map<Long, Long> m= new HashMap<>();

        long mod= 1_000_000_007;

        for( int i: nums){

            long revi= fn( i);

            if( m.containsKey(i-revi)){
                ans= (ans+m.get(i-revi))%mod;
            }

            m.put(i-revi,m.getOrDefault(i-revi, 0L)+1L);
        }

        return (int)ans;
    }

}
