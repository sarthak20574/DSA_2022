package com.company.LeetCode_DailyChallenge;

public class Reverse_Integer {

    //7. Reverse Integer
    //https://leetcode.com/problems/reverse-integer/description/

    public int reverse(int x) {

        char c= x>=0?'+':'-';
        // if( x==Math.pow())

        long l= x;
        long t= Math.abs(l);
        //System.out.println(c+" "+t);

        StringBuilder ans= new StringBuilder(String.valueOf(t));

        // - sign,


        ans= ans.reverse();

        t= Long.parseLong(ans.toString());

        if( c=='-'){
            t= -t;
        }

        if( t>=Math.pow(-2,31) && t<=(Math.pow(2,31)-1)){

            return (int)t;
        }
        else return 0;

//        return 0;


    }
}
