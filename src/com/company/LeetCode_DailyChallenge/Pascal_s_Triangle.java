package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Pascal_s_Triangle {
    //118. Pascal's Triangle
    //https://leetcode.com/problems/pascals-triangle/
    public List<List<Integer>> generate(int n) {

        List<List<Integer>> ans= new ArrayList<List<Integer>>(5);

        for( int i=0; i<n; i++){
            List<Integer> x= new ArrayList<>();
            for( int j=0; j<i+1; j++){
                if( j==0 || j==i) x.add(1);
                else
                    x.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
            }
            ans.add(x);
        }
       // i==1|| i==n-1    i-1 +i
        return ans;
    }
}
