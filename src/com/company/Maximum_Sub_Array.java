package com.company;

import java.util.ArrayList;

public class Maximum_Sub_Array {

    //Maximum Sub Array
    //https://practice.geeksforgeeks.org/problems/maximum-sub-array5443/1


    ArrayList<Integer> findSubarray(int a[], int n) {

        int st=0, end=0, max_sum=0, max_len=0;
        int cur_st=0, cur_end=0, cur_sum=0, cur_len=0;


        int i=0,j=0;
        while( i<n && j< n){

            cur_sum=0;
            while( j<n && a[j]>=0){
                cur_sum+=a[j];
                j++;
            }

            if( max_sum< cur_sum){
                st=i;
                end=j;
                max_sum=cur_sum;
            }
            else if( max_sum == cur_sum){
                if( j-i+1 >max_len){
                    st=i;
                    end=j;
                }
            }
            i=++j;
        }


        ArrayList<Integer> ans= new ArrayList<>();
        for( int k=st; k<end; k++){
            ans. add( a[k]);
        }



        if( max_sum==0){
            ans= new ArrayList<>();
            ans.add(-1);
        }

        return ans;


    }
}
