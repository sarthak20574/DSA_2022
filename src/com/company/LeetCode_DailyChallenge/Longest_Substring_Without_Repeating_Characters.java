package com.company.LeetCode_DailyChallenge;


import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {

    //3. Longest Substring Without Repeating Characters
    //https://leetcode.com/problems/longest-substring-without-repeating-characters/
    public int lengthOfLongestSubstring(String s) {

        int ans=0;
        int n= s.length();
        int i=0,j=0;
        Set<Character> x= new HashSet<>();

        while(j<n){

            while ( j<n && x.contains(s.charAt(j))==false){
                x.add( s.charAt(j));
                j++;
            }
            ans= Math.max(ans, x.size());
            x.remove(s.charAt(i));
            i++;
        }
        return ans;
    }
}
