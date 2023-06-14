package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Detonate_the_Maximum_Bombs {

    //2101. Detonate the Maximum Bombs
    //https://leetcode.com/problems/detonate-the-maximum-bombs/description/



    int[] vis;
    public int maximumDetonation(int[][] b) {

        int n= b.length;

        //int[] ans= new int[n];//the no of bomb detenoted by bomb i
        vis=new int[n];

        // Arrays.fill( ans,1);
        Arrays.fill( vis,-1);

        List<List<Integer>> g= new ArrayList<>();
        for( int i=0; i<n; i++){
            g.add( new ArrayList<>());
        }



        for( int i=0; i<n; i++){
            for( int j=0; j<n; j++){
                if( (((long)b[i][0]- (long)b[j][0]) *((long)b[i][0]- (long)b[j][0])
                        + ((long)b[i][1]- (long)b[j][1]) *((long)b[i][1]- (long)b[j][1]))

                        <= ((long)b[i][2] * (long)b[i][2])  ){
                    // System.out.println("mjhbhnj");
                    g.get(i).add(j);
                }
            }
        }

        int r=1;
        // System.out.println(g);

        for( int i=0; i<n; i++){
            //if( vis[i]==-1){
            vis[i]=0;
            r= Math.max(r, dfs(i, g));
            Arrays.fill(vis, -1);
        }

        //System.out.println(Arrays.toString(ans)+ " ejfje");

        return r;

    }

    int dfs(int cur, List<List<Integer>> g){

        int ans=0;
        for( int i: g.get(cur)){

            //if(i==cur) continue;
            if( vis[i]==-1){
                vis[i]=0;
                ans+=dfs(i,g);
                // System.out.println(cur+ "is cur & ans of "+i+" is "+ans[i] );

            }
            // else{
            //     ans[cur]+=ans[i];
            // }
        }

        return ans+1;
    }
}
