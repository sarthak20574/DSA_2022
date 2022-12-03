package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Sort_Characters_By_Frequency {

    //451. Sort Characters By Frequency
    //https://leetcode.com/problems/sort-characters-by-frequency/

    public String frequencySort(String s) {
        Map<Character, Long> m= new HashMap<>();

        //(m.get(b).compareTo(m.get(a))

        Queue<Character> h= new PriorityQueue<>((a, b)-> (m.get(b).compareTo(m.get(a))));



        for( char c: s.toCharArray()){
            m.put( c, m.getOrDefault(c, 0L)+1);
        }

        h.addAll(m.keySet());

        for( char c: h){
            System.out.println(c+": "+m.get(c));
        }

        StringBuilder ans= new StringBuilder();

        while(h.isEmpty()==false){
            char c= h.poll();
            long n= m.get(c);

            for( int i=0; i<n; i++){
                ans.append(c);
            }
        }

        return ans.toString();
    }
}
