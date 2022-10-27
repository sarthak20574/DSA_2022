package com.company.LeetCode_DailyChallenge;

import java.util.List;

public class Maximum_Length_of_a_Concatenated_String_with_Unique_Characters {

    //1239. Maximum Length of a Concatenated String with Unique Characters
    //https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters/

    int ans=0;
    public int maxLength(List<String> arr) {
        int n= arr.size();
        ans=0;

        fn( arr, "", 0, n);
        return ans;

    }

    void fn( List<String> arr,String cur_ans,int i, int n){

        //base case

        // if reached the end of the string list then
        if( i==n) {

            //check if there are any repeating characters if no then we try updating our answer
            if( hasRepeatingChar(cur_ans)==false){
                ans= Math.max( ans, cur_ans.length());
            }

            // then we return since this is the end of the list
            return;
        }

        // if there are any repating character then we simply return
        if( hasRepeatingChar( cur_ans) ==true) return;


        // we have 2 options either to include or and not include it the string at index i

        //include the string at index i
        fn(arr, (new StringBuilder(cur_ans).append(arr.get(i))).toString(), i+1, n);

        //not include the string at index i
        fn(arr, cur_ans, i+1, n);;
    }



    boolean  hasRepeatingChar( String x){

        // there are 26 letters in the english alphabet so create a freq counter for each character
        int[] freq= new int[26];

        for( char i: x.toCharArray()){
            freq[i-'a']++;

            //if the freq counter for a character is >1 we have found atleast 2 occurences of that particular character so we return true
            if( freq[i-'a']>1)return true;
        }
        return false;
    }


}
