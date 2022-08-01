package com.company.LeetCode_DailyChallenge;

import java.util.Stack;

public class Remove_K_Digits {

    //402. Remove K Digits
    //https://leetcode.com/problems/remove-k-digits/
    //https://www.youtube.com/watch?v=3QJzHqNAEXs&ab_channel=TECHDOSE

    public String removeKdigits(String num, int k) {

        Stack<Character> s= new Stack<>();

        if( num.length()<=k) return "0";

        int i=0;
        while(i<num.length()){
            while( k>0 && s.isEmpty()==false && s.peek()>num.charAt(i)){
                k--;
                s.pop();
            }
                s.add(num.charAt(i++));
        }

        // for 12345 remove the last k letters
        while( s.isEmpty()==false && k>0){
            s.pop();k--;
        }

        StringBuilder ans= new StringBuilder();

        while( s.isEmpty()==false){
            ans.append( s.pop());
        }
        ans.reverse();

        //remove the leading 0s
        while(ans.length()>1 && ans.charAt(0)=='0')
            ans.deleteCharAt(0);

        return ans.toString();
    }


    //or

    public String removeKdigits1(String num, int k) {

        Stack<Character> s= new Stack<>();

        int i=0;

        // we are removing all the peaks so in 1 3 1, 3 is the peak so we remove it
        // k peaks are removed

        while(i<num.length() && k>0){
            while( k>0 && s.isEmpty()==false && s.peek()>num.charAt(i)){
                k--;
                s.pop();
            }

            s.add(num.charAt(i++));
        }


        // for 12345( no peaks) remove the last k letters
        while( s.isEmpty()==false && k>0){
            s.pop();k--;
        }

        //redevelop the string
        StringBuilder ans= new StringBuilder();

        while( s.isEmpty()==false){
            ans.append( s.pop());
        }
        ans.reverse();

        // add the remaining elements that didn't need to participat in the stack
        for( ;i<num.length(); i++){
            ans.append(num.charAt(i));
        }

        while(ans.length()>1 && ans.charAt(0)=='0')
            ans.deleteCharAt(0);

        //if there are no elements than add 0 as the answer
        if( ans.isEmpty()==true) ans.append(0);

        return ans.toString();
    }
}
