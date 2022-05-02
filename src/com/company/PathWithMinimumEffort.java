package com.company;

public class PathWithMinimumEffort {
    /*
    //1631. Path With Minimum Effort
//https://leetcode.com/problems/path-with-minimum-effort/
//https://www.youtube.com/watch?v=CPSJ0oFBMHg

    bool dfs( int visited[100][100], vector<vector<int>> & heights,
 int i, int j, int n, int m, int mid){

    if( i==n-1 && j==m-1) return true;

    visited[i][j]=1;

    bool reached_the_end=false;

    //so if valide_till_now or if reached already reached the end or i==n-1 && j==m-1 is valid
    //then done as already found a valid part with difference less than = mid

    if( i-1>=0 && visited[i-1][j]==0 && abs(heights[i][j]- heights[i-1][j]) <=mid)
        reached_the_end=reached_the_end ||dfs(visited, heights, i-1, j, n, m, mid);

    if( i+1<n && visited[i+1][j]==0 && abs( heights[i][j]- heights[i+1][j])<=mid)
     reached_the_end=reached_the_end ||dfs(visited, heights, i+1,j, n, m, mid);

    if(  j-1>=0 && visited[i][j-1]==0 && abs( heights[i][j]-heights[i][j-1])<=mid)
     reached_the_end=reached_the_end || dfs( visited, heights, i, j-1, n, m, mid);

    if( reached_the_end || j+1<m && visited[i][j+1]==0 && abs(heights[i][j]- heights[i][j+1])<=mid)
     reached_the_end=reached_the_end ||dfs(visited, heights, i, j+1, n, m,mid);

    return reached_the_end;
}

int minimumEffortPath(vector<vector<int>>& heights) {


    int lft= 0, ryt= INT_MAX, n= heights.size(), m= heights[0].size();

     int mid;
     int ans=INT_MAX;

    while( lft<=ryt){
         int visited[100][100];
    memset( visited, 0, sizeof visited);

   mid= (lft+ryt)/2;

    if( dfs(visited,heights, 0, 0, n, m, mid) ){
        ans= min( ans, mid);
        ryt=mid-1;
    }
    else{
        lft=mid+1;
    }
    }
    return ans;

    }
     */
}
