package com.company.LeetCode_DailyChallenge;

public class Categorize_Box_According_to_Criteria {

    //2525. Categorize Box According to Criteria
    //https://leetcode.com/problems/categorize-box-according-to-criteria/description/
    public String categorizeBox(int l, int w, int h, int m) {

        boolean bulky=false,heavy= false;

        long vol= (long)l * w * h;


        if( l>=10000 || w>= 10000 || h>=10000 || vol>= 1000_000_000) bulky=true;

        if( m>=100) heavy=true;


        if( bulky && heavy) return "Both";
        else if( !bulky && !heavy) return "Neither";
        else if( heavy) return "Heavy";
        else return "Bulky";

        //return "";


    }

}
