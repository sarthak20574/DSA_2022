package com.company.LeetCode_DailyChallenge;

public class Valid_Parenthesis_String {

    //678. Valid Parenthesis String
    //https://leetcode.com/problems/valid-parenthesis-string/description/
    //https://www.youtube.com/watch?v=QhPdNS143Qg&ab_channel=NeetCode


    public boolean checkValidString(String s) {

        //Stack<Character> st= new Stack<>();

        int maxx=0, minn=0;

        for( char c: s.toCharArray()){

            if( c==')'){

                maxx--;
                minn= Math.max( minn-1, 0);

                //if( maxx<0) return false;
                if(minn>maxx) return false;
            }
            else if( c=='*'){
                maxx++;
                minn= Math.max( minn-1, 0);
            }
            else{
                maxx++;
                minn++;
            }
            // System.out.println( maxx+" "+minn);
        }

        if( minn<=0 && maxx>=0)return true;

        return false;
    }

}
