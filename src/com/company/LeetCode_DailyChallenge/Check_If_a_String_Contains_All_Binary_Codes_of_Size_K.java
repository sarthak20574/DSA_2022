package com.company.LeetCode_DailyChallenge;

import java.util.HashSet;
import java.util.Set;

public class Check_If_a_String_Contains_All_Binary_Codes_of_Size_K {

    //1461. Check If a String Contains All Binary Codes of Size K
    //https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/
    //https://www.youtube.com/watch?v=Xh1y1j8K1nk

    public boolean hasAllCodes(String s, int k) {
        Set<String> stringSet= new HashSet<>();

        int n= s.length();
        for( int i=0;i<n-k+1; i++){
            stringSet.add(s.substring(i, i+k));
        }

        return ( stringSet.size()== Math.pow(2,k));
    }

    /*
    in c++

    bool hasAllCodes(string s, int k) {
    int n= s.size();
    unordered_set<string> string_set;
    for( int i=0; i<n-k+1; i++){
        string_set.insert( s.substr(i, k)); //substring starting from ith index containing the next k characters
        }
        return string_set.size()==pow(2,k);
    }

     */
}
