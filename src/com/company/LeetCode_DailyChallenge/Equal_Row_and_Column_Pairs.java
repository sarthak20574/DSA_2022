package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Equal_Row_and_Column_Pairs {
    //2352. Equal Row and Column Pairs
    //https://leetcode.com/problems/equal-row-and-column-pairs/
    //

    public int equalPairs(int[][] grid) {

        Map<String, Integer> rowwise_elements = new HashMap<>();

        int n= grid.length;
        int ans=0;

         /*
         we create a string containing all the element separated by a " " in a row and store it and the no of times it occurs in the grid in a hash map
         for example:
         in
         1 2 3
         4 5 6
         7 8 9
          we store "1 2 3 ", "4 5 6 ", "7 8 9 " in the hash map

         */
        for( int i=0; i<n; i++){
            StringBuilder a= new StringBuilder();
            for( int j=0; j<n; j++){
                a.append(grid[i][j]);
                a.append(" ");
            }
            rowwise_elements.put(a.toString(), rowwise_elements.getOrDefault(a.toString(),0)+1);
        }

         /*
         we create a string containing all the element separated by a " " in a column and see if it already exists in the hash map containing all the element in a row
         for example:
         in
         1 2 3
         4 5 6
         7 8 9
          we check if "1 4 7 ", "2 5 8 ", "3 6 9 " is present in the hash map , if found we add the no of times it occurs to our ans

         */

        for( int i=0; i<n ; i++){
            StringBuilder a= new StringBuilder();
            for( int j=0; j<n ; j++){
                a.append(grid[j][i]);
                a.append(" ");
            }
            if( rowwise_elements.containsKey(a.toString()))ans+= rowwise_elements.get(a.toString());
        }
        return ans;
    }
}
