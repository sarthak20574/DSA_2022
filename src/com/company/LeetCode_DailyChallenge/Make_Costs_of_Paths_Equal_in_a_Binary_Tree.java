package com.company.LeetCode_DailyChallenge;

public class Make_Costs_of_Paths_Equal_in_a_Binary_Tree {

    //2673. Make Costs of Paths Equal in a Binary Tree
    //https://leetcode.com/problems/make-costs-of-paths-equal-in-a-binary-tree/
    //https://www.youtube.com/watch?v=ng3g-dC3lLI&t=2504s&ab_channel=AryanMittal

    int ans=0;
    public int minIncrements(int n, int[] c) {
        ans=0;
        fn( n, c, 1);
        return ans;
    }

    int fn( int n, int[] c, int cur){
        if( cur>n) return 0;
        int l=fn( n, c, cur*2),r=fn( n, c, cur*2+1);
        int minn= Math.min(l, r);
        ans+= l-minn+ r-minn;
        return minn+l-minn+ r-minn+ c[cur-1];
    }
}
