package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class Print_leaf_nodes_from_preorder_traversal_of_BST {

    //Print leaf nodes from preorder traversal of BST

    public int[] leafNodes(int arr[], int N) {

        ArrayList<Integer> ans = new ArrayList<>();

        Stack<Integer> s = new Stack<>();

        for (int i : arr) {

            if (s.isEmpty() == false && s.peek() < i) {
                ans.add(s.peek());

                while (s.isEmpty() == false && s.peek() < i) {
                    s.pop();
                }

            }

            s.add(i);
        }


        ans.add(s.peek());


        int k = 0;
        int[] ret = new int[ans.size()];
        for (int i : ans) {
            ret[k++] = i;
        }

        return ret;
    }


}
