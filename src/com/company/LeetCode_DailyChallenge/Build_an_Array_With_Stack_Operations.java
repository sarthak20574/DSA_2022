package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Build_an_Array_With_Stack_Operations {

    //1441. Build an Array With Stack Operations
    //https://leetcode.com/problems/build-an-array-with-stack-operations/description/?envType=daily-question&envId=2023-11-03

    public List<String> buildArray(int[] t, int n) {
        List<String> ans= new ArrayList<>();
        int cur=0;

        for(int i=1; i<=n; i++){

            if( t[cur]==i){
                ans.add("Push");
                cur++;
            }
            else{
                ans.add("Push");
                ans.add("Pop");
            }
            if( cur==t.length) return ans;
        }
        return ans;
    }
}
