package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;
import java.util.PriorityQueue;

public class The_K_Weakest_Rows_in_a_Matrix {
    //https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/

    //priority queue holding an integer array that holds an integer array in which the 0th index would give the no.
    // of soldier and the first index would give the index of row

    //so take a max heap and the eleminate the max values
    //given a,b first sort a[0], b[0] in descending order and if a[0]==b[0] then sort according to the index
    // ie, a[1], b[1]
    public int[] kWeakestRows(int[][] mat, int k) {

        //b-a is descending order
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> a[0] != b[0] ? b[0] - a[0] : b[1] - a[1]);


        for (int i = 0; i < mat.length; i++) {
            int no_soldiers = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) no_soldiers++;
                else break;
            }
            maxHeap.offer(new int[]{no_soldiers, i});
        }

        while (maxHeap.size() > k) {
            maxHeap.poll();
        }

        int[] ans = new int[k];

        while (k-- > 0) {
            ans[k] = maxHeap.poll()[1];
        }

        return ans;
    }

    //instead of looping we can binary search the no of 1s that r there
    // instead of priority queue we take an array of count

    public int[] kWeakestRows1(int[][] mat, int k) {
        //b-a is descending order
        int[] count= new int[mat.length];
        int[] ans=new int[k];

        for (int i = 0; i < mat.length; i++) {
            int no_soldiers = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) no_soldiers++;
                else break;
            }
            count[i]=no_soldiers*1000 +i;//to get i %1000 and /1000 to get count
        }
        Arrays.sort(count);

        for( int i=0; i< k; i++){
            ans[i]=count[i]%1000;
        }

        return ans;
    }
}
