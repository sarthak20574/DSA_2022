package com.company.LeetCode_DailyChallenge;

import java.util.PriorityQueue;

public class Kth_Largest_Element_in_a_Stream {
    //703. Kth Largest Element in a Stream

    //keep track of k latgest elements in min heap, if the new comer is smaller than the present kth largest(root) element
    // then discard it else include if amd any element larger than the present kth largest element

    class KthLargest {
        PriorityQueue<Integer> minHeap;
        static int k;

        public KthLargest(int k, int[] nums) {
            this.minHeap = new PriorityQueue<>();
            this.k=k;

            for (int num : nums) {
                minHeap.add(num);
            }

            while (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        public int add(int val) {

            // any new bigger element won't become the root of the moin heap
            // but all elements emaller than the present root( kth ;argest element) will beocome
            // the root
            minHeap.add(val);
            if( minHeap.size()>k) minHeap.poll();
            return minHeap.peek();
        }
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
