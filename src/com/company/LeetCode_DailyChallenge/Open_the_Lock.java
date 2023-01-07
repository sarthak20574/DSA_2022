package com.company.LeetCode_DailyChallenge;

import java.util.*;

public class Open_the_Lock {
    //752. Open the Lock
    //https://leetcode.com/problems/open-the-lock/description/?envType=study-plan&id=graph-i
    //https://www.youtube.com/watch?v=Pzg3bCDY87w&ab_channel=NeetCode

    public int openLock(String[] dead, String target) {

        Set<String> vis= new HashSet<>();

        int ans=0;

        for( String s: dead){
            vis.add(s);
        }

        if(vis.contains("0000"))return -1;

        Queue<String> q= new LinkedList<>();
        q.add( "0000");

        while( q.isEmpty()==false){


            int len= q.size();

            for( int k=0;k<len; k++){
                String x= q.poll();
                if( target.equals(x)) return ans;

                List<String> neigh=fn( x);
                for(String i: neigh){
                    if( vis.contains(i)==false){
                        q.add(i);
                        vis.add( i);
                    }
                }
            }

            ans++;


        }
        return -1;
    }

    List<String> fn(String s){
        List<String> ans= new ArrayList<>();

        for( int i=0; i<4; i++){

            int d=s.charAt(i)-'0';

            ans. add( s.substring(0, i) +("" + ((d+1)%10) )+ s.substring( i+1));
            ans. add( s.substring(0, i) +("" + ((d-1 +10)%10) )+ s.substring( i+1) );
        }

        return ans;
    }

}
