package com.company.LeetCode_DailyChallenge;

public class Video_Stitching {

    //1024. Video Stitching
    //https://leetcode.com/problems/video-stitching/

    public int videoStitching(int[][] clips, int t) {


        int[] pre= new int[t+1];


        for( int[] c: clips){
            if(c[0]<t+1)
                pre[c[0]]=Math.max(pre[c[0]],c[1]);
        }


        int cur=1, ans=1, maxx=pre[0];
        while( cur<=maxx){

            //  System.out.println(cur+" "+maxx);

            if( maxx>=t) return ans;

            ans++;

            int m=maxx;

            for( ; cur<=m ; cur++){
                maxx= Math.max(pre[cur], maxx);
            }
        }

        return maxx>=t?ans:-1;
    }
}
