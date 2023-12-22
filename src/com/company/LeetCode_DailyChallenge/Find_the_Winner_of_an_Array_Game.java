package com.company.LeetCode_DailyChallenge;

public class Find_the_Winner_of_an_Array_Game {

    //1535. Find the Winner of an Array Game
    //https://leetcode.com/problems/find-the-winner-of-an-array-game/?envType=daily-question&envId=2023-11-05


    public int getWinner(int[] nums, int k) {

        int maxx=nums[0];
        int cur=0;

        for( int i=1; i<nums.length; i++){

            if( maxx>=nums[i]){
                cur++;
            }
            else{
                cur=1;
                maxx=nums[i];
            }
            //System.out.println( cur+" "+ maxx);
            if( k==cur) return maxx;
        }
        return maxx;
    }

}
