package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Maximum_Length_of_Pair_Chain {


    //646. Maximum Length of Pair Chain
    //https://leetcode.com/problems/maximum-length-of-pair-chain/description/
    //https://www.youtube.com/watch?v=LcNNorqMVTw&ab_channel=NeetCodeIO

    public int findLongestChain(int[][] pairs) {
        // 1 2    2 3     3 4

        Arrays.sort( pairs, (a, b)-> a[1]-b[1]);

        int ans=0, end=-1002;


        for(int[] i: pairs){
            if( end< i[0]){
                ans++;
                end=i[1];
                //  System.out.println(end);
            }
        }

        return ans;
    }
}
