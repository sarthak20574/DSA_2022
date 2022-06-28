package com.company.LeetCode_DailyChallenge;

public class Range_Sum_Query_2D_Immutable {
    //304.Range Sum Query 2D - Immutable

    class NumMatrix {
        int[][] dp;

        public NumMatrix(int[][] matrix) {
            int n= matrix.length;
            int m= matrix[0].length;
            dp= new int[n+1][m+1];
            for(int i=1; i<n+1; i++){

                for( int j=1; j<m+1;j++){
                    dp[i][j]=matrix[i-1][j-1]+dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {

            return dp[row2+1][col2+1]-dp[row2+1][col1]-dp[row1][col2+1]+dp[row1][col1];

        }
    }


    //in Rotting_Oranges

    /*
    class NumMatrix {
public:
    vector<vector<int>> dp;
    NumMatrix(vector<vector<int>>& matrix) {

        dp=vector<vector<int>>(matrix.size()+1,vector<int>(matrix[0].size()+1));

        for( int i=1; i<matrix.size()+1; i++){
            for( int j=1; j<matrix[0].size()+1;j++){
                dp[i][j]= matrix[i-1][j-1]+dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1];
            }
        }
    }

    int sumRegion(int row1, int col1, int row2, int col2) {
        row1++;row2++;col1++;col2++;
        return dp[row2][col2]-dp[row1-1][col2]-dp[row2][col1-1]+dp[row1-1][col1-1];
    }
};

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix* obj = new NumMatrix(matrix);
 * int param_1 = obj->sumRegion(row1,col1,row2,col2);

*/


}
