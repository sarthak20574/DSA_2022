package com.company.LeetCode_DailyChallenge;

import java.util.HashSet;
import java.util.Set;

public class Unique_Morse_Code_Words {

    //804. Unique Morse Code Words
    //https://leetcode.com/problems/unique-morse-code-words/

    public int uniqueMorseRepresentations(String[] words) {

        String[] a={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> ans= new HashSet<>();
        for( int i=0; i<words.length; i++){
            StringBuilder x= new StringBuilder();

            for( int j=0; j<words[i].length(); j++){
                x.append(a[words[i].charAt(j) -'a']);
            }
            ans. add(x. toString());
        }

        return ans. size();
    }
}
