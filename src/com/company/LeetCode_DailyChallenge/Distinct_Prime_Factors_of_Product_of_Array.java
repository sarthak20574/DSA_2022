package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Distinct_Prime_Factors_of_Product_of_Array {

     //2521. Distinct Prime Factors of Product of Array
    //https://leetcode.com/problems/distinct-prime-factors-of-product-of-array/description/

    public int distinctPrimeFactors(int[] nums) {

        long product= 1, ans=0;

        Set<Integer> s= new HashSet<>();

        List<Integer> primes= new ArrayList<>();

        for( int i=2; i<=1000; i++){
            if( fn(i)==true){
                primes.add(i);
            }
        }
        for( int i: nums){

            for( int p: primes){
                if( i%p==0) s.add(p);
            }
        }

        return s.size();
    }

    boolean fn(int i){

        for( int k=2; k<i; k++){
            if( i%k==0) return false;
        }
        return true;
    }
}
