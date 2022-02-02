package com.company;

// count the no. of set bits, if there is 1 set bit( or one 1) then it's a power of 2

public class a_given_number_is_power_of_2 {

    // x<<1(left shift) = x*2, x>>1(right shift) = x/2

    // x= 10000 x-1= 01111 so x & x-1 = 0 then x is a power of 2
    public static boolean isPowerofTwo(long n){
        if( n==0) return false;

        return (n & n-1)==0;

    }


    //but limit ceil to 4 or 5 decimal digits
    // if(n==0) return false;
    //
    //
    //
    //         return (Math.ceil((Math.log(n)/Math.log(2)))-Math.floor((Math.log(n)/Math.log(2)))==0);
    ////



}
