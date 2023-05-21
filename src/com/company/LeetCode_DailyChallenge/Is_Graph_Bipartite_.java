package com.company.LeetCode_DailyChallenge;

public class Is_Graph_Bipartite_ {

    //785. Is Graph Bipartite?
    //https://leetcode.com/problems/is-graph-bipartite/description/

    public boolean isBipartite(int[][] graph) {

        int n= graph.length;

        int[] visited= new int[n];

        // 0= unvisited ; 1=color 1 ; -1=color 2

        boolean ans=true;

        for( int i=0; i<n; i++){
            if( visited[i]==0){
                visited[i]=1;
                ans = ans && dfs(i, graph, visited);
            }

        }

        return ans;

    }

    boolean dfs(int cur, int[][] g, int[] visited){

        // if( visited[cur]!=0) return true;

        boolean ans=true;


        for( int neigh: g[cur]){

            if( visited[neigh]!=0){
                if( visited[cur]==visited[neigh]) {

                    ans=false;
                    // System.out.println("conflict....Cur="+cur+" Neigh="+ neigh);
                    //  System.out.println("Cur color="+visited[cur]+" Neigh color="+ visited[neigh]);
                }
            }
            else{
                visited[neigh]= visited[cur]* (-1);
                //  System.out.println("Cur="+cur+" Neigh="+ neigh);
                // System.out.println("Cur color="+visited[cur]+" Neigh color="+ visited[neigh]);
                ans = ans &&  dfs(neigh,g, visited );
            }
        }

        return ans;
    }
}
