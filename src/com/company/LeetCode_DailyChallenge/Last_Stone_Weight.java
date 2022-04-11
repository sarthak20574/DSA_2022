package com.company.LeetCode_DailyChallenge;

import java.util.PriorityQueue;

public class Last_Stone_Weight {

    //1046. Last Stone Weight
    //https://leetcode.com/problems/last-stone-weight/
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap= new PriorityQueue<>((a, b)-> b-a);

        for( int stone: stones){
            maxHeap.add(stone);
        }

        while (maxHeap.size()>1){

            int first=maxHeap.poll();
            int second= maxHeap.poll();

            if( first-second!=0)
                maxHeap.add(first-second);
        }
        return maxHeap.isEmpty()?0:maxHeap.poll();
    }
}

