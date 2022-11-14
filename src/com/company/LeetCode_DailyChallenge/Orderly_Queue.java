package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Orderly_Queue {


    //899. Orderly Queue
    //https://leetcode.com/problems/orderly-queue/description/
    //https://www.youtube.com/watch?v=-ryxBLATIUQ&ab_channel=CodingDecoded


    public String orderlyQueue(String s, int k) {

        String ans=s;

        if( k==1){

            for( int i=0;i<s.length(); i++ ){
                String temp= s.substring(i)+ s.substring(0,i);

                // comparte them
                if( ans.compareTo(temp)>0){
                    ans= temp;
                }
            }
        }
        else{
            char[] arr= s.toCharArray();
            Arrays.sort( arr);
            ans= new String(arr);
        }

        return ans;
    }
}
