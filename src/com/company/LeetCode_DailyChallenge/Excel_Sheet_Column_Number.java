package com.company.LeetCode_DailyChallenge;

public class Excel_Sheet_Column_Number {

    //171. Excel Sheet Column Number
    //https://leetcode.com/problems/excel-sheet-column-number/description/

    public int titleToNumber(String col) {
        int ans=0;

        for( char i: col.toCharArray()){

            ans*=26;
            ans+=i-'A'+1;


            //ans+=temp;
        }
        return ans;
    }

}
