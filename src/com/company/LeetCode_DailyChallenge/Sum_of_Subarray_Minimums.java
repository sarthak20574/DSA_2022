package com.company.LeetCode_DailyChallenge;

import java.util.Stack;

public class Sum_of_Subarray_Minimums {

    //907. Sum of Subarray Minimums
    //https://leetcode.com/problems/sum-of-subarray-minimums/description/

    public int sumSubarrayMins(int[] arr) {

        int  n= arr.length; long mod=1_000_000_007;

        long ans=0;

        Stack<Integer> stack= new Stack<>();

        //adding as the first element just to mark the end
        stack.add(-1);

        for( int i=0; i<n; i++){

            while(stack.peek()!=-1 && arr[stack.peek()]>arr[i]){

                int popi= stack.pop();

                int peeka=stack.peek();

                long left= (popi-peeka)%mod;
                long right= ( i- popi)%mod;



                //ans=(ans+  (arr[popi]* (left *right)%mod) % mod ) %mod
                ans=(ans+  (arr[popi]* (left *right)%mod) % mod ) %mod;


            }

            stack.add(i);
        }

        // clearing the remaining stack
        int ryt_boundry=n;

        // to remove all elements we try adding the smallest elemnt
        while(stack.peek()!=-1 && arr[stack.peek()]>Integer.MIN_VALUE){

            int popi= stack.pop();

            int peeka=stack.peek();

            long left= (popi-peeka)%mod;
            long right= ( ryt_boundry- popi)%mod;

            long x = (long)(left * right * (long)arr[popi]) % mod;
            ans += x ;
            ans %= mod;

        }


        return (int)ans;
    }
}
