package com.company;

import java.util.HashMap;
import java.util.Map;

public class Count_pairs_in_array_divisible_by_K {

    //https://practice.geeksforgeeks.org/problems/count-pairs-in-array-divisible-by-k/1
    //https://www.youtube.com/watch?v=IUami0pKijo

    public static long countKdivPairs(int arr[], int n, int k) {

        Map<Integer, Integer> x= new HashMap();
        long ans=0;

        for( int i=0; i< n; i++){
            int r= arr[i]%k;

            if(r!=0){
                ans+= x.getOrDefault(k-r,0);
            }
            else {
                ans+=x.getOrDefault(0,0);
            }

            if( x.containsKey(r)){
                x.put(r,x.getOrDefault(r,0)+1);
            }
        }
        return ans;
    }

    /*
    //in cpp

    long long countKdivPairs(int A[], int n, int k)
    {

        long long ans=0;
        unordered_map<int,int> x;

    for( int i=0; i< n; i++){
        int r= A[i]%k;
        if( r!=0){
            ans+=x[k-r];
        }
        else{
            ans+=x[0];
        }
        x[r]++;

    }
    return ans;
    }
     */
    //in cpp

}
