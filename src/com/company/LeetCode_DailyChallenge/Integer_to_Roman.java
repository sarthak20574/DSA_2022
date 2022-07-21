package com.company.LeetCode_DailyChallenge;

import java.util.Map;
import java.util.HashMap;

public class Integer_to_Roman {

    //12. Integer to Roman
    //https://leetcode.com/problems/integer-to-roman/
    //https://www.youtube.com/watch?v=ohBNdSJyLh8&ab_channel=NeetCode

    public String intToRoman(int num) {

        StringBuilder ans=new StringBuilder();

        String[][] k= new String[][]{{"1000","M"},{"900","CM"}, {"500", "D"},{"400","CD"}, {"100", "C"},{"90","XC"},
                {"50","L"},{"40","XL"},{"10","X"},{"9","IX"},{"5","V"},{"4","IV"},{"1","I"}};

        int size= k.length;

        for( int i=0; i<size; i++){
            if( num/Integer.parseInt(k[i][0])>0){
                int n1=num/Integer.parseInt(k[i][0]);
                String x= k[i][1].repeat(n1);
                ans.append(x);
                num=num %Integer.parseInt(k[i][0]);
            }
        }
        return ans.toString();
    }
}
