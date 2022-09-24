package com.company.LeetCode_DailyChallenge;

public class Pow_x__n_ {

    //50. Pow(x, n)
    //https://leetcode.com/problems/powx-n/
    //https://www.youtube.com/watch?v=l0YC3876qxg&ab_channel=takeUforward

    public double myPow(double x, int n) {

        // to prevent overflow store n to a long

        long y= n;


        if(y<0) y= -y;

        double ans=1;

        while( y>0){

            // if even we can change it to something like (2)^6= (2*2)^3
            if(y%2==0){
                x=(x*x);
                y=y/2;
            }
            else{
                // for odd we can change like 4^3= 4* (4^(3-1))
                y--;
                ans*=x;
            }

        }


        // if the power, ie, n is negative then take the reciprocal of the answer obtained by the positive power

        if( n<0) ans= 1.0/ans;

        return ans;


    }
}
