package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Rat_in_a_Maze_Problem_I {

    //Rat in a Maze Problem - I
    //https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1#

    // from striver's sheet

    public static ArrayList<String> findPath(int[][] m, int n) {

        ArrayList<String> ans= new ArrayList<>();
        int si=0, sj=0;

        boolean b[][]= new boolean[n][n];

        for ( int i=0; i< n ; i++){
            Arrays.fill(b[i],false);
        }

        fn( ans, "", n, m, si,sj,b);

        return ans;
    }

    static void fn( ArrayList<String> ans, String p_ans, int n,
                    int[][] m, int si, int sj,boolean b[][]){


        if( (si>=0 && sj>=0 && si<n && sj<n
                && m[si][sj]!=0 && b[si][sj]==false)==false) return;

        //  System.out.println( si);
        //   System.out.println( sj);

        if( si==n-1 && sj==n-1) {
            // System.out.println( p_ans);
            ans.add( new String(p_ans));
            return;
        }


        int[][] dir={{0,-1}, {0,1}, {1,0}, {-1,0}};
        String[] s={"L","R", "D", "U"};


        b[si][sj] = true;

        for( int i=0; i< 4; i++){
            int x=si+dir[i][0];
            int y= sj+dir[i][1];


            fn( ans, p_ans+s[i], n, m, x,y,b);

        }

        b[si][sj] = false;

    }
}
