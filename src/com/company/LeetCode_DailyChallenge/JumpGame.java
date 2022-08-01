package com.company.LeetCode_DailyChallenge;

public class JumpGame {

    //55. Jump Game
    //https://www.youtube.com/watch?v=muDPTDrpS28
    //https://leetcode.com/problems/jump-game/
        /*
           bool canJump(vector<int>& nums) {
        int n= nums.size();
        int max_reach=0;
        for( int i=0; i<n; i++){
            if( max_reach>=i){
                 max_reach= max(max_reach, i+nums[i]);
            }
        }
        return max_reach>=n-1;
    }
         */

    public boolean canJump(int[] nums) {

        int n= nums.length;

        //here max denotes the maximum index upto which we can jump
        int max=0, i=0;

        // while we can still jump, ie, our max jump is greater than or equal to our 'i'
        while(i<=max){

            // we try to maximize our jumps...
            max= Math.max(i+nums[i],max);

            // if we reacht the last index then done
            if(max>=n-1) return true;

            i++;
        }

        //we will reach here only if we never reached the last index
        return false;

    }

  /*
  time complexity= O(n)
    Space Complexity= O(1)

   */
}
