package com.company;

public class Square_root_of_a_number {

    //count the number of square roots less then N
    //return (int) Math.sqrt(x-1);

    long floorSqrt(long n) {
        if( n==1) return 1;
        long start=0,end= n/2;
        long mid = (start+end)/2;
        while (start<=end){
            mid = (start+end)/2;

            if (mid*mid== n){
                return mid;
            }
            else if( mid*mid>n){
                end= mid-1;

                //to get the floor decrement mid in case it might be the last
                mid=mid-1;
            }
            else {
                start= mid+1;
            }
     }
        return mid;
    }


}
