package com.company.LeetCode_DailyChallenge;

public class Best_Time_to_Buy_and_Sell_Stock_II {


//122. Best Time to Buy and Sell Stock II
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/

    public int maxProfit(int[] prices) {

        // set the previous one as
        int ans=0, prev=prices[0], n= prices.length;

        for( int i=1; i<n; i++){

            // if we are making a profit by selling the previously bought stock today we sell it
            if( prices[i]>prev){
                ans+=prices[i]-prev;

                // we sold the stock so update the prev stock assuming we buy the current stock
                prev= prices[i];
            }

            // we buy the stock at the most min price possible
            prev= Math.min(prices[i], prev);
        }

        return ans;

    }
}
