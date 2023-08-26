package com.company.LeetCode_DailyChallenge;

import java.util.List;

public class Maximize_the_Profit_as_the_Salesman {


    //2830. Maximize the Profit as the Salesman
    //https://leetcode.com/problems/maximize-the-profit-as-the-salesman/description/
    public int maximizeTheProfit(int n, List<List<Integer>> offers) {
        int[] dp= new int[n+1];
        offers.sort((a,b)->a.get(1)==b.get(1)?b.get(2)-a.get(2):a.get(1)-b.get(1));
        int j=0;
        for( int i=0; i<=n; i++){
            if( j<offers.size()){
                while(j<offers.size() && offers.get(j).get(1)==i){

                    if(offers.get(j).get(0)-1>=0){
                        dp[offers.get(j).get(1)]=
                                Math.max( dp[(offers.get(j).get(0)-1)]+ offers.get(j).get(2)
                                        , dp[offers.get(j).get(1)]);
                    }
                    else dp[offers.get(j).get(1)]=
                            Math.max( offers.get(j).get(2)
                                    , dp[offers.get(j).get(1)]);

                    // System.out.println("j= "+j+", i="+i);

                    j++;

                }
            }
            if( i!=0)
                dp[i]=Math.max( dp[i],dp[i-1]);


        }

        //System.out.println(Arrays.toString(dp));

        return dp[n];
    }
}
