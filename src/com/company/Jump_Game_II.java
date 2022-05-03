package com.company;

public class Jump_Game_II {
    //45. Jump Game II
    //https://leetcode.com/problems/jump-game-ii/
    //https://www.youtube.com/watch?v=dJ7sWiOoK7g
        /*

          int jump(vector<int>& nums) {

        int n= nums.size();

        int start=0, end= 0;
        int ans=0, max_value=0;

       while( end<n-1){
           max_value=0;

           for( int i=start; i<=end; i++){
               max_value=max( max_value,i+nums[i]);
           }
           start=end+1;
           end= max_value;
           ans++;
       }
       return ans;
    }

         */

}
