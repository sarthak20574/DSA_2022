package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Union_find_Number_of_Connected_Components {

    // idea from https://www.youtube.com/watch?v=8f1XPm4WOUc&ab_channel=NeetCode

    int v;
    int[] parent;
    int[] rank;

    Union_find_Number_of_Connected_Components(int v) {
        this.v = v;
        parent = new int[v + 1];
        rank = new int[v + 1];

        Arrays.fill(rank, 1);
        for (int i = 0; i <= v; i++) {
            parent[i] = i;
        }
    }

    int find_parent(int x) {

        if (x == parent[x]) return x;

        parent[x] = find_parent(parent[x]);

        return parent[x];
    }

    void unionize(int a, int b) {

        int par1 = find_parent(a), par2 = find_parent(b);

        if (a != b) {
            // higher rank should be made the parent and the rank of the parent increased
            if (rank[par1] > rank[par2]) {
                parent[par2] = par1;
                rank[par1] += rank[par2];
            } else {
                parent[par1] = par2;
                rank[par2] += rank[par1];
            }
        } else {
            // already in the same set
        }

    }


    //Number of Provinces on gfg
    //https://practice.geeksforgeeks.org/problems/number-of-provinces/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int v) {

        return 0;
    }


}



