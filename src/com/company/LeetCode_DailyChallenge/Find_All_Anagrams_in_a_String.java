package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Anagrams_in_a_String {
    //438. Find All Anagrams in a String
    //https://leetcode.com/problems/find-all-anagrams-in-a-string/
    //https://www.youtube.com/watch?v=fYgU6Bi2fRg&ab_channel=TECHDOSE


    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans= new ArrayList<>();

        //we create 2 frequency arrays of size 26( 26 letters in English) to keep a check on the elements in the element inside the start and end pointer.
        int[] pHash= new int[26];
        int[] sHash= new int[26];


        if(p.length()>s.length()) return ans;

        //we setup the pHash array
        for( int i=0; i<p.length(); i++){
            pHash[p.charAt(i)-'a']++;
        }

        // expand all the elements from index 0 to p.length()-1, ie, a window of length p.length()
        for( int i=0; i<p.length(); i++){
            sHash[s.charAt(i)-'a']++;
        }

        //if hashes are equal add the index 0
        if( arr_equal(pHash,sHash)) ans.add(0);

        int start= 0;
        int end=p.length();

        //now we increment the start and the end one by one, ie, shifting the window of size p.length() by 1 so we exclude the element at index start and include the element at index end and compare the 2 hash/frequency tables

        while( end<s.length()){
            sHash[s.charAt(start++)-'a']--;

            sHash[s.charAt(end++)-'a']++;

            if( arr_equal(pHash,sHash)) ans.add(start);
        }

        return ans;

    }


    // fn to check if the 2 arrays are the same or not
    boolean arr_equal(int[] arr1, int arr2[]){

        for( int i=0; i<26 ; i++){
            if( arr1[i]!=arr2[i])return false;
        }
        return true;
    }


}
