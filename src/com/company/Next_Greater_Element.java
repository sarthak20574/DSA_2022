package com.company;

import java.util.Stack;

public class Next_Greater_Element {

    //Next Greater Element
    //https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1/#
    //https://www.youtube.com/watch?v=sDKpIO2HGq0&ab_channel=TECHDOSE

    public static long[] nextLargerElement(long[] arr, int n)
    {
        Stack<Integer> s= new Stack<>();

        long[] ans= new long[n];

        for( int i=0; i<n ; i++){

            if(s.size()!=0){
                while(s.size()!=0 && arr[i]>arr[s.peek()]){
                    ans[s.pop()]=arr[i];
                }

            }

            s.add(i);

        }

        while( s.size()!=0){
            ans[s.pop()]=-1;
        }

        return ans;

    }
}
