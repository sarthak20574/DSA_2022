package com.company.LeetCode_DailyChallenge;

import java.util.LinkedList;
import java.util.Queue;

public class Knight_Walk {


    //Knight Walk
//https://practice.geeksforgeeks.org/problems/knight-walk4521/1
//https://www.youtube.com/watch?v=36lfCmE1fao&ab_channel=SagarMalhotra

    class Pair {
        int x;
        int y;
        int d;

        Pair(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }

    class Solution {
        int ans = Integer.MAX_VALUE;

        public int minStepToReachTarget(int KnightPos[], int TargetPos[], int n) {

            int sx = KnightPos[0], sy = KnightPos[1], tx = TargetPos[0], ty = TargetPos[1];

            boolean[][] visited = new boolean[n + 1][n + 1];

            Queue<Pair> q = new LinkedList<>();
            visited[sx][sy] = true;
            q.add(new Pair(sx, sy, 0));

            while (q.isEmpty() == false) {

                int size = q.size();

                for (int k = 0; k < size; k++) {

                    Pair cur = q.poll();

                    sx = cur.x;
                    sy = cur.y;
                    int dist = cur.d;

                    if (sx == tx && sy == ty) return dist;

                    int[][] dir = {{1, 2}, {-1, -2}, {-1, 2},
                            {1, -2}, {2, 1}, {2, -1}, {-2, 1}, {-2, -1}};

                    for (int i = 0; i < 8; i++) {

                        int x = sx + dir[i][0];
                        int y = sy + dir[i][1];


                        if (x >= 1 && y >= 1 && x < n + 1 && y < n + 1
                                && visited[x][y] == false) {

                            visited[x][y] = true;
                            q.add(new Pair(x, y, dist + 1));
                        }

                    }
                }

            }

            return 0;

        }
    }
}
