package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Convert_Sorted_List_to_Binary_Search_Tree {

    //109. Convert Sorted List to Binary Search Tree
    //https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/description/


    public TreeNode sortedListToBST(ListNode head) {

        List<Integer> li= new ArrayList<>();

        ListNode h= head;
        int n=0;

        while(h!=null){
            n++;
            li. add( h.val);
            h=h.next;
        }


        return fn( li, 0, n-1);

    }

    TreeNode fn( List<Integer> li, int beg, int end){
        if( beg>end) return null;

        int  mid = beg + ( end-beg)/2;

        TreeNode x= new TreeNode( li.get( mid));

        x.left= fn( li, beg, mid-1);
        x.right= fn( li, mid+1 , end);

        return x;
    }


}
