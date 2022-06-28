package com.company.LeetCode_DailyChallenge;

import java.util.HashSet;
import java.util.Set;

public class Rotting_Oranges {

    //994. Rotting Oranges
    //https://leetcode.com/problems/rotting-oranges/
    //https://www.youtube.com/watch?v=TzoDDOj60zE

    public int orangesRotting(int[][] grid) {

        Set<String> rotten= new HashSet<>();
        Set<String> fresh= new HashSet<>();
        int n= grid.length;
        int m= grid[0].length;

        int ans=0;

        for( int i=0; i<n; i++){
            for( int j=0; j<m; j++){
                if( grid[i][j]==2) rotten.add(""+i+j);
                else if( grid[i][j]==1) fresh.add(""+ i+j);
            }
        }


        while(fresh.size()>0){

            Set<String> infected_in_this_iteration= new HashSet<>();
            for (String coord: rotten) {

                int[][] dir= {{0,1}, {1,0}, {-1,0}, {0,-1}};

                for (int j = 0; j < 4; j++) {
                    int x=coord.charAt(0)-'0';
                    int y= coord.charAt(1)-'0';

                    if( x+dir[j][0]<n && x+dir[j][0]>=0 && y+dir[j][1]<m && y+dir[j][1]>=0
                            &&  grid[x+dir[j][0]][y+dir[j][1]]==1){

                        // if( fresh.contains(""+(x+dir[j][0])+(y+dir[j][1]))){

                        String t= ""+(x+dir[j][0])+(y+dir[j][1]);
                        fresh.remove(t);
                        infected_in_this_iteration.add(t);
                        grid[x+dir[j][0]][y+dir[j][1]]=2;
                    }
                }
            }

            // -1 if nothing is infected in this iteration
            if( infected_in_this_iteration.size()==0) return -1;

            ans++;
            rotten= infected_in_this_iteration;
        }
        return ans;

    }
}
