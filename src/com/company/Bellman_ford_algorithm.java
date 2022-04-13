package com.company;

import java.util.Arrays;

public class Bellman_ford_algorithm {
    // Bellman ford algo
//bari
//https://www.youtube.com/watch?v=FtN3BYH2Zes

//striver( for why n-1 see from 20:00)
//https://www.youtube.com/watch?v=75yC1vbS8S8


    //https://practice.geeksforgeeks.org/problems/negative-weight-cycle3504/1
//Negative weight cycle
    public int isNegativeWeightCycle(int n, int[][] edges) {
        if (n == 0 || edges == null) return 0;

        int[] distances = new int[n];
        Arrays.fill(distances, Integer.MAX_VALUE);

        // source= 0
        distances[0] = 0;

        // relaxing for n-1 times

        for (int i = 0; i < n - 1; i++) {

            for (int[] edge : edges) {

                // infinity + any number= overflow so take care of it too
                if (distances[edge[0]] != Integer.MAX_VALUE && distances[edge[1]] > distances[edge[0]] + edge[2]) {
                    distances[edge[1]] = distances[edge[0]] + edge[2];
                }
            }
        }

        // one more time
        for (int[] edge : edges) {
            if (distances[edge[0]] != Integer.MAX_VALUE && distances[edge[1]] > distances[edge[0]] + edge[2]) {
                return 1;
            }
        }
        return 0;
    }
}
