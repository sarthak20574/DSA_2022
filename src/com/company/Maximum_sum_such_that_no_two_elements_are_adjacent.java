package com.company;

// INCOMPLETE

public class Maximum_sum_such_that_no_two_elements_are_adjacent {

    //maintain 2 sum=> incl=max_sum that includes the previous element
    //excl=max sum excluding the previous element
    // arr= {4,1,1,4,2,1}
    // starting incl= 4 and excl= 0
    //next step inclusive will be max of either the past inclusive or the (exclusive and this number)
    //max( 4, 0+1), we chose inclusive  and my new exclusive will be the old inclusive(as it was not chosen so its no longer
    // adjacent)
    // now pointing to index 2, max( inclusive, exclusive + present element)= max( 4, 4+1), so new inclusive = 5
    // and old inclusive becomes the new exclusive
    // incl=8 excl= 5

    void aVoid(long[] a){

        long incl=a[0], excl=0;

    }




    //take the cur ele or skip the cur ele
    //recursive

    static int[] dp= new int[1000001];

    int findMaxSum(int arr[], int size_minus_1){

        for (int i=0 ; i< size_minus_1; i++){
            dp[i]=-1;
        }
        return fn(arr,size_minus_1-1);
    }

    int fn(int arr[], int size_minus_1){

        if(size_minus_1<=-1) return 0;

        if( dp[size_minus_1]!=-1) return dp[size_minus_1];

        int including_cur=fn(arr,size_minus_1-2)+ arr[size_minus_1];
        int exclude_cur=fn(arr,size_minus_1-1);
        return dp[size_minus_1]=Math.max(including_cur,exclude_cur);
    }

}
