package com.company.LeetCode_DailyChallenge;

public class Reverse_Words_in_a_String_III {


    public String reverseWords(String s) {


        String[] x= s.split(" ");
        StringBuilder ans = new StringBuilder();

        for( String i: x){
            ans.append( new StringBuilder(i).reverse());
            ans.append( " ");
        }


        return ans.substring(0, ans.length()-1).toString();
    }
}
