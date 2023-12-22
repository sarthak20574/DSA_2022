package com.company.LeetCode_DailyChallenge;

import java.util.HashSet;
import java.util.Set;

public class Unique_Length_3_Palindromic_Subsequences {

    //1930. Unique Length-3 Palindromic Subsequences
    //https://leetcode.com/problems/unique-length-3-palindromic-subsequences/description/?envType=daily-question&envId=2023-11-14


    //  https://leetcode.com/problems/unique-length-3-palindromic-subsequences/solutions/1330165/leftmost-rightmost-and-in-between/
    //or
    //https://www.youtube.com/watch?v=4GvOWeoKQK8

    public int countPalindromicSubsequence(String s) {

        int ans=0, n= s.length();

        int[][] m= new int[26][2];

        for( int i=0; i<26; i++){
            m[i][0]=Integer.MAX_VALUE;
        }

        for(int i=0; i<n; i++){

            m[s.charAt(i)-'a'][0]= Math.min( i, m[s.charAt(i)-'a'][0]);
            m[s.charAt(i)-'a'][1]= i;
        }

        for( int i=0; i<26; i++){

            int st= m[i][0], end= m[i][1];
            Set<Character> kk= new HashSet<>();

            if( st>n) continue;

            // System.out.println(((char)('a'+i))+" "+st+" "+end);
            for( int j=st+1; j<end; j++){
                kk.add(s.charAt(j));
            }
            ans+=kk.size();
        }

        return ans;
    }

}
