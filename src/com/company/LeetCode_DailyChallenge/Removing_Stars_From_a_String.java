package com.company.LeetCode_DailyChallenge;

import java.util.Stack;

public class Removing_Stars_From_a_String {


    //2390. Removing Stars From a String
    //https://leetcode.com/problems/removing-stars-from-a-string/

    // we store the characters in the string using a stack, whenever we see a star we pop the last char in the stack
    public String removeStars(String s) {
        Stack<Character> characterStack= new Stack<>();

        for(char i: s.toCharArray()){

            if(i!='*'){
                // just store the character in the stack
                characterStack.add(i);
            }
            else {
                //we see a star we pop the last char in the stack
                if( characterStack.size()>0)characterStack.pop();
            }
        }


        StringBuilder ans= new StringBuilder();

        // the remaining elements in the stack will be our answer
        while (characterStack.isEmpty()==false){
            ans.append(characterStack.pop());
        }

        // have to reverse our string
        return ans.reverse().toString();

    }
}
