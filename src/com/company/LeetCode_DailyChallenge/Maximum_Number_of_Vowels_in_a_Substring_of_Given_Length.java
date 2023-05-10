package com.company.LeetCode_DailyChallenge;

public class Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length {

    //1456. Maximum Number of Vowels in a Substring of Given Length
    //https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/

    public int maxVowels(String s, int k) {

        int ans=0, cur=0, i=0, n= s.length();

        Set<Character> set= new HashSet<>();

        set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');

        for(; i<k && i<n; i++){
            if( set.contains(s.charAt(i))) cur++;

            ans= Math.max(cur, ans);

        }

        while( i<n){

            if( set.contains(s.charAt(i-k))) cur--;
            if( set.contains(s.charAt(i))) cur++;

            ans= Math.max(cur, ans);

            i++;
        }
        return ans;
    }
}
