package com.company;

import java.util.Vector;

public class Kadane_Algorithm {


    //local max subarrays sum either this element or the current element combined with previous max sub array
    // max = element or element + max or the combination of m and the , let [T,x] be so T is nonempty else would be just x
    // then need to show
    //[T,x]<= [M,x] so [T,x] = T+x and [M,x] M +x
    //we know that M is the largest sum ending at the previous index its at least larger than or equal to sum of T
    // which is also  the sum of subarray ending at the previous element so sum(T)<=sum(M)

    // if a subarray gives negtive the discard it...if( present_sum<0) present_sum=0;
    static int max_sum_of_subsequence(int[] arr, int length){

        int present_sum=0;
        int max_sum_as_of_now=0;
        for( int i=0 ; i<length; i++){

            present_sum+=arr[i];
            if( max_sum_as_of_now<present_sum){
                max_sum_as_of_now=present_sum;
            }
            if( present_sum<0) present_sum=0;
        }
        return max_sum_as_of_now;

    }


    //for leetcode

    public int maxSubArray(int[] nums) {

        int ans=nums[0];
        int maax=nums[0];

        for( int i=1; i<nums.length; i++){

            maax= Math.max( maax+ nums[i],nums[i]);
            ans= Math.max(ans, maax);
            if( maax<0) maax= 0;

        }
        return ans;
    }

    static int oNsquare(int[] arr, int lenght){
        int sum=0,ans=0;
        for(int i=0 ;i<lenght; i++){
            sum=0;
            for (int j=i ; j<lenght;j++){

                sum+=arr[j];

                if( sum>ans) ans=sum;
            }
        }
        return ans;

    }

    // DP in C++

//    long long maxSubarraySum(int arr[], int n){
//
//        long long DP[n+1];
//        DP[0]=0;
//
//        for( int i=1;i<=n;i++){
//            DP[i]= max((long long)arr[i-1], DP[i-1]+((long long) arr[i-1]));
//        }
//
//        long long ans=arr[0];
//        for( int i=1 ; i<=n; i++){
//            //cout<<DP[i]<<" ";
//            ans= max(DP[i], ans);
//        }
//
//        return ans;
//    }














    //You are given a binary string str. In a single operation, you can choose two indices L and R such that 1 ≤ L ≤ R ≤ N and
    // complement the characters between L and R i.e strL, strL+1, …, strR. By complement, we mean change character 0 to 1 and
    // vice-versa.
    //You task is to perform ATMOST one operation such that in final string number of 1s is maximised. If there is no need
    // to completement, i.e., string contains all 1s, return -1. Else, return the two values denoting L and R. If there are
    // multiple solutions,
    // return the lexicographically smallest pair of L and R.

    // maximise the no. of zeros
    static Vector<Integer> findRange(String str, int n) {
        Vector<Integer> ans= new Vector<>();

        int left_index = 0, right_index = 0, max_sum=0, local_lower=0, oneCount=0,zeroCount=0;

        for( int i= 0; i< n; i++){

            if( str.charAt(i)=='0') zeroCount++;

            else
                oneCount++;

            if( oneCount>zeroCount) {
                // like sum has gone negative so reset lower and the sums to 0
                local_lower=i+1;
                oneCount = 0;
                zeroCount=0;
            }

            if( zeroCount-oneCount>max_sum ){
                max_sum=zeroCount-oneCount;
                left_index=local_lower;
                right_index=i;
            }
        }
        
        if( max_sum==0) ans.add(-1);
        
        else {
            ans.add(left_index+1);
            ans.add(right_index+1);
        }



        return ans;
    }
}
