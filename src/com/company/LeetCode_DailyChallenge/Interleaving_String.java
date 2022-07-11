package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Interleaving_String {

    //97. Interleaving String
    //https://leetcode.com/problems/interleaving-string/
    //https://www.youtube.com/watch?v=EzQ_YEmR598&ab_channel=TECHDOSE

    public boolean isInterleave(String s1, String s2, String s3) {

        if( s1.length()+s2.length()!= s3.length()) return false;
        return fn( s1, s2, s3, s1.length(), s2.length(), s3.length(), 0, 0,0);
    }

    Map< String, Boolean> map= new HashMap<>();

    boolean fn(String s1, String s2, String s3, int l1,
               int l2, int l3, int p1,int p2, int p3){

        if( p3==l3) return p1+p2==p3? true: false;

        String x= p1+"*"+p2+"*"+p3;

        if( map.containsKey(x)){
            return map.get(x);
        }


        if( p1==l1)
            if( s3.charAt(p3)== s2.charAt(p2)){
                map.put(x, fn( s1, s2, s3, l1,l2, l3, p1, p2+1,p3+1));
                return map.get(x);
            }

            else {
                map.put(x, false);
                return false;
            };


        if( p2==l2){
            if( s3.charAt(p3)== s1.charAt(p1))
                map.put(x, fn( s1, s2, s3, l1,l2, l3, p1+1, p2,p3+1));
            else  map.put(x, false);

            return map.get(x);
        }


        boolean x1=false, x2=false;

        if( s3.charAt(p3)== s1.charAt(p1))
            x1=fn( s1, s2, s3, l1,l2, l3, p1+1, p2,p3+1);

        if( s3.charAt(p3)== s2.charAt(p2))
            x2= fn( s1, s2, s3, l1,l2, l3, p1, p2+1,p3+1);

        map.put( x, x1||x2);
        return map.get(x);
    }
}
