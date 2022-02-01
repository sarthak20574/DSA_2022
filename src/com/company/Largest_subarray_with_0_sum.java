package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Largest_subarray_with_0_sum {

    //returning the max length
    public static int subarray_with_sum_0(int[] arr, int length){

        int length_of_biggest_subArray=0;
        for( int i=0 ; i<length; i++){
            int sum=0;
            for( int j=i; j<length;j++){
                sum+=arr[j];
                if(sum==0){
                    //System.out.println("found");

                    length_of_biggest_subArray=Math.max(length_of_biggest_subArray,j-i+1);

                }
            }
        }
        return length_of_biggest_subArray;
    }

    //using sets, 3,4,-1,4,3,-6,-7,2..... sum of 1,4,3,-6 =0 so sum of  3,4 and 3,4,-1,4,3,-6 are both
    static boolean findsum(int arr[],int n)
    {
        int sum=0;
        boolean ans= false;
        Set<Integer> set= new HashSet<>();

        //corner case
        //10 -10
        // so unclude sum 0 early too in the set so insert sum then update sum

        for (int i=0; i< n;i++){
            set.add(sum);
            sum+= arr[i];

            if( set.contains(sum)){
                ans=true;
                break;
            }
        }

        return ans;
    }

    //if sum is k then also if sum of first is 7 then after few elements
    // if we get the sum-k== 7 again then it exists
    // sum of 1st few elements= x and after few more elements its x+k then
    //if( set.contains(sum-k))





    //You are given an array arr[] of size n. Find the total count of sub-arrays having their sum equal to 0.
    public static long findSubarray(long[] arr ,int n)
    {
        long ans=0;
        long sum=0;

        Map<Long, Long> longMap= new HashMap<>();
        longMap.put(0L, 1L);

        for( int i=0 ; i< n; i++){
            sum+=arr[i];
            if( longMap.containsKey(sum)){
                ans+=longMap.get(sum);
                longMap.put(sum, longMap.get(sum)+1);
            }
            else {
                longMap.put(sum,1L);
            }
        }

        return ans;
    }


    //find the length of the largest subarray with 0 sum
    static int maxLen(int arr[]){

        int length= arr.length, sum=0, max=0;
        Map<Integer, Integer> integerMap= new HashMap<>();
        integerMap.put(0,-1);
        // -1 1 -1 1 as  so correct output is 4 but with .put(0,0) code gives 3, as the cumulative sum should be -1 0 -1 0
        //so the length of the 2 sub arrays should be 2 and 4 but the code gives 1 and 3

        for( int i=0 ; i<length; i++){
            sum+=arr[i];
            if(integerMap.containsKey(sum)){
                if( i-integerMap.get(sum)>max){
                    max=i-integerMap.get(sum);
                }
            }
            else {
                integerMap.put(sum,i);
            }

        }
        return max;
    }


// Print all subarrays with 0 sum

    static int printSubarraysWithSum0(int arr[]){

        int length= arr.length, sum=0, max=0;
        Map<Integer, Integer> integerMap= new HashMap<>();
        integerMap.put(0,-1);
        // -1 1 -1 1 as  so correct output is 4 but with .put(0,0) code gives 3, as the cumulative sum should be -1 0 -1 0
        //so the length of the 2 sub arrays should be 2 and 4 but the code gives 1 and 3

        for( int i=0 ; i<length; i++){
            sum+=arr[i];
            if(integerMap.containsKey(sum)){
                if( i-integerMap.get(sum)>max){
                    max=i-integerMap.get(sum);
                }
            }
            else {
                integerMap.put(sum,i);
            }

        }
        return max;
    }



}
