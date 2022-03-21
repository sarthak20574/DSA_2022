package com.company.Unboxing_Interview_Series_GFG;

import java.util.ArrayList;
import java.util.List;

public class Minimum_Squares {
    //https://practice.geeksforgeeks.org/contest/interview-series-amdocs/problems/
    static long hcf(long x,long y){
        if( y==0) return x;
        return hcf(y,x%y);
    }
    static List<Long> minimumSquares(long L, long B) {

        long hcf = hcf(L,B);

        List<Long> ans= new ArrayList<>();
        ans.add((L*B)/(hcf * hcf));
        ans.add(hcf);


        return ans;
    }
}
