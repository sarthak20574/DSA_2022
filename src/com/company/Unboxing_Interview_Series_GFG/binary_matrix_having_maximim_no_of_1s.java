package com.company.Unboxing_Interview_Series_GFG;

public class binary_matrix_having_maximim_no_of_1s {


//binary matrix having maximim no of 1s
//https://practice.geeksforgeeks.org/contest/interview-series-swiggy-5352/problems/
    //https://www.geeksforgeeks.org/find-row-number-binary-matrix-maximum-number-1s/

    public int[] findMaxRow(int mat[][], int N) {
        int row_ans = -1, ans_no_of_1s = 0;
        int j = N - 1;
        for (int i = 0; i < N; i++) {

            while (j >= 0 && mat[i][j] != 0) {
                row_ans = i;
                ans_no_of_1s++;
                j--;
            }
        }
        return new int[]{row_ans, ans_no_of_1s};
    }
}
