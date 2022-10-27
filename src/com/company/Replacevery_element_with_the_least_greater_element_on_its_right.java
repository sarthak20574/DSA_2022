package com.company;

import java.util.*;

public class Replacevery_element_with_the_least_greater_element_on_its_right {

    //Replace every element with the least greater element on its right
    //https://practice.geeksforgeeks.org/problems/replace-every-element-with-the-least-greater-element-on-its-right/1

    public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {

        ArrayList<Integer> ans= new ArrayList<>();


        TreeSet<Integer> treeset= new TreeSet<>();


        for( int i=n-1; i>=0 ; i--){

            if( treeset.higher(arr[i])!=null){
                ans.add(treeset.higher(arr[i]));
            }
            else {
                ans.add( -1);
            }
            treeset.add(arr[i]);
        }

        Collections.reverse(ans);

        return ans;

    }
}
