package com.company.LeetCode_DailyChallenge;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Find_if_Path_Exists_in_Graph {


    //1971. Find if Path Exists in Graph
    //https://leetcode.com/problems/find-if-path-exists-in-graph/description/

    public boolean validPath(int n, int[][] edges, int start, int end) {

        boolean[] visited = new boolean[n];
        HashSet<Integer>[] graph = new HashSet[n];
        int i, j;

        for(i = 0; i < n; i++){
            graph[i] = new HashSet<Integer>();
        }

        for(int[] edge : edges){
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        if(graph[start].contains(end)){  // direct connection exists
            return true;
        }

        Queue<Integer> queue = new LinkedList<Integer>();
        int N, current;
        queue.offer(start);
        visited[start] = true;

        while(!queue.isEmpty()){
            N = queue.size();
            current = queue.poll();
            if(current == end){
                return true;
            }

            for(Integer neighbor : graph[current]){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }

        return false;
    }
}
