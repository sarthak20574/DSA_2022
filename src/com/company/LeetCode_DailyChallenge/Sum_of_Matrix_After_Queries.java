package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Sum_of_Matrix_After_Queries {

    //2718. Sum of Matrix After Queries
    //https://leetcode.com/problems/sum-of-matrix-after-queries/description/
    public long matrixSumQueries(int n, int[][] queries) {

        int len= queries.length;

        // int[][] ans= new int[n][n];

        int[]r_rem= new int[n];
        int[]c_rem= new int[n];

        Arrays.fill( r_rem,n);
        Arrays.fill( c_rem,n);

        long ret=0;

        int sub_r=0, sub_c=0;


        for( int i= len-1; i>=0; i--) {

            //row
            if( queries[i][0]==0) {

                int rem=r_rem[ queries[i][1]]- sub_r;
                if( rem<=0) continue;
                ret+= queries[i][2] * rem;

                // for( int k=0; k<n; k++) {

                //     if(c_rem[k]>0)c_rem[k]--;
                // }
                sub_c++;
                r_rem[ queries[i][1]]=0;
            }
            // cols
            else {
                int rem=c_rem[ queries[i][1]]- sub_c;
                if( rem<=0) continue;

                ret+= queries[i][2] * rem;

                // to sub


                // for( int k=0; k<n; k++) {

                //     if(r_rem[k]>0)r_rem[k]--;
                // }

                sub_r++;
                c_rem[ queries[i][1]]=0;
            }

        }


        // System.out.println(Arrays.deepToString(ans));
        return ret;

    }
}
