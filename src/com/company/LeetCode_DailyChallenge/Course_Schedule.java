package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Course_Schedule {

    //207. Course Schedule
    //https://leetcode.com/problems/course-schedule/description/
    public boolean canFinish(int n, int[][] pre) {

        List<List<Integer>> g= new ArrayList<>();

        for( int i=0; i<n; i++ ){
            g.add( new ArrayList<>());
        }

        boolean[] vis= new boolean[n];

        int[] ins= new int[n];

        for( int[] i: pre){
            g.get(i[0]).add(i[1]);
            ins[i[1]]++;
        }

        int n_vis=0;

        Queue<Integer> q= new LinkedList<>();

        for( int i=0; i<n; i++){
            if( ins[i]==0) {
                q.add(i);
                n_vis++;
                vis[i]=true;
            }
        }


        while(q.isEmpty()==false){

            int k=q.poll();

            for( int c: g.get(k)){

                if( vis[c]==false){
                    ins[c]--;
                    if( ins[c]==0){
                        q.add(c);
                        vis[c]=true;
                        n_vis++;
                    }
                }
            }
        }


        return n_vis==n;

        //1 <-0
    }
}
