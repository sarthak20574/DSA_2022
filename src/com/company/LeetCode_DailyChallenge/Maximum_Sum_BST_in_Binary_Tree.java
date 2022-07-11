package com.company.LeetCode_DailyChallenge;

public class Maximum_Sum_BST_in_Binary_Tree {

    //1373. Maximum Sum BST in Binary Tree
//https://leetcode.com/problems/maximum-sum-bst-in-binary-tree/submissions/
//check Largest_BST.java in the repo

    class m {
        int minn;
        int maxx;
        int sum;

        m(int m, int M, int sum) {
            this.minn = m;
            this.maxx = M;
            this.sum = sum;
        }
    }

    class Solution {

        // for no tree sum still equals 0 so its the lower limit
        int ans = 0;

        public int maxSumBST(TreeNode root) {
            fn(root);

            return ans;
        }

        m fn(TreeNode root) {
            // base case just return a super trivial object
            if (root == null) {
                return new m(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
            }
            // post order traversal....so get the results from the right and the left subtree
            m lft = fn(root.left);
            m ryt = fn(root.right);

            // now checking if its a bst
            if (root.val < ryt.minn && root.val > lft.maxx) {

                // get the sum here
                int s = ryt.sum + lft.sum + root.val;

                // update the ans if we get a new max sum
                ans = Math.max(ans, s);

                // min( root.val, left.min) left node is always smaller than root but for base case( leaf node) its min and max will be its value

                return new m(Math.min(root.val, lft.minn), Math.max(root.val, ryt.maxx), s);
            } else {

                // if not a bst then just make sure that you can't use this so pass the maximim no. possible in the maxx parameter and the minimum no. possible....so that it can't be considered ever as a bst for the ancestor level

                return new m(Integer.MIN_VALUE, Integer.MAX_VALUE, Math.max(ryt.sum, lft.sum));
            }

        }
    }
}
