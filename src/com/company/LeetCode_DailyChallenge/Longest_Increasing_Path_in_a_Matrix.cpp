

    //329. Longest Increasing Path in a Matrix
    //https://leetcode.com/problems/longest-increasing-path-in-a-matrix/
    //https://www.youtube.com/watch?v=wv_GA9077Dc


int longestIncreasingPath1(int i , int j, vector<vector<int>> &matrix, vector<vector<int>> &dp, int n, int m){
 int current_ans=1;

         if(i>=0 && j>=0 && i<n && j<m){

             if( dp[i][j]!=0) return dp[i][j];



             //right

             if( i+1<n && matrix[i][j]<matrix[i+1][j]){
                 current_ans= max( current_ans, 1+longestIncreasingPath1(i+1, j, matrix, dp, n, m));
             }

             if( j+1<m && matrix[i][j]<matrix[i][j+1]){
                 current_ans= max( current_ans, 1+ longestIncreasingPath1(i, j+1, matrix, dp, n, m));
             }

             if( j-1>=0 && matrix[i][j]<matrix[i][j-1]){

                 current_ans= max(current_ans, 1+ longestIncreasingPath1(i,j-1, matrix, dp, n, m));
             }

             if( i-1>=0 && matrix[i][j]<matrix[i-1][j]){
                 current_ans= max( current_ans, 1+longestIncreasingPath1(i-1, j, matrix, dp,n, m));
             }
         }

         else return 0;

         dp[i][j]= current_ans;

         return current_ans;

     }

    int longestIncreasingPath(vector<vector<int>>& matrix) {

        int n= matrix.size();
        int m= matrix[0].size();
        vector<vector<int> > dp(n, vector<int>(m,0));

        int ans=0;
        for( int i=0; i<n ; i++){

            for( int j=0; j<m; j++){

                ans= max( ans, longestIncreasingPath1(i,j,matrix,dp,n, m ));
            }
        }

        return ans;


    }

}
