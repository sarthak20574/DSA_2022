package com.company.LeetCode_DailyChallenge;

public class Count_Collisions_of_Monkeys_on_a_Polygon {

    //2550. Count Collisions of Monkeys on a Polygon
    //https://leetcode.com/problems/count-collisions-of-monkeys-on-a-polygon/description/

    // from lee's post
    //Each monkey can move in the clockwise or anti-clockwise direction,
//therefore 2 choices for each monkey

/// 2 * 2 *....n times

// for even we can also swap the values ie,
//1st clockwise, 2nd anticlockwise, 3rd clockwise, 4th anti....
// for even pow(2,n)-4;

    public int monkeyMove(int n) {

        int mod= 1000_000_007;

        long ans=1, a=2, t=2;

        while(n!=1){

            if( n%2==0){

                t= (t*t)%mod;
                n= n/2;
            }
            else{

                ans=( ans * t)%mod;
                n--;
            }
        }

        ans= (ans * t)%mod;

        return (int)((ans+mod-2)%mod);
    }

}
