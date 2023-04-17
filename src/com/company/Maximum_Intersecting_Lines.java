package com.company;

import java.util.ArrayList;
import java.util.List;

public class Maximum_Intersecting_Lines {

    //Maximum Intersecting Lines
    //https://practice.geeksforgeeks.org/problems/63c232252d445a377e01cd91adfd7d1060580038/1

    public int maxIntersections(int[][] lines, int n) {

        List<int[]> x= new ArrayList<>();

        int ans=1, cur;

        for( int[] i: lines){

            x.add( new int[]{i[0] ,1 }   );
            x.add( new int[]{i[1]+1 ,-1}  );
        }

        x.sort((a, b) -> a[0] - b[0]);
        //System.out.println(Arrays.deepToString(x.toArray()));

        cur=0;
        int prev= Integer.MIN_VALUE;

        for( int i=0; i<2*n; i++){

            cur+= x.get(i)[1];

            // for 2 numbers where 1 start and the other end at the same location we need to exhaust the location

            // try
            //             9
            // 5 0 0 -10 -5 1 -2 4 3
            // 9 9 3 5 10 10 4 10 8

            if( i+1<2 *n && x.get(i)[0]==x.get(i+1)[0]){
                continue;
            }
            ans= Math.max(ans, cur);

        }

        return ans;
    }


}
