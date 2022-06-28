package com.company.LeetCode_DailyChallenge;


public class Convert_Sorted_Array_to_Binary_Search_Tree {

    //108. Convert Sorted Array to Binary Search Tree

    public TreeNode sortedArrayToBST(int[] nums) {

         return fn( nums, 0, nums.length-1);

    }

    TreeNode fn( int[] nums, int low, int high){

        if( low> high){
            return null;
        }

        int mid= (low + high)/ 2;
        TreeNode root= new TreeNode(nums[mid]);

        root.left= fn(nums,low, mid-1 );
        root.right= fn(nums, mid+1, low);
        return root;
    }
}
