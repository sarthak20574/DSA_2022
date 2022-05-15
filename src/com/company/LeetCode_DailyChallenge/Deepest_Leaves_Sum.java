package com.company.LeetCode_DailyChallenge;

import java.util.LinkedList;
import java.util.Queue;

public class Deepest_Leaves_Sum {

    //1302. Deepest Leaves Sum
    //https://leetcode.com/problems/deepest-leaves-sum/
    //level order traversal where you keep the sum of each level.
    // https://www.youtube.com/watch?v=hM9tzzlRcnM


    public int deepestLeavesSum(TreeNode root) {

        Queue<TreeNode> queue= new LinkedList<>();

        if( root== null) return 0;
        queue.add(root);
        int sum=0;
        while ( !queue.isEmpty()) {
            int n = queue.size();

            sum=0;
            for (int i = 0; i < n; i++) {
                TreeNode t = queue.poll();
                sum += t.val;

                //next leyer so node's left and right has to be inserted too
                if(t.left!=null) queue.add(t.left);
                if(t.right!=null) queue.add(t.right);
            }
        }
        return sum;
    }
}
