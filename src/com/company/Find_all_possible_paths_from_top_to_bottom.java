package com.company;

import java.util.ArrayList;

public class Find_all_possible_paths_from_top_to_bottom {


    //Find all possible paths from top to bottom
    //https://practice.geeksforgeeks.org/problems/find-all-possible-paths-from-top-to-bottom/1#


    public static ArrayList<ArrayList<Integer>> findAllPossiblePaths(
            int n,int m, int[][] grid) {


        ArrayList< ArrayList<Integer>> ans= new ArrayList<>();

        ArrayList<Integer> l=new ArrayList<>();
        l. add(grid[0][0]);
        fn (0, 0, l,n, m, grid, ans);

        return ans;
    }


    static void fn(int x, int y, ArrayList<Integer> p_ans,int n, int m,
                   int[][] grid, ArrayList<ArrayList<Integer>> ans){

        if( x== n-1 && y==m-1){
            ans.add( new ArrayList<Integer>(p_ans));
            return;
        }


        int[][] d= {{1, 0}, { 0, 1}};

        for( int i=0; i<2; i++){

            int x1= x+ d[i][0];
            int y1= y+ d[i][1];

            if( x1>=0 && y1>=0 && x1< n && y1<m){

                p_ans.add( grid[x1][y1]);
                fn (x1, y1, p_ans,n, m, grid, ans);
                p_ans.remove( p_ans.size()-1);

            }
        }

    }


}
