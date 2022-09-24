package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Smallest_number_on_left {



    //Smallest number on left
    //https://practice.geeksforgeeks.org/problems/smallest-number-on-left3403/1


    static List<Integer> leftSmaller(int n, int a[])
    {

        List<Integer> ans= new ArrayList<>();

        Stack<Integer> s= new Stack<>();

        for( var i : a){
            while( s.isEmpty()==false && s.peek()>=i){
                s.pop();
            }

            if( s.isEmpty()==true){

                ans.add(-1);
                s.add(i);

            }
            else{
                ans.add(s.peek());
                s.add(i);
            }
        }

        return ans;
    }
}
