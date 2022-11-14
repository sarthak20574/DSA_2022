package com.company;

import java.util.PriorityQueue;
import java.util.Queue;

public class Jumping_Numbers {

    //Jumping Numbers
    //https://practice.geeksforgeeks.org/problems/jumping-numbers3805/1
    // can see sagar malhotra's vid

    static long ans=-1;
    static long jumpingNums(long X) {

        ans=-1;

        Queue<Long> q= new PriorityQueue<>();

        for( int i=1; i<=9; i++){
            q.add((long) i);
            if( X<i) return i-1;

            // System.out.println(i);
        }

        long cur=9;

        // System.out.println(cur+" "+ X);
        while( cur<X){


            int n= q.size();

            for( int i=0; i<n; i++){

                cur= q.poll();

                if( cur>X) continue;

                ans= Math.max( ans, cur);

                long last_digit=cur%10;

                long num1=0;
                if( last_digit!=0)
                {
                    num1= cur*10 + (last_digit-1);
                    q.add(num1);
                }

                // System.out.println(cur+" "+ X);



                //  System.out.println(ans);

                long num2=9;
                if( last_digit!=9){
                    num2= cur*10 + (last_digit+1);
                    q.add(num2);
                }


            }
        }


        return ans;
    }
}
