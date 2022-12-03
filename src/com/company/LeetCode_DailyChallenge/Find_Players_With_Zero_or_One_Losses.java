package com.company.LeetCode_DailyChallenge;

import java.util.*;

public class Find_Players_With_Zero_or_One_Losses {

    //2225. Find Players With Zero or One Losses
    //https://leetcode.com/problems/find-players-with-zero-or-one-losses/description/

    public List<List<Integer>> findWinners(int[][] matches) {

        Set<Integer> notLost= new HashSet<>();
        Map<Integer, Integer> lost= new HashMap<>();

        for( int[] x: matches){
            notLost.add(x[0]);
        }

        for( int[] x: matches){
            if( notLost.contains(x[1])){
                notLost.remove(x[1]);
            }
            lost.put(x[1], lost.getOrDefault(x[1], 0)+1);
        }

        List<List<Integer>> ans= new ArrayList<>();
        ans.add(new ArrayList());
        ans.add(new ArrayList());


        for( int i: notLost){
            ans.get(0).add(i);
        }

        for( int i: lost.keySet()){
            if( lost.get(i)==1)
                ans.get(1).add(i);
        }
        Collections.sort( ans.get(0));
        Collections.sort( ans.get(1));

        return ans;

    }
}
