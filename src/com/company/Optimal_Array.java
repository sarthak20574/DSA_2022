package com.company;

public class Optimal_Array {

    //Optimal Array
    //https://practice.geeksforgeeks.org/problems/d4aeef538e6dd3280dda5f8ed7964727fdc7075f/1



    /*
    by mridulbhaskarabc

    First of all this is already mathematically proved that median provides the optimal sum through comparing each element of the array.Click here for explanation.
Now let us suppose that we are given with array 1,2,3,4,5,6,7,8,9;
Then in this case for n = 4[even].Then given subarray will be 1,2,3,4;then median will be (arr[1]+arr[2])//2.The optimal sum would be [(median-1)+(median-2)+(3-median)+(4-median)] = sum2-sum1 [where sum2 = total sum of elements after median to ith term and sum1 = total sum of elements starting from 0th index upto median only]
Similarly for n = 5[odd].In this case consider the subarray to be 1,2,3,4,5;then median will arr[2] = 3.Thus,The optimal sum would be [(median-1)+(median-2)+(4-median)+(5-median)] = sum2-sum1 [where sum2 = total sum of elements after median to ith term and sum1 = total sum of elements starting from 0th index upto median only].
Thus in both cases the optimal sum at index ith would definitely equals sum2 and sum1.
now sum1 is sum upto median term which can be calculated easily by adding the value when even index is encountered.
And,sum2 can be calculated by sliding window rule,slide the windows when odd index is encoutered.
Finally return the ans array.
    */


    public long[] optimalArray(int n, int[] a) {

        long[] dp= new long[n];
        long[] ans= new long[n];


        dp[0]=a[0];
        for( int i=1; i<n; i++){
            dp[i]= dp[i-1]+a[i];
        }


        // 1 7 16 28

        ans[0]=0;
        int med;

        for( int i=1; i<n; i++){

            // even index ie odd no of otems
            if( i%2==0){

                med= i/2;

                long sum2= dp[i]- dp[med], sum1= dp[med-1];
                ans[i]= sum2- sum1;
            }
            else{

                long sum2= dp[i]- dp[i/2], sum1= dp[i/2];
                ans[i]= sum2- sum1;
            }

        }
        return ans;

    }


}
