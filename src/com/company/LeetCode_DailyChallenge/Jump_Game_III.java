package com.company.LeetCode_DailyChallenge;

import java.util.LinkedList;
import java.util.Queue;

public class Jump_Game_III {

    //1306. Jump Game III
    //https://leetcode.com/problems/jump-game-iii/description/?envType=study-plan&id=graph-i
    //able to do it after the hint


    public boolean canReach(int[] arr, int start) {


        Queue<Integer> q= new LinkedList<>();
        q.add(start);

        int n= arr.length;

        boolean[] vis=new boolean[n];

        while(q.isEmpty()==false){

            int x= q.poll();

            vis[x]=true;

            if(arr[x]==0)return true;


            if( x+arr[x]<n && vis[x+arr[x]]==false){
                q.add(x+arr[x]);
            }

            if(x-arr[x]>=0 && vis[x-arr[x]]==false){
                q.add(x-arr[x]);
            }
        }

        return false;
    }
}
