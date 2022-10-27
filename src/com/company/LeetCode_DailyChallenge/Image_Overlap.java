package com.company.LeetCode_DailyChallenge;

public class Image_Overlap {


    // 835. Image Overlap
    //https://leetcode.com/problems/image-overlap/description/

    public int largestOverlap(int[][] img1, int[][] img2) {

        int n= img1.length, ans=0;

        for( int i=-n+1; i<n; i++){

            for( int j=-n+1; j<n ; j++ ){

                int cur=0;

                for( int ii=0; ii<n; ii++){
                    for( int jj=0; jj<n; jj++){
                        if( (i+ii)>=0 && (i+ii)<n &&
                                (j+jj)<n && (j+jj)>=0 &&
                                img1[i+ii][j+jj]==1 && img2[ii][jj]==1){
                            cur++;
                        }
                    }
                }

                ans= Math.max( cur, ans);
            }

        }

        return ans;
    }

}
