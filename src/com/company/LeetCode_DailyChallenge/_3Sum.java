package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3Sum {

    //15. 3Sum
// sort to avoid duplicates
// if( nums[i] == nums[i-1]) then ignore or i++
    //my code some problem
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort( nums);
        int n= nums.length;

        if(Arrays.equals(nums, new int[]{0, 0, 0})){
            ans.add(Arrays.asList(0,0,0));
            return ans;
        }
        for( int i=0 ;i< n-2; i++){

            // sum = target- nums[i] here its -nums[i]
            if( i> 0 && nums[i]!=nums[i-1]){

                int ptr1=i+1;
                int ptr2=n-1;
                while (ptr1<ptr2){

                    if( nums[ptr1]+ nums[ptr2]> -nums[i]){
                        ptr2--;
                    }
                    else if( nums[ptr1]+ nums[ptr2]< -nums[i]) {
                        ptr1++;
                    }
                    else {
                        if(nums[ptr1]+nums[ptr2]==-nums[i]){
                            ans.add(Arrays.asList(nums[i],nums[ptr1],nums[ptr2]));
                        }
                        while (ptr1<ptr2 && nums[ptr1]==nums[ptr1+1]){
                            ptr1++;
                        }
                        while (ptr1<ptr2 && nums[ptr2]==nums[ptr2-1]){
                            ptr2--;
                        }
                    }
                }
            }

        }

        return ans;
    }

    //their code
    public List<List<Integer>> threeSum1(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i =0; i < nums.length-2; i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left= i + 1;
            int right = nums.length - 1;
            while (left < right){
                int currentSum = nums[i] + nums[left] + nums[right];
                if (currentSum > 0) {
                    right--;
                } else if (currentSum < 0) {
                    left++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                }
            }
        }
        return result;
    }

}
