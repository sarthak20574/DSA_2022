package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Longest_Palindrome_by_Concatenating_Two_Letter_Words {

    //2131. Longest Palindrome by Concatenating Two Letter Words
    //https://leetcode.com/problems/longest-palindrome-by-concatenating-two-letter-words/description/

    public int longestPalindrome(String[] words) {


        Map<String, Integer> m= new HashMap<>();



        //for equal words like aa bb
        // we keep a check on the unused equal pairs
        // as soon as we find another same pair we can form a palindrome like aaaa if we find 2 aa's

        //for unequal pairs like ab we search for ba and try pairing it
        //  abba is a palindrome

        // at the end we see if we have a unused equal pair of yes then we can use it too to form a palindrome

        int ans=0, free_equal=0;

        for( String x: words){

            if(  x.charAt(0)==x.charAt(1)){

                if(m.getOrDefault( x,0)>0){
                    m.put(x,0);
                    free_equal--;

                    ans+=4;
                }
                else{
                    m.put(x,1);
                    free_equal++;
                }
            }
            else {
// if x= ab search for ba
                String search_key= x.charAt(1)+""+x.charAt(0);
                if( m.getOrDefault( search_key,0)>0){
                    m.put(search_key,m.get(search_key)-1);

                    ans+=4;
                }
                else{
                    m.put(x,m.getOrDefault( x,0)+1);
                }
            }

        }


        if( free_equal>0) ans+=2;

        return ans;
    }
}
