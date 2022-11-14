package com.company.LeetCode_DailyChallenge;

import java.util.Stack;

public class Remove_All_Adjacent_Duplicates_In_String {

    //1047. Remove All Adjacent Duplicates In String
    //https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/

    /*
    we iterate the elements in a stack if the element at the top is the same as the incoming element we delete it.

else we add it to the stack. The remaining elements in the stack is our answer.
     */

    public String removeDuplicates(String str) {

        Stack<Character> s= new Stack<>();

        for( char c: str.toCharArray()){
            if( s.isEmpty()==false && s.peek()==c){
                s.pop();
            }
            else{
                s.add( c);
            }
        }


        StringBuilder ans= new StringBuilder();

        while( s.isEmpty()==false){
            ans.append( s.pop());
        }


        // reverse it as stack is first in last out
        return ans.reverse().toString() ;
    }
}
