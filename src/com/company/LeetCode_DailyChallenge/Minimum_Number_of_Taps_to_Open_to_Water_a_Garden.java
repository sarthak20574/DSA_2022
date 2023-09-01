package com.company.LeetCode_DailyChallenge;

public class Minimum_Number_of_Taps_to_Open_to_Water_a_Garden {

    //1326. Minimum Number of Taps to Open to Water a Garden
    //https://leetcode.com/problems/minimum-number-of-taps-to-open-to-water-a-garden/description/
    //https://leetcode.com/problems/minimum-number-of-taps-to-open-to-water-a-garden/solutions/506853/java-a-general-greedy-solution-to-process-similar-problems/


    // just write down the pre arrays( dry run)

    public int minTaps(int n, int[] r) {

        int[] pre= new int[n+1];

        for( int i=0; i<r.length; i++){

            if(r[i]==0) continue;
            int low= Math.max( 0, i-r[i]);
            //int high= Math.min(i+r[i],n-1);

            pre[low]= Math.max( pre[low],i+r[i]);
        }

        // System.out.println(Arrays.toString(pre));

        //if( n==1)

        //n=

        int cur=1, ans=1, maxx=pre[0];
        while( cur<=maxx){

            //  System.out.println(cur+" "+maxx);

            if( maxx>=n) return ans;

            ans++;

            int m=maxx;

            for( ; cur<=m ; cur++){
                maxx= Math.max(pre[cur], maxx);
            }
        }

        return maxx>=n?ans:-1;
    }

}
