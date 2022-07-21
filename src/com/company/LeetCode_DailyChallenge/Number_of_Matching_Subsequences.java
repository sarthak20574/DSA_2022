package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Number_of_Matching_Subsequences {

    //Number_of_Matching_Subsequences
    //https://leetcode.com/problems/number-of-matching-subsequences/
    //see alisha parveen's vid

    public int numMatchingSubseq(String s, String[] words) {

        int ans=0, j, cur;
        List<Integer> x[]= set_map(s);


        for( int i=0; i< words.length; i++){

            for( j=0,cur=0; j<words[i].length(); j++, cur++){

                cur= search(x[words[i].charAt(j)-'a'], cur);
                if( cur==-1) break;
            }

            if( cur!=-1)ans++;
        }


        return ans;

    }


    private int search(List<Integer> ns, int n) {
        if (ns == null) return -1;
        int lo = 0, hi = ns.size()-1;
        if (ns.get(lo) >= n) return ns.get(lo);
        if (ns.get(hi) < n) return -1;
        while (lo < hi) {
            int mi = (lo + hi)/2;
            if (ns.get(mi) == n) return ns.get(mi);
            if (ns.get(mi) < n) lo = mi+1;
            else hi = mi;
        }
        return ns.get(hi);
    }


    List<Integer>[] set_map(String s){

        List<Integer> ret[]= new ArrayList['z'-'a'+1];


        for( int i=0;i<s.length(); i++){

            if (ret[(s.charAt(i)-'a')]==null){
                ret[(s.charAt(i)-'a')]=new ArrayList<>();
            }
            ret[s.charAt(i)-'a'].add(i);
        }

        return ret;
    }
}
