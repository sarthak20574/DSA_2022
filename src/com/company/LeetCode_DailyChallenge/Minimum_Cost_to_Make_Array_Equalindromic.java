package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Minimum_Cost_to_Make_Array_Equalindromic {

    //2967. Minimum Cost to Make Array Equalindromic

    //https://leetcode.com/problems/minimum-cost-to-make-array-equalindromic/description/
    // https://www.youtube.com/watch?v=gYoaR_LNBno&ab_channel=AryanMittal

    public long minimumCost(int[] nums) {

        // 1 2 3 4 5
        // 1 2 3 2 1
        // 1 2 4 2 1
        // 1 2 3 4
        // 1 2 2 1
        //1 3 3 1

        Arrays.sort(nums);
        int n= nums.length;

        long m= n%2==0?((nums[n/2-1]+ nums[n/2])/2):nums[n/2] ;

        return fn(m, nums);

    }
    long fn( long x, int[] nums){
        StringBuilder k=new StringBuilder(String.valueOf(x));
        int n= k.length();
        StringBuilder p1, p22, p33, p2, p3;


        // 0 1 2 3 4
        // 0 1 2 1 0
        //substr(0,n/2)

        if (n % 2 != 0) {
            p1=new StringBuilder();
            p1.append(k.substring(0, n/2));
            p1.append(k.charAt(n/2));
            p1.append((new StringBuilder(k.substring(0, n/2)).reverse()));
            //k.substring(0, n/2)+ k.charAt(n/2)+new StringBuilder(k.substring(0, n/2));


            // 9 1 2 3 4
            // 9 1 3 1 0( if 0 1 9 3 4  therefere (k.substring(0, n/2)+ k.charAt(n/2)+1).substring
            //9 1 0 5 6==>

            p2=new StringBuilder();
            p2.append(k.substring(0, n/2));
            p2.append(k.charAt(n/2));
            long t= Long.parseLong(p2.toString());
            t+=1;
            p22=new StringBuilder(String.valueOf(t));
            //  if( p22.length()%2!=0){
            p22.append((new StringBuilder(p22.substring(0, p22.length()-1)).reverse()));
            //  }
            // else {
            //   p22.append((new StringBuilder(p22.substring(0, p22.length())).reverse()));
            //  }


            p3=new StringBuilder();
            p3.append(k.substring(0, n/2));
            p3.append(k.charAt(n/2));
            long t1= Long.parseLong(p3.toString());
            t1-=1;
            p33=new StringBuilder(String.valueOf(t1));
            // if( p33.length()%2!=0){
            p33.append((new StringBuilder(p33.substring(0, p33.length()-1)).reverse()));
            //  }
//            else {
//                p33.append((new StringBuilder(p33.substring(0, p33.length())).reverse()));
//            }
        }
        else{
            //0 1 2 3 4 5  0 1 2 2 1 0

            p1=new StringBuilder();
            p1.append(k.substring(0, n/2));
            //p1.append(k.charAt(n/2));
            p1.append((new StringBuilder(k.substring(0, n/2)).reverse()));
            //k.substring(0, n/2)+ k.charAt(n/2)+new StringBuilder(k.substring(0, n/2));


            // 9 1 2 3
            // 9 1 3 1 0( if 0 1 9 3 4  therefere (k.substring(0, n/2)+ k.charAt(n/2)+1).substring
            //9 1 0 5 6==>

            p2=new StringBuilder();
            p2.append(k.substring(0, n/2));
            // p1.append(k.charAt(n/2));
            long t= Long.parseLong(p2.toString());
            t+=1;
            p22=new StringBuilder(String.valueOf(t));
            //p22.append((new StringBuilder(p22.substring(0, p22.length())).reverse()));
//            if( p22.length()%2!=0){
//                p22.append((new StringBuilder(p22.substring(0, p22.length()-1)).reverse()));
//            }
//            else {
            p22.append((new StringBuilder(p22.substring(0, p22.length())).reverse()));
            // }

            p3=new StringBuilder();
            p3.append(k.substring(0, n/2));
            // p3.append(k.charAt(n/2));
            long t1= Long.parseLong(p3.toString());
            t1-=1;
            p33=new StringBuilder(String.valueOf(t1));
            //p33.append((new StringBuilder(p33.substring(0, p33.length())).reverse()));
//            if( p33.length()%2!=0){
//                p33.append((new StringBuilder(p33.substring(0, p33.length()-1)).reverse()));
//            }
//            else {
            p33.append((new StringBuilder(p33.substring(0, p33.length())).reverse()));
//}

        }
        long po= (long)Math.pow(10, n-1);
        if( x==po){
            System.out.println(x);
            p33= new StringBuilder(String.valueOf((x-1)));
        }
        System.out.println(p1.toString()+" "+p22.toString()+" "+p33.toString());


        // if( x==1){
        //     p1=
        // }

        long ans=Long.MAX_VALUE, cur=0;
        for( int i: nums){
            cur= cur+1L*(Math.abs(i-Long.parseLong(p1.toString())));
        }

        ans= Math.min(ans, cur);

        cur=0;
        for( int i: nums){
            cur= cur+1L*(Math.abs(i-Long.parseLong(p22.toString())));
        }

        ans= Math.min(ans, cur);


        cur=0;
        for( int i: nums){
            cur= cur+1L*(Math.abs(i-Long.parseLong(p33.toString())));
        }

        ans= Math.min(ans, cur);



        return ans;
    }
}
