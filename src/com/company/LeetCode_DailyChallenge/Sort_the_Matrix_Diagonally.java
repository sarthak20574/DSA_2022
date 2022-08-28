package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Sort_the_Matrix_Diagonally {


    //1329. Sort the Matrix Diagonally
//https://leetcode.com/problems/sort-the-matrix-diagonally/
//https://leetcode.com/problems/sort-the-matrix-diagonally/discuss/489749/JavaPython-Straight-Forward


    // i-j is unique for each and every element present in that diagnol
    // so we traverse the whole matrix and then store the elements in the priority queue present in the map of key i-j

    // we then traverse the matrix and empty all the priority queues

    public int[][] diagonalSort(int[][] mat) {

        int r= mat.length, c= mat[0].length;

        Map<Integer, PriorityQueue<Integer>> m=new HashMap<>();

        for( int i=0; i<r; i++){
            for( int j=0; j<c; j++){

                m.putIfAbsent(i-j, new PriorityQueue<>());

                m.get(i-j).add(mat[i][j]);
            }
        }


        for( int i=0; i<r; i++) {
            for (int j = 0; j < c; j++) {

                mat[i][j]=m.get(i-j).poll();
            }
        }

        return mat;

    }
}
