package com.company.non_leetcode_companyQuestion;

public class Count_Binary_Strings_With_No_Consecutive_1s {

    //Swiggy
    //Count Binary Strings With No Consecutive 1s
    //https://practice.geeksforgeeks.org/problems/37f36b318a7d99c81f17f0a54fc46b5ce06bbe8c/1
    //https://www.youtube.com/watch?v=H7tshfFTSvw&ab_channel=CodewithAlisha
    //https://www.youtube.com/watch?v=a9-NtLIs1Kk&ab_channel=TusharRoy-CodingMadeSimple



    /
    int mod = 1_000_000_007;

    public int countStrings(long n) {

        long x = 1, y = 1;

        for (int i = 2; i <= n; i++) {

            long t_x = x;
            x = x + y;
            y = t_x;

            x %= mod;
            y %= mod;
        }

        return (int) (x + y);

        /*

        x= x+y
        y= x
        */


        ///learn fib in (logn)
    }
}
