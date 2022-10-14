package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Geek_and_Strings {

    //Geek and Strings
    //https://practice.geeksforgeeks.org/problems/geek-and-strings3030/1

    static List<Integer> prefixCount(int N, int Q, String li[], String query[])
    {

        List<Integer> ans= new ArrayList<>();

        Map<String,Integer> m= new HashMap<>();

        for( String x: li){

            String cur= "";

            for( char c: x.toCharArray()){
                cur= cur+c;
                m.put( cur,m.getOrDefault(cur,0)+1);
            }
        }


        for( String x: query){
            ans.add( m.getOrDefault(x, 0));
        }

        return ans;
    }

}
