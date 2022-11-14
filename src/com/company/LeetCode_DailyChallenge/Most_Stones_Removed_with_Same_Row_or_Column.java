package com.company.LeetCode_DailyChallenge;

import java.util.HashSet;
import java.util.Set;

public class Most_Stones_Removed_with_Same_Row_or_Column {

    //947. Most Stones Removed with Same Row or Column
    //https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/description/

    public int removeStones(int[][] stones) {

        Set<int[]> visited= new HashSet<>();

        int ans=0;

        for( var x: stones){
            if( visited.contains(x)==false){
                ans++;
                dfs(visited, stones, x);
            }
        }

        return stones.length-ans;

    }


    void dfs(Set<int[]> visited, int[][] stones, int[] x){

        visited.add( x);

        for( var y: stones){

            if( visited.contains(y)==false && (x[0]==y[0]|| x[1]==y[1])){
                dfs(visited, stones, y);
            }
        }
    }
}
