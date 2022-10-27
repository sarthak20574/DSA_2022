package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Common_Elements {

    //Common Elements
    //https://practice.geeksforgeeks.org/problems/common-elements5420/1

    public static ArrayList<Integer> common_element(int v1[], int v2[])
    {
        // Arrays.sort(v2);
        ArrayList<Integer> ans= new ArrayList<>();
        Map<Integer, Integer> x= new HashMap<>();

        for( int i: v1){
            x.put(i,x.getOrDefault(i, 0)+1);
        }

        for( int i: v2){
            if( x.containsKey(i)==true){
                ans. add(i);
                x.put(i,x.get(i)-1);
                if( x.get(i)==0) x.remove(i);
            }
        }
        Collections.sort(ans);

        return ans;
    }
}
