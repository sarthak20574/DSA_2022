package com.company.LeetCode_DailyChallenge;

import java.util.Stack;

public class Decode_String {


    //394. Decode String
    //https://leetcode.com/problems/decode-string/submissions/
    //https://www.youtube.com/watch?v=qB0zZpBJlh8&ab_channel=NeetCode

    public String decodeString(String s) {

        Stack<Character> word= new Stack<>();

        int n=s.length();
        int i=0;

        while( i<n) {

            if (s.charAt(i) == ']') {
                StringBuilder x = new StringBuilder();
                while (word.peek() != '[') {
                    x.insert(0,word.pop());
                }
                // remove '['
                word.pop();

                int digit = 1, no = 0;
                while ( word.isEmpty()==false && word.peek() >= '0' && word.peek() <= '9') {
                    no = no + (word.pop() - '0')* digit;
                    digit *= 10;
                }

                // System.out.println(no);
                // System.out.println(x.toString());
                StringBuilder yy= new StringBuilder();
                for (int j = 0; j < no; j++)
                    yy.append(x);

                x=yy;
                // System.out.println(x.toString());
                for( int k=0; k<x.length();k++){
                    word.add(x.charAt(k));
                }
            }
            else{
                word.add(s.charAt(i));
            }
            i++;

        }
        StringBuilder ans= new StringBuilder();
        while( word.isEmpty()==false){
            ans.append(word.pop());
        }
        return ans.reverse().toString();
    }


}
