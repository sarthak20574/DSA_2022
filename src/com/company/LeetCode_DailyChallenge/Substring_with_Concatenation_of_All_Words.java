package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Substring_with_Concatenation_of_All_Words {

    //30. Substring with Concatenation of All Words
    //https://leetcode.com/problems/substring-with-concatenation-of-all-words/
    //https://www.youtube.com/watch?v=Bbu4Qjzf7A0&ab_channel=CodingSimplified

    public List<Integer> findSubstring(String s, String[] words) {


        Map<String, Integer> freq= new HashMap<>();

        List<Integer> ans= new ArrayList<>();
        int n= words.length, length_each_word= words[0].length();

        for(int i=0; i<n; i++){
            freq.put( words[i], freq.getOrDefault(words[i],0)+1);
        }


        for( int i=0; i<= s.length()- n *length_each_word; i++){


            Map<String, Integer> cur= new HashMap<>();

            for( int j=0; j<n; j++){

                int index= i+ j*  length_each_word;


                String x=s.substring( index, index+  length_each_word);

                if( freq.containsKey(x)== false) break;


                cur.put( x, cur.getOrDefault(x,0)+1);

                if( cur.get(x)>
                        freq.getOrDefault((x),0))
                    break;

                if( n== j+1) ans.add(i);
            }

        }

        return ans;

    }
}
