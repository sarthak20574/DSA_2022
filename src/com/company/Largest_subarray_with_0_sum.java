package com.company;

import java.util.HashSet;
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


}
