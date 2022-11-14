package com.company.LeetCode_DailyChallenge;

public class Median_in_a_row_wise_sorted_Matrix {

    //Median in a row-wise sorted Matrix
    // on gfg
    //https://www.youtube.com/watch?v=63fPPOdIr2c&ab_channel=takeUforward

    int median(int matrix[][], int r, int c) {

        int low= 0, high=1_000_000_000, no_ele_excluding_mid= (r*c)/2;
        while( low<=high){

            int mid= low + (high -low)/2;

            int no_of_ele_less_than_equal=0;
            for( int i=0; i<r; i++){
                no_of_ele_less_than_equal+=upperbound(matrix[i], c, mid);
            }

            // for 9 elements the median will be at the 5th position  9/2= 4 so if there are <=4 elements of mid
            // we move the mid ot the right else to the left

            if(no_of_ele_less_than_equal<=no_ele_excluding_mid){
                low= mid+1;
            }
            else{
                high= mid-1;
            }
        }

        return low;
    }

    private int upperbound(int[] arr, int n, int target) {


        int low= 0, high= n-1;

        while (low<=high){

            int mid= low+ (high - low)/2;

            if( arr[mid]<= target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        return low;
    }
}
