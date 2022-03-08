package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Find_the_closest_pair_from_two_arrays {


    public static ArrayList<Integer> printClosest(int arr[], int brr[], int n, int m, int x) {

        int i=0, j=m-1, least_difference=Integer.MAX_VALUE, ans1 = 0, ans2=0;

        while(i<n && j>=0){

            // positive means we got to increase the  '1' 2 3 4 5 and 1 2 3 4 '5', so increase first pointer i

            if( Math.abs(x-(arr[i]+brr[j]))<least_difference){// not <= else will
                ans1=arr[i];
                ans2= brr[j];
                // don't forget to update the current least_difference
                least_difference=Math.abs(x-arr[i]-brr[j]);
            }
            if(x-(arr[i]+brr[j])==0){
                // got the exact answer
                ans1=arr[i];
                ans2= brr[j];
                break;
            }
            else if( x-(arr[i]+brr[j])>0){
                i++;
            }
            else {
                j--;
            }
        }

        ArrayList<Integer> ans= new ArrayList<>();
        ans.add(ans1); ans.add(ans2);

        return ans;

    }


}
