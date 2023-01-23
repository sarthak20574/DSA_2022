package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Sort_the_Students_by_Their_Kth_Score {

    //2545. Sort the Students by Their Kth Score
    //https://leetcode.com/problems/sort-the-students-by-their-kth-score/description/

    public int[][] sortTheStudents(int[][] score, int k) {

        Arrays.sort(score, (a, b)->b[k]-a[k]);

        return score;
    }

}
