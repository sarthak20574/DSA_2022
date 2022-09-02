package com.company;

import java.util.ArrayList;
import java.util.List;

public class Find_pairs_with_given_sum_in_doubly_linked_list {
    //Find pairs with given sum in doubly linked list
    //https://practice.geeksforgeeks.org/problems/find-pairs-with-given-sum-in-doubly-linked-list/1

    class Node
    {
        int data;
        Node next,prev;

        Node(int x){
            data = x;
            next = null;
            prev = null;
        }
    }

    public static ArrayList<ArrayList<Integer>>
    findPairsWithGivenSum(int target, Node head) {

        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();

        if( head==null) return ans;

        Node start= head;

        // reach the end of the list
        Node end=head;
        while( end.next!=null){
            end=end.next;
        }


        while( start!=end && start.data<end.data){

            if( start.data+end.data ==target){
                ans. add( new ArrayList<>(List.of(start.data, end.data)));
                start= start.next;
                end= end.prev;
            }
            else if(start.data+end.data >target){
                end= end.prev;
            }
            else start=start.next;

            // if(start==end)System.out.println(start.data);
        }

        return ans;
    }

}
