package com.company;

import java.util.HashMap;
import java.util.Map;

public class A_Special_Keyboard {

    //A Special Keyboard
    //https://practice.geeksforgeeks.org/problems/228d0aa9f26db93ee5b2cb3583dbd4b197447e16/1

    static int findTime(String S1 , String S2) {

        Map<Character,Integer> map= new HashMap<>();

        int n=S1.length();
        for( int i=0; i< n ;i++){
            map.put(S1.charAt(i), i);
        }
        int ans=0, present_index=0;
        n= S2.length();
        for( int i=0; i< n; i++){
            ans+=Math.abs(map.get(S2.charAt(i))-present_index);
            present_index= map.get(S2.charAt(i));
        }
        return ans;
    }
}
