package com.company.LeetCode_DailyChallenge;

import java.util.Stack;

public class Largest_Rectangle_in_Histogram {

    //84. Largest Rectangle in Histogram
    //https://leetcode.com/problems/largest-rectangle-in-histogram/
    //https://www.youtube.com/watch?v=X0X6G-eWgQ8&ab_channel=takeUforward

    public int largestRectangleArea(int[] arr) {

        int n=arr.length;

        Stack<Integer> s= new Stack<>();

        int[] l_r=new int[n] ;

        for( int i=0; i<n; i++){


            while( s.size()!=0 && arr[i]<=arr[s.peek()]){

                s.pop();
            }


            if( s.size()==0) l_r[i]=0;
            else l_r[i]=s.peek()+1;

            s.add(i);
        }

        s=new Stack<>();

        int[] r_l=new int[n] ;

        for( int i=n-1; i>=0; i--){


            while( s.size()!=0 && arr[i]<=arr[s.peek()]){

                s.pop();
            }


            if( s.size()==0) r_l[i]=n-1;
            else r_l[i]=s.peek()-1;

            s.add(i);
        }

        int ans=0;
        for( int i=0; i<n; i++){
            ans= Math.max(ans, arr[i]*(r_l[i]-l_r[i] +1));
        }

        return ans;
    }

}
