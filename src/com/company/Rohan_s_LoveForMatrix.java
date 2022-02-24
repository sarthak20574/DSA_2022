package com.company;

public class Rohan_s_LoveForMatrix {

    //https://practice.geeksforgeeks.org/problems/rohans-love-for-matrix4723/1/

    /*
    a1=       1 1    1 1
              1 0    1 0

   a2=       2 1    1 1
             1 1    1 0

   a3=      3 2    1 1
            2 1    1 0

  a4=       5 3    1 1
            3 2    1 0

     */

    // it's following a fibonacci series....for 10'th element a1=1 a2= 1 then ai= ai-1 + ai-2

// moral of the story: always try some test cases manually

    static int firstElement(int n) {
        int a_minus2=1, a_minus1=1, ans=0;

        if ( n==1 || n == 2) return 1;

        else {
            for (int i = 3; i <=n ; i++) {
                ans=(a_minus1+a_minus2)% 1000000007;
                a_minus2=a_minus1;
                a_minus1=ans;
            }
            return ans ;
        }

    }

}
