package com.company.LeetCode_DailyChallenge;

public class Remove_Digit_From_Number_to_Maximize_Result {

    //2259. Remove Digit From Number to Maximize Result
    //https://leetcode.com/problems/remove-digit-from-number-to-maximize-result/description/
    public String removeDigit(String number, char digit) {

        int del=0;
        for( int i=0; i<number.length(); i++){
            if( number.charAt(i)==digit){
                if( i+1<number.length()){
                    if( number.charAt(i+1)>digit) {
                        del=i;
                        break;
                    }
                }
                del=i;
            }
        }

        return new StringBuilder(number).deleteCharAt(del).toString();

//        if( Long.parseLong(x1.toString())>Long.parseLong(x2.toString())) return x1.toString();
//        else return x2.toString();
    }
}
