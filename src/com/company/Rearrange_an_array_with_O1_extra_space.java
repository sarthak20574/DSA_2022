package com.company;

import java.util.Arrays;

public class Rearrange_an_array_with_O1_extra_space {

    // 0 to n-1....%n =b/w 0 and n-1
    //if /n then gives 0
    //if a=2 and b=3 and want to store both in the same variable
    // a+= b*n....now % get b, if / get a

    static void arrange(long arr[], int n)
    {
        for ( int i=0 ; i<n; i++){
            arr[i]+=(arr [(int) arr[i]] %n)*n;
            //System.out.println(i+":"+arr[i]);
        }
        //System.out.println();

        for( int i=0 ; i<n ; i++){
            arr[i]/=n;
            //System.out.println(i+":"+arr[i]);
        }
        //System.out.println(Arrays.toString(arr));

    }

    //Rearrange Geek and his Classmates
    //day 1

    void prank(long[] a, int n)
    {
        for( int i=0 ; i< n; i++){
            a[i]+= (a[(int) a[i]] %n)*n ;
        }


        for ( int i= 0; i< n; i++){
            a[i]/=n;
        }
    }

}
