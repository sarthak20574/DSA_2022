package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Minimum_Number_of_Vertices_to_Reach_All_Nodes {

    //1557. Minimum Number of Vertices to Reach All Nodes
    //https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/description/?envType=study-plan&id=graph-i

    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {


        int[] freq= new int[n];

        for( List<Integer> i: edges){
            freq[i.get(1)]++;
        }

        List<Integer> ret= new ArrayList<>();
        for( int i=0; i<n; i++){
            if( freq[i]==0)
                ret.add(i);
        }


        return ret;

        // visited
        // ans
        // 1 2
        //
        //5
        //

    }
}
