package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Naming_a_Company {

    //2306. Naming a Company
    //https://leetcode.com/problems/naming-a-company/description/
    //https://www.youtube.com/watch?v=NrHpgTScOcY&ab_channel=NeetCodeIO

    public long distinctNames(String[] ideas) {

        //tonuts dime
        //doffee tonuts".

        // "doffee conuts".
        //tonuts dime
        //tonuts doffee"
        //


        long ans=0;

        Map<Character, Set<String>> m= new HashMap<>();

        for( String x: ideas){

            if( m.get(x.charAt(0))==null)
                m.put(x.charAt(0), new HashSet<>());


            Set<String> temp= m.get(x.charAt(0));
            temp.add(x.substring(1));
        }

        for( char c: m.keySet()){

            for( char c1: m.keySet()){

                if( c1==c) continue;

                int inter=0;

                for( String k: m.get(c)){

                    if( m.get(c1).contains(k)){
                        inter++;
                    }
                }

                ans+= ((m.get(c1).size()-inter) * (m.get(c).size()-inter));


            }
        }


        return ans;
    }
}
