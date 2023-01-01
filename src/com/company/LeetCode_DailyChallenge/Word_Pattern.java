package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Word_Pattern {


    //290. Word Pattern
    //https://leetcode.com/problems/word-pattern/description/


    public boolean wordPattern(String p, String s) {

        Map<Character, String> m= new HashMap<>();
        Map<String, Character> m1= new HashMap<>();

        String[] words= s.split(" ");

        if( p.length()!=words.length) return false;

        int k=0;

        for( Character i:p.toCharArray()){

            if( ((m.containsKey(i)==true) && (m.get(i).equals(words[k])==false )) ||
                    ((m1.containsKey(words[k])==true) && (m1.get(words[k]).equals(i)==false ))){
                return false;
            }
            m.put(i,words[k]);
            m1.put( words[k++], i);
        }

        return true;

    }

}
