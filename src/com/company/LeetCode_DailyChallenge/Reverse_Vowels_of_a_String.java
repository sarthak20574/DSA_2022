package com.company.LeetCode_DailyChallenge;

import java.util.HashSet;
import java.util.Set;

public class Reverse_Vowels_of_a_String {

    //345. Reverse Vowels of a String
    //https://leetcode.com/problems/reverse-vowels-of-a-string/description/


    public String reverseVowels(String str) {


        Set<Character> s= new HashSet<>() ;

        for( char c: "aeiouAEIOU".toCharArray()){
            s.add( c);
        }

        // for( char x: s){
        //     System.out.println(x);

        // }


        int n= str.length();
        int i=0, j= n-1;

        StringBuilder ans= new StringBuilder(str);

        while (i<j){
            while ( i<n && s.contains(ans.charAt(i))==false){
                i++;
            }
            while ( j>=0 && s.contains(ans.charAt(j))==false){
                j--;
            }

            if(i<j){

                char t= ans.charAt(i);
                ans.setCharAt(i,ans.charAt(j));
                ans.setCharAt(j, t);
                i++;
                j--;
            }
        }

        return ans. toString();
    }
}
