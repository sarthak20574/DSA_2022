package com.company;

import java.util.Stack;

public class Geeks_And_The_String {

    //Geeks And The String
    //https://practice.geeksforgeeks.org/problems/466faca80c3e86f13880710491c634d26abd44a7/1


    public static String removePair(String w) {


        Stack<Character> s= new Stack<>();
        int n=w.length();
        s.add( w.charAt(0));

        for( int i=1; i<n; i++){

            if( s.isEmpty()==false && s.peek()==w.charAt(i)){
                s.pop();
            }
            else{
                s.add(w.charAt(i));
            }

        }


        StringBuilder ans=new StringBuilder();

        while(s.isEmpty()==false){
            ans.append(s.pop());
        }

        return ans.length()==0? "-1": ans.reverse().toString();
    }
}
