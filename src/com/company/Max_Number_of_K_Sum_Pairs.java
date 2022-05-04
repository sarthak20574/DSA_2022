package com.company;

import java.util.HashMap;
import java.util.Map;

public class Max_Number_of_K_Sum_Pairs {

    //1679. Max Number of K-Sum Pairs

    /*
    int maxOperations(vector<int>& nums, int k) {

     sort(nums.begin(), nums.end());

     int n= nums.size();

     // 1 2 3 4 5 6

     int i=0, j=n-1;

     int ans= 0;

     while( i<=j){
         if(nums[i]+nums[j]==k ){
             i++;
             j--;
             ans++;
         }
         else if( nums[i]+ nums[j]<k)i++;
         else j--;
     }

     return ans;

    }
     */


    //not my slution but a nice one in O(n)

    class Solution {
        public int maxOperations(int[] nums, int k) {
            Map<Integer,Integer> map = new HashMap<>();
            int res=0;
            for(int num: nums){
                if(map.getOrDefault(k-num,0)>0){
                    res++;
                    map.put(k-num,map.get(k-num)-1);
                }
                else map.put(num,map.getOrDefault(num,0)+1);
            }
            return res;
        }
    }

}
