package com.company;

import java.util.ArrayList;

public class SieveOfEratosthenes {

    // print all prime numbers till n
    static ArrayList<Integer> primeRange(int starting_number, int ending_number){

        int arr[] =new int[ending_number +1];

        for (int i = 0; i <= ending_number; i++) {
            arr[i]=1;
        }

        //1- true, 0-false

        arr[0]=0;
        arr[1]=0;

        for(int i = 2; i<= ending_number; i++){

            if( arr[i]==1){
                int j=2;
                while (i*j<= ending_number){
                    arr[i*j++]=0;
                }
            }
        }

        ArrayList<Integer> ans= new ArrayList<>();
        for (int i = starting_number; i <= ending_number; i++) {
            if(arr[i]==1)
                ans.add(i);
        }

        return ans;
    }
}
