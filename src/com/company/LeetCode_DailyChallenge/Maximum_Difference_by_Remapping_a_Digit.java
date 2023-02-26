package com.company.LeetCode_DailyChallenge;

public class Maximum_Difference_by_Remapping_a_Digit {

    //2566. Maximum Difference by Remapping a Digit
    //https://leetcode.com/problems/maximum-difference-by-remapping-a-digit/description/


    public int minMaxDifference(int num) {

        int ans=0;


        StringBuilder x= new StringBuilder(num+"");

        int n= x.length();

        if( n==1) return 9;

        // hunting for 1st non 9

        int k=-1;

        for (int i=0; i<n; i++){
            if( x.charAt(i)!='9') {

                k = x.charAt(i)-'0';
                break;
            }
        }

        StringBuilder maxx= new StringBuilder(num+"");


        if( k!=-1){
            for (int i=0; i<n; i++){
                if( x.charAt(i)-'0'==k) {

                    maxx.setCharAt(i, '9');
                }
            }
        }


        ans+= Integer.parseInt(maxx.toString());
        //System.out.println(maxx.toString());


        // hunting 1st non 0

        k=-1;

        for (int i=0; i<n; i++){
            if( x.charAt(i)!='0') {

                k = x.charAt(i)-'0';
                break;
            }
        }

        maxx= new StringBuilder(num+"");


        if( k!=-1){
            for (int i=0; i<n; i++){
                if( x.charAt(i)-'0'==k) {

                    maxx.setCharAt(i, '0');
                }
            }
        }

        //System.out.println(maxx.toString());
        return ans-Integer.parseInt(maxx.toString());

    }


}
