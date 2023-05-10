package com.company.LeetCode_DailyChallenge;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2_Senate {

    //649. Dota2 Senate
    //https://leetcode.com/problems/dota2-senate/description/

    public String predictPartyVictory(String senate) {

        int n= senate.length();

        Queue<Integer> r= new LinkedList<>();
        Queue<Integer> d= new LinkedList<>();


        for( int i=0; i<n; i++){

            if(senate.charAt(i)=='R'){
                r.add(i);
            }
            else d.add(i);
        }

        while( r.isEmpty()==false && d.isEmpty()==false){
            if( r.peek()> d.peek()){
                d.add(d.poll()+n);
                r.poll();
            }
            else{
                r.add(r.poll()+n);
                d.poll();
            }
        }

        return r.isEmpty()?"Dire":"Radiant";
    }
}
