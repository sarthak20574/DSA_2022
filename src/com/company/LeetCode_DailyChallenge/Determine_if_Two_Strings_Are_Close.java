package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Determine_if_Two_Strings_Are_Close {

    //1657. Determine if Two Strings Are Close
    //https://leetcode.com/problems/determine-if-two-strings-are-close/description/

    public boolean closeStrings(String word1, String word2) {

        int[] arr1= new int[26];
        int[] arr2= new int[26];

        Set<Character> s1= new HashSet<>();
        Set<Character> s2= new HashSet<>();

        for(char c: word1.toCharArray()){
            s1.add(c);
            arr1[c-'a']++;
        }

        for(char c: word2.toCharArray()){
            s2.add(c);
            arr2[c-'a']++;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return s1.equals(s2) && Arrays.equals(arr1,arr2);

    }
}
