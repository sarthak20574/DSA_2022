package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Count_Pairs_of_Points_With_Distance_k {

    //2857. Count Pairs of Points With Distance k
    //https://leetcode.com/problems/count-pairs-of-points-with-distance-k/
    // https://www.youtube.com/watch?v=1Hp6Hsghtno


    public int countPairs(List<List<Integer>> c, int k) {
        Map<String, Integer> m= new HashMap<>();

        int ans=0;


        for( List<Integer> x: c){


            int x1=x.get(0), y1= x.get(1);


            for( int i=0; i<=k; i++){

                int x2= i ^ x1, y2= (k-i)^y1;


                ans+= m.getOrDefault( Arrays.toString(new int[]{x2, y2}),0);



            }
            m.put( Arrays.toString(new int[]{x1, y1}),
                    m.getOrDefault(  Arrays.toString(new int[]{x1, y1}),0)+1);

        }
        return ans;
    }
}
