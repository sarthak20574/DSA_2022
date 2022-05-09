package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number {

    // 17.  Letter Combinations of a Phone Number
    //https://leetcode.com/problems/letter-combinations-of-a-phone-number/
    //https://www.youtube.com/watch?v=21OuwqIC56E&ab_channel=KevinNaughtonJr.

    //can have 4^n outputs as somme keys have 4 letters

    public List<String> letterCombinations(String digits) {
        String[] mapping={"0", "1","abc", "def", "ghi", "jkl","mno","pqrs","tuv","wxyz"};
        List<String> ans= new ArrayList<>();

        if( digits==null || digits.length()==0) return ans;
        backTracking( digits, mapping,ans, "", 0);
        return ans;
    }

    private void backTracking(String digits, String[] mapping, List<String> ans,
                              String string, int i) {
        // base case
        if( digits.length()== i){
            ans.add(string);
            return;
        }

        String charac= mapping[digits.charAt(i)-'0'];
        for( int j=0; j< charac.length(); j++){
            backTracking(digits, mapping, ans, string+charac.charAt(j),i+1);
        }
    }
}
