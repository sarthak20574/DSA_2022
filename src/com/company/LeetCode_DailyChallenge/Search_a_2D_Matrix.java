package com.company.LeetCode_DailyChallenge;

public class Search_a_2D_Matrix {
    //74. Search a 2D Matrix
    //https://leetcode.com/problems/search-a-2d-matrix/

    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0, high = n * m - 1, mid, midx, midy;

        while (low <= high) {
            mid = low + (high - low) / 2;

            midx = mid / m;
            midy = mid % m;

            if (matrix[midx][midy] == target) return true;

            else if (matrix[midx][midy] < target) low = mid + 1;
            else {
                high = mid - 1;
            }
        }
        return false;
    }

}
