package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Roman_to_Integer {

    //13. Roman to Integer
    //https://leetcode.com/problems/roman-to-integer/
    //

    public int romanToInt(String s) {

        Map<Character, Integer> map= new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);



        int ans=0;

        for( int i=0; i<s.length()-1; i++){

            // for V! ans= 5 + 1= 6
            if( map.get(s.charAt(i)) >= map.get(s.charAt(i+1))) ans+=map.get(s.charAt(i));
            else{

                // for IV ans= -1 + 5 =4
                ans-=map.get(s.charAt(i));
            }

        }

        ans+=map.get(s.charAt(s.length()-1));

        return ans;
    }
}
