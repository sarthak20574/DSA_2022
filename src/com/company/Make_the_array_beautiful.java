package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class Make_the_array_beautiful {

    //Make the array beautiful
    //https://practice.geeksforgeeks.org/contest/interview-series-60/problems/#
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        ArrayList<Integer> ans=new ArrayList<>();

        int n =arr.length;
        Stack<Integer> s= new Stack<>();
        s.add(arr[0]);

        for(int i=1; i<n ; i++){
            if( s.isEmpty()==false && (s.peek()>=0 && arr[i]<0 ||
                    s.peek()<0 && arr[i]>=0)){
                s.pop();
            }
            else{
                s.add( arr[i]);
            }
        }

        int k= s.size()-1;
        //System.out.println(k);
        //initializing the arrayList
        for( int i=0; i<=k; i++){
            ans.add(0);
        }

        while( s.isEmpty()==false){
            ans.set(k--,s.pop());

        }


        return ans;
    }
}
