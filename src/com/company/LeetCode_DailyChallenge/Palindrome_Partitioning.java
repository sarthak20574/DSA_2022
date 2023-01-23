package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {

    //131. Palindrome Partitioning
    //https://leetcode.com/problems/palindrome-partitioning/description/

    public List<List<String>> partition(String s) {

        List<List<String>> ans= new ArrayList<>();


        fn(s, 0, s.length(), new ArrayList<>(),ans);

        return ans;
    }

    void fn( String s, int i, int n, List<String> cur,
             List<List<String>> ans){

        if( i==n){
            ans.add( new ArrayList<>(cur));
            return;
        }

        for( int k=i; k<n; k++){

            //try forming the pal else just move to the next
            if(isPal( s,  i,  k)){
                cur.add( s.substring(i,k+1));
                fn(s, k+1, n, cur, ans);
                cur.remove( cur.size()-1);
            }

        }

    }

    boolean isPal(String s, int i, int j){

        while( i<=j){
            if( s.charAt(i++)!=s.charAt(j--)) return false;
        }

        return true;
    }
}
