package com.company.LeetCode_DailyChallenge;

import java.util.ArrayDeque;
import java.util.Deque;



public class Sliding_Window_Maximum {

    //239. Sliding Window Maximum
    //https://leetcode.com/problems/sliding-window-maximum/
    //https://www.youtube.com/watch?v=DfljaUwZsOk&ab_channel=NeetCode


    /*
    we store only the elements that can be our answer,(deque will always be in descending order of the
    elements) we first remove all the elements that are out of the k element long window from the front
     of the deque, then before adding the new element at index i, we eleminate all the elements from
     the end(back) that are smaller than our new incoming element at index i as we have found a greater
     element that can that is even greater then the previous big element at the back of the dequeu
     ( remember the deque will always be in descending order of the elements)
    */

    public int[] maxSlidingWindow(int[] nums, int k) {

        int n=nums.length;
        Deque<Integer> q = new ArrayDeque<>();
        int[] ans= new int[n-k+1];
        int ans_index=0;

        for( int i=0; i<n; i++){

            // remove elements from the from the front(start) that are out of the k window  .....i-k...k ele...i
            while( q.isEmpty()==false && q.peek()<i-k+1){
                q.poll();
            }

            // remove all elements fron the back(end) that are less than the incoming ele, ie the ele at index i
            while (q.isEmpty()==false && nums[i]>nums[q.peekLast()]){
                q.pollLast();
            }

            //  now add the element
            q.add(i);

            // don't have to add any element as our answer when the window size is less than k
            if( i>=k-1){
                ans[ans_index++]=nums[q.peek()];
            }
        }

        return ans;
    }

}
