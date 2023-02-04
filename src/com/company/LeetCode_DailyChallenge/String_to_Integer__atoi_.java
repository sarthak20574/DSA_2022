package com.company.LeetCode_DailyChallenge;

public class String_to_Integer__atoi_ {

    //8. String to Integer (atoi)
    //https://leetcode.com/problems/string-to-integer-atoi/description/

    public int myAtoi(String s) {

        // has to be leading white spaces
        //- , +
        // till next digit
        // ""=0
        // " 0032"= 32

        //If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range.

        //integers less than -231 should be clamped to -231
        // integers greater than 231 - 1 should be clamped to 231 - 1
        // .

        int n= s.length();
        //System.out.println(n);

        long ans=0, sign= 1;


        int i=0;

        while( i<n && s.charAt(i)==' '){
            i++;
        }

        if( i<n && (s.charAt(i)=='+' || s.charAt(i)=='-') ){
            // System.out.println(i+ " "+ n);
            if( s.charAt(i)=='-'){
                sign=-1;
            }
            i++;
        }

        // System.out.println((int)(2e31));
        //System.out.println((int)(2e31 -1));

        while( i<n && '0'<=s.charAt(i) && s.charAt(i)<='9'){

            if( sign == -1){
                ans*=10;

                //System.out.println(i +" "+ n);
                //if( i==n) break;
                ans+=s.charAt(i)-'0';
                if( ans> 2147483648L){
                    // System.out.println((long)(2e31));
                    ans=  2147483648L;
                }
            }
            else{
                ans*=10;
                //System.out.println(i +" "+ n);
                //if( i==n) break;

                ans+=s.charAt(i)-'0';
                if( ans> (2147483647L)){

                    //System.out.println((long)(2e31 -1));
                    ans= 2147483647L;
                }
            }
            i++;
        }

        //System.out.println(sign+ " "+ans);

        return (int)(ans *sign);

    }


}
