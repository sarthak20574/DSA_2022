package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Substring_XOR_Queries {

    //2564. Substring XOR Queries
    //https://leetcode.com/problems/substring-xor-queries/description/

    public int[][] substringXorQueries(String s, int[][] queries) {

        int n= queries.length;

        int[][] ans= new int[n][2];

        Map<Integer, int[]> m= new HashMap<>();


        int len= s.length();

        for( int i=0; i<len; i++){

            int cur=0;

            if(s.charAt(i)=='0'){
                m.putIfAbsent(0, new int[]{i, i});
                continue;
            }

            // int cur=1;

            // // 1 need if starting from i+1

            //  if(s.charAt(i)=='1'){
            //     m.putIfAbsent(1, new int[]{i, i});
            // }

            //  for( int j=i+1; j<i+31 && j<len; j++){

            //     cur*=2;
            //     cur+= s.charAt(j)-'0';

            //     m.putIfAbsent(cur, new int[]{i, j});
            // }

            for( int j=i; j<i+31 && j<len; j++){

                cur*=2;
                cur+= s.charAt(j)-'0';

                m.putIfAbsent(cur, new int[]{i, j});
            }
        }


        for( int i=0; i<n; i++){

            int[] x= m.getOrDefault(queries[i][0] ^ queries[i][1],
                    new int[]{-1,-1});
            ans[i]= new int[]{x[0], x[1]};

        }

        return ans;

    }
}
