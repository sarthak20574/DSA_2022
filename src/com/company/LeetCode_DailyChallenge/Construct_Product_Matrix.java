package com.company.LeetCode_DailyChallenge;

public class Construct_Product_Matrix {

    //2906. Construct Product Matrix
    //https://leetcode.com/problems/construct-product-matrix/description/
    //https://leetcode.com/problems/construct-product-matrix/solutions/4169812/easy-to-understand-c-solution-using-precalculations/


    public int[][] constructProductMatrix(int[][] g) {
        int n= g.length, m= g[0].length;
        int[][] ans= new int[n][m];
        long[][] f= new long[n][m], b= new long[n][m];

        long mod=12345;
        long c=1;

        for( int i=0; i<n; i++){
            for( int j=0; j<m; j++){
                f[i][j]=c;
                c=  (f[i][j] * g[i][j]%mod)%mod;
            }
        }

        c=1;

        for( int i=n-1; i>=0; i--){
            for( int j=m-1; j>=0; j--){
                b[i][j]=c;
                c=  (b[i][j] * g[i][j]%mod)%mod;
            }
        }

        // System.out.println( Arrays.deepToString(f));
        //  System.out.println( Arrays.deepToString(b));



        for( int i=0; i<n; i++){
            for( int j=0; j<m; j++){
                ans[i][j]= (int)(( f[i][j] *b[i][j]) % mod );
            }
        }


        return ans;
    }
}
