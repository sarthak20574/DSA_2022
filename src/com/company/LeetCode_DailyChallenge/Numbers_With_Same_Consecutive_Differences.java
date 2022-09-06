package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;

public class Numbers_With_Same_Consecutive_Differences {


    //967. Numbers With Same Consecutive Differences
    //https://leetcode.com/problems/numbers-with-same-consecutive-differences/
    //https://www.youtube.com/watch?v=TAfXh2l9FyA&ab_channel=KnowledgeCenter

    public int[] numsSameConsecDiff(int n, int k) {

        ArrayList<Integer> ans= new ArrayList<>();

        // base case for 1 digit no we don't need  to worry about leading zeros
        if( n==1)ans.add(0);

        // iterating for all the digits 1-9 excluding 0 because leading zeros not allowed
        for( int i=1;i<=9; i++){
            dfs( ans,i,n-1,k);
        }

        // convert ArrayList<Integer> to int[]
        return ans.stream().mapToInt(i->i).toArray();


    }

    void dfs( ArrayList<Integer> ans, int cur, int n, int k){

        // if already n digits long add it to our answer
        if( n==0) ans.add( cur);

        else{
            // get the prev digit
            int prev=cur%10 ;

            // there are 2 possibilities for the next digit either prev - new_digit= k
            //or new_digit-prev = k,
            // giving us new_digit= k + prev or  = new_digit= prev - k
            // now  only need to check if our new digit is a valid digit ,ie, in the range 0-9(inclusive)

            if( prev+k<10){
                dfs( ans, cur*10+prev+k,n-1,k);
            }
            if( k>0 && prev-k>=0){
                dfs( ans, cur*10+prev-k,n-1,k);
            }
        }
    }
}
