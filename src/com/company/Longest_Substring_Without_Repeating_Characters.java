package com.company;

import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters {

    //https://www.youtube.com/watch?v=3IETreEybaA

    static int longestSubstrDistinctChars(String S){

        int n= S.length();

        int ans=0;
        int ptr1=0, ptr2=0;

        HashSet<Character> map= new HashSet<>();

        while (ptr2<n){

            if( !map.contains(S.charAt(ptr2))){
                map.add(S.charAt(ptr2));
                ptr2++;
                ans= Math.max(ans, map.size());
            }
            else {
                map.remove(S.charAt(ptr1));
                ptr1++;
            }
        }
        return ans;
    }
}
