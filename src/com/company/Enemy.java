package com.company;

public class Enemy {

    //Enemy
    //https://practice.geeksforgeeks.org/problems/enemy/1

    public static int largestArea(int n,int m,int k,int[][] enemy) {


        int[] rows= new int[n];
        int[] cols= new int[m];

        //by default in java arrays are initialized by 0
        // for invalid rows/cols we mark them by a -1

        for( int[] e: enemy){
            rows[e[0]-1]=-1;
            cols[e[1]-1]=-1;
        }


        int row_gap=0, col_gap=0;

        int cur=0;
        for( int i=0; i<n; i++){
            if(rows[i]==0){
                cur++;
            }
            else{
                row_gap=Math.max( cur, row_gap);
                cur=0;
            }
        }

        row_gap=Math.max( cur, row_gap);
        cur=0;

        for( int i=0; i<m; i++){
            if(cols[i]==0){
                cur++;

            }
            else{
                col_gap=Math.max( cur, col_gap);
                cur=0;
            }
        }

        col_gap=Math.max( cur, col_gap);

        return col_gap * row_gap;


    }
}
