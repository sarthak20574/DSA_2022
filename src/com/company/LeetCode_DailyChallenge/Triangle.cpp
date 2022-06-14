//120. Triangle
//https://www.youtube.com/watch?v=1IL5sxfoA-I
    //https://leetcode.com/problems/triangle/
   int minimumTotal(vector<vector<int>> &triangle)
{
    int n=triangle.size();
    vector<int> dp(n);

    for( int i=0; i< n; i++){
        dp[i]= triangle[n-1][i];
    }

    for( int i=n-2; i>=0; i--){
        for( int j=0; j<triangle[i].size();j++){
             dp[j]= min(dp[j],dp[j+1])+triangle[i][j];
        }
    }

    return dp[0];
}