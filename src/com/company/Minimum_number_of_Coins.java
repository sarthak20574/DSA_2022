package com.company;

import java.util.ArrayList;
import java.util.List;

public class Minimum_number_of_Coins {

    //Minimum number of Coins
    //https://practice.geeksforgeeks.org/problems/-minimum-number-of-coins4426/1

    static List<Integer> minPartition(int n)
    {
        List<Integer> ans= new ArrayList<>();

        int val[]={ 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};


        int i=0;
        while(n>0){
            while( n-val[i]>=0){
                ans.add( val[i]);
                n-=val[i];
            }
            i++;
        }
        return ans;



    }
}
