package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Fact_Digit_Sum {

    //Fact Digit Sum
    //https://practice.geeksforgeeks.org/problems/fact-digit-sum4125/1

    ArrayList<Integer> FactDigit(int N)
    {

        ArrayList<Integer> ans= new ArrayList<>();

        int[] fact= {1,1,2,6,24,120,720,5040,40320,362880};

        int i=fact.length-1;

        while(i>=0){

            if( N>=fact[i]){
                ans.add(i);
                N-=fact[i];
            }
            else{
                i--;
            }
        }


        Collections.reverse(ans);

        return ans;

    }
}
