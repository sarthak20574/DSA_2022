package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Odd_String_Difference {


    public String oddString(String[] words) {

        Map<String, Long> m= new HashMap<>();
        Map<String, String> m1= new HashMap<>();

        for( String x: words){
            m1.put( fn(x), x);
        }

//         for( String x: m1.keySet()){
//             System.out.println(x+": "+m1.get(x));
//         }


        for( String x: words){
            m.put( fn(x), m.getOrDefault(fn(x), 0L)+1);
        }

        for( String x: m.keySet()){
            if( m.get(x)==1)return m1.get(x);
        }
        return "";


    }


    String fn( String x){

        int[] ans= new int[x.length()-1];

        for( int i=0; i< x.length()-1; i++){
            ans[i]= x.charAt(i+1)- x.charAt(i);
        }

        return Arrays.toString(ans);
    }

}
