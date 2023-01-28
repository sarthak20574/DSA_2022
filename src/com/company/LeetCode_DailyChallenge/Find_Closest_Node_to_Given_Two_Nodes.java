package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Find_Closest_Node_to_Given_Two_Nodes {

    //2359. Find Closest Node to Given Two Nodes
    //https://leetcode.com/problems/find-closest-node-to-given-two-nodes/description/

    public int closestMeetingNode(int[] edges, int n1, int n2) {

        int n= edges.length;
        int[] dis1= fn( edges, n, n1);
        int[] dis2= fn( edges, n, n2);

        // System.out.println(Arrays.toString(dis1));
        // System.out.println(Arrays.toString(dis2));

        int ans=-1, val=Integer.MAX_VALUE;
        for( int i=0; i<n; i++){

            if(val>Math.max(dis1[i], dis2[i])){
                val=Math.max(dis1[i], dis2[i]);
                ans=i;
            }

        }

        return ans;

    }


    int[] fn( int[] edges, int n,int n1){

        int[] dis1= new int[n];

        int ans=0;

        Arrays.fill(dis1, Integer.MAX_VALUE);

        // ArrayList<ArrayList<Integer>> g= new ArrayList<>();

        // for( int i=0; i<n; i++){
        //     g.add(new ArrayList<>());
        // }

        // for( int i=0; i<n; i++){
        //     g.get(i).add(edges[i]);
        // }


        boolean[] vis= new boolean[n];
        vis[n1]=true;

        Queue<Integer> q= new LinkedList<>();
        q.add(n1);
        dis1[n1]=0;

        while(q.isEmpty()==false){

            int len= q.size();
            ans++;

            for( int k=0; k<len; k++){

                int cur= q.poll();

                if( edges[cur]!=-1 && vis[edges[cur]]==false){
                    vis[edges[cur]]=true;
                    q.add(edges[cur]);

                    dis1[edges[cur]]=ans;
                }
            }
        }

        return dis1;
    }
}
