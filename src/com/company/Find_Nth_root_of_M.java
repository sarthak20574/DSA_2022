package com.company;

public class Find_Nth_root_of_M {

    //Find Nth root of M
    //https://practice.geeksforgeeks.org/problems/find-nth-root-of-m5843/1

    public int NthRoot(int n, int m)
    {
        int low=0, high= m;

        while( low<= high){

            int mid= (low+high)/2;

            int val= (int) Math.pow( mid, n);

            if( val==m) return mid;
            else if(val < m){
                low=mid+1;
            }
            else{
                high= mid-1;
            }
        }


        return -1;
    }

}
