package com.company.LeetCode_DailyChallenge;

public class _132_Pattern {
    //456. 132 Pattern
    //https://leetcode.com/problems/132-pattern/

    //Suppose we want to find a 123 sequence with s1 < s2 < s3, we just need to find s3,
    // followed by s2 and s1. Now if we want to find a 132 sequence with s1 < s3 < s2,
    // we need to switch up the order of searching. we want to first find s2, followed by s3, then s1.

   //https://leetcode.com/problems/132-pattern/discuss/94089/Java-solutions-from-O(n3)-to-O(n)-for-%22132%22-pattern-(updated-with-one-pass-slution)

    public boolean find132pattern(int[] nums) {
        //https://www.youtube.com/watch?v=VvqomJmyz1A&ab_channel=TechAdorabyNivedita

        int n= nums.length;
        int[] min_ele= new int[n];

        int min_ele_till_now=Integer.MAX_VALUE;

        for( int i=0; i<n ;i++){

            min_ele_till_now= Math.min( min_ele_till_now, nums[i]);
            min_ele[i]= min_ele_till_now;
        }

        for( int i= n-1, top= n; i>0; i--){

            //skio if nums[i] is actually the min element of all ele till i
            if( nums[i]<= min_ele[i]) continue;

            while (top<n && min_ele[top]<=min_ele[i])top++;

            if (top < n && nums[i] > min_ele[top]) return true;

            // now we have nums[i] <= mins[top]
            // push nums[i] to the "stack"
            top--;
            min_ele[top] = nums[i];

        }
        return false;
    }
}
