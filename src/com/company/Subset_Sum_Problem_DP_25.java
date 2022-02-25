package com.company;

public class Subset_Sum_Problem_DP_25 {

    // supply n as size-1 as the parameter
    static boolean recursion(int set[], int size, int sum){
        //https://www.geeksforgeeks.org/subset-sum-problem-dp-25/


        if( sum==0) return  true;

        else if( size ==0) return false; //as this will check the -1 index if the case is left unchecked

        // if the last element is
        else if ( set[size-1]>sum) return recursion(set, size-1, sum);

        else {
            return recursion(set, size -1, sum) ||recursion(set, size -1, sum- set[size-1]);
        }


    }
}
