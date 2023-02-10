package com.company;

import java.util.HashMap;
import java.util.Map;

public class Balloon_Everywhere {

    //Balloon Everywhere
    //https://practice.geeksforgeeks.org/problems/45fa306a9116332ece4cecdaedf50f140bd252d4/1

    public int maxInstance(String s) {

        String x= "balloon";

        Map<Character, Integer> m= new HashMap<>();

        int i=0, ans= Integer.MAX_VALUE;
        for( char c: x.toCharArray()){
            m.put(c,0);
        }


        for( char c: s.toCharArray()){

            if( m.containsKey(c))
                m.put(c,m.get(c)+1);
        }

        m.put('l',m.get('l')/2);
        m.put('o',m.get('o')/2);

        for( int l: m.values()){
            ans= Math.min(ans, l);
        }



        return ans;
    }


}
