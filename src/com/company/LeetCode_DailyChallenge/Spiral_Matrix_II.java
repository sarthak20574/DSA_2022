package com.company.LeetCode_DailyChallenge;

public class Spiral_Matrix_II {


    //59. Spiral Matrix II
    //https://leetcode.com/problems/spiral-matrix-ii/
    //https://www.youtube.com/watch?v=1ZGJzvkcLsA
    public int[][] generateMatrix(int n) {
        /*
        0 = l to r
        1 = t to b
        2= r to l
        3= b to t
         */
        int[][] ans = new int[n][n];
        int direction=0;
        int left= 0, ryt=n-1, top= 0, bottom=n-1;
        int x=1;
        while (left<=ryt && top<=bottom){
            if( direction==0){
                for( int i=left; i<=ryt; i++){
                    ans[top][i]= x++;

                }
                top++;
            }
            else if( direction==1){
                for (int i = top; i <=bottom ; i++) {
                    ans[i][ryt]= x++;

                }
                ryt--;
            }
            else if( direction==2){
                for (int i = ryt; i >= left; i--) {
                    ans[bottom][i]=x++;

                }
                bottom--;
            }
            else {
                for (int i = bottom; i >=top; i--) {
                    ans[i][left]=x++;

                }
                left++;
            }
            System.out.println(direction);
            direction=(direction+1)%4;

        }
        return ans;
    }

}
