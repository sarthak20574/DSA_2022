package com.company.LeetCode_DailyChallenge;

import java.util.PriorityQueue;

public class Find_Median_from_Data_Stream {

    class MedianFinder {

        //295. Find Median from Data Stream
        //https://leetcode.com/problems/find-median-from-data-stream/description/
        //https://www.youtube.com/watch?v=itmhHWaHupI&ab_channel=NeetCode

        PriorityQueue<Integer> left;
        PriorityQueue<Integer> right;
        public MedianFinder() {
            right= new PriorityQueue<>((a,b)->a-b);
            left= new PriorityQueue<>((a,b)-> b-a);

        }

        public void addNum(int num) {
            left.add(num);

            //every left <= right
            if( left.peek()!=null && right.peek()!=null && left.peek()>right.peek()){
                right.add(left.poll());
            }
            //check the sizes

            // 7 5
            if( left.size()>right.size()+1){
                right.add( left.poll());
            }

            if( right.size()> left.size()+1){
                left.add(right.poll());
            }

        }

        public double findMedian() {
            if(left.size()==right.size())
                return ( (double)(right.peek()+ left.peek())/2.0);

            else if(right.size()>left.size()) return right.peek();
            else return left.peek();
        }
    }

}
