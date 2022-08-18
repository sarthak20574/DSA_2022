package com.company.LeetCode_DailyChallenge;

import java.util.*;

public class Group_Anagrams {

    //49. Group Anagrams
    //https://leetcode.com/problems/group-anagrams/
    //https://www.youtube.com/watch?v=vzdNOK2oB2E&ab_channel=NeetCode

    public List<List<String>> groupAnagrams(String[] strs) {

        // map of string as key as List of string as the
        Map<String, List<String> > m= new HashMap<>();
        int n= strs.length;


        for( int i=0; i<n; i++){

            // creating a frequency array and the initialising it
            int[] arr= new int[26];
            for( char c: strs[i].toCharArray()) arr[c-'a']++;

            // convert the character array into a string and use it as a key
            //eg: {0, 2, 0, 5, 6} will convert into "{0, 2, 0, 5, 6}"
            String key= Arrays.toString(arr);

            // if we haven't seen this key, create it
            if( m.containsKey(key)==false)
                m.put( key, new ArrayList<>());

            // now add the current string to the map
            m.get(key).add(strs[i]);

        }

        // return the values of the map as the answers
        return new ArrayList<>(m.values());
    }
}
