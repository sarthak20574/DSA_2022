package com.company;

import java.util.Stack;

public class Get_min_at_pop {

    //Get min at pop
    //https://practice.geeksforgeeks.org/problems/get-min-at-pop/1

    public static Stack<Integer> _push(int arr[],int n)
    {
        Stack<Integer> ans= new Stack<>();

        // if empty return  -1
        ans.add(arr[0]);
        for( int i=1; i<n ; i++){
            if( ans.peek()>arr[i]){
                ans.add( arr[i]);
            }
            else{
                ans.add(ans.peek());
            }
        }

        return ans;
    }

    //Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer>s)
    {

        while( s.isEmpty()==false){
            System.out.print(s.pop() +" ");
        }
    }
}
