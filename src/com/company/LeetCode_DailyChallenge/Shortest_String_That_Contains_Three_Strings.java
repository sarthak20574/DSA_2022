package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shortest_String_That_Contains_Three_Strings {

    //2800. Shortest String That Contains Three Strings
    //https://leetcode.com/problems/shortest-string-that-contains-three-strings/description/

    List<String> x ;
    public String minimumString(String a, String b, String c) {

        x= new ArrayList<>();
        fn( a, b, c);
        fn( a, c, b);
        fn( b, c, a);

        fn(b, a, c);

        fn( c, a, b);
        fn( c, b, a);

        Collections.sort(x, (x, y)->
                x.length()!=y.length()?x.length()-y.length():x.compareTo(y));
        // System.out.println( x);
        return x.get(0);
    }

    void fn( String a, String b, String c){
        // abc  bca  aaa

        // abcaaa


        StringBuilder ans= new StringBuilder(a);
        int cur;

        boolean found=false;

        for( int i=0; i<ans.length(); i++){
            cur=0;
            int j=i;
            if( ans.charAt(i)==b.charAt(cur)){
                while( i<ans.length() && cur<b.length() && ans.charAt(i)==b.charAt(cur)){
                    i++;
                    cur++;
                }
                if( i==ans.length() ){
                    //abc bca
                    ans.append(b.substring(cur));
                    found=true;
                    break;
                }
                else if( cur==b.length()){
                    // abcde cd

                    found=true;
                    break;
                }
            }
            i=j;
        }

        if( found==false){
            ans.append(b);
        }

        found=false;


        for( int i=0; i<ans.length(); i++){
            cur=0;
            int j=i;
            if( ans.charAt(i)==c.charAt(cur)){
                while( i<ans.length() && cur<c.length() && ans.charAt(i)==c.charAt
                        (cur)){
                    i++;
                    cur++;
                }
                if( i==ans.length() ){
                    //abc bca
                    ans.append(c.substring(cur));
                    found=true;
                    break;
                }
                else if( cur==c.length()){
                    // abcde cd

                    found=true;
                    break;
                }
            }
            i=j;
        }

        if( found==false){
            ans.append(c);
        }

        x.add( ans.toString());

    }
}
