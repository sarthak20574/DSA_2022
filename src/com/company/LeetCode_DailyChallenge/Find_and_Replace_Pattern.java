package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Find_and_Replace_Pattern {

    //890. Find and Replace Pattern
    //https://leetcode.com/problems/find-and-replace-pattern/submissions/
    //https://www.youtube.com/watch?v=V8W_Nmuruis&ab_channel=CodewithAlisha

    public List<String> findAndReplacePattern(String[] words, String pattern) {

        List<String> ans= new ArrayList<>();

        for( String x: words){
            if( fn(x, pattern)==true)ans.add(x);
        }

        return ans;
    }

    boolean fn( String w, String p){

        Map<Character, Character> m1= new HashMap<>();
        Map<Character, Character> m2= new HashMap<>();


        if( w.length()!= p.length()) return false;

        for( int i=0; i<w.length(); i++){

            if( m1.containsKey(w.charAt(i)) && m2.containsKey(p.charAt(i))){

                if( m1.get(w.charAt(i))==p.charAt(i) &&  m2.get(p.charAt(i))==w.charAt(i)){
                    continue;
                }
                else{
                    return false;
                }
            }
            else if(  m1.containsKey(w.charAt(i))==false && m2.containsKey(p.charAt(i))==false){
                m1.put(w.charAt(i), p.charAt(i));
                m2.put(p.charAt(i), w.charAt(i));
            }
            else return false;
        }
        return true;
    }

}
