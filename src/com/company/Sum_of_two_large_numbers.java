package com.company;

public class Sum_of_two_large_numbers {

    //Sum of two large numbers
    //https://practice.geeksforgeeks.org/problems/sum-of-numbers-or-number1219/1

    String findSum(String x, String y) {

        int n = Math.min(x.length(), y.length());

        int i = x.length() - 1, j = y.length() - 1;

        StringBuilder ans = new StringBuilder();

        int carry = 0, digit_sum = 0;
        while (i >= 0 && j >= 0) {
            int a = x.charAt(i--) - '0';
            int b = y.charAt(j--) - '0';

            // System.out.print(a+" ");
            //  System.out.println(b);

            digit_sum = (a + b + carry) % 10;
            //System.out.println(digit_sum+" ");

            carry = (a + b + carry) / 10;
            //System.out.print(carry);

            ans.append(digit_sum);
        }
        while (i >= 0) {
            int a = x.charAt(i--) - '0';

            digit_sum = (a + carry) % 10;
            carry = (a + carry) / 10;
            ans.append(digit_sum);
        }
        while (j >= 0) {
            int b = y.charAt(j--) - '0';


            digit_sum = (b + carry) % 10;
            carry = (b + carry) / 10;

            ans.append(digit_sum);
        }

        if (carry != 0) {
            ans.append(carry);
        }

        StringBuilder final_ans = new StringBuilder();

        //remove training zeroes

        while (ans.length() > 0 && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }

        return ans.reverse().toString();

    }


}
