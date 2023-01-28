package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shuffle_an_Array {

    //384. Shuffle an Array
    //https://leetcode.com/problems/shuffle-an-array/description/

    class Solution {

        int[] nums;

        public Solution(int[] nums) {
            this.nums= nums;
        }

        public int[] reset(){
            return nums;
        }

        public int[] shuffle() {

            Random random= new Random();

            List<Integer> arr= new ArrayList<>();
            for( int i: nums){
                arr.add(i);
            }

            int n= arr.size();

            int cur_i=0, ans[]= new int[n];

            int range=n;

            for( int i=0; i<n; i++){
                int x=random.nextInt(range);
                range--;
                ans[cur_i++]=arr.get(x);
                arr.remove(x);
            }
            return ans;
        }
    }


}
