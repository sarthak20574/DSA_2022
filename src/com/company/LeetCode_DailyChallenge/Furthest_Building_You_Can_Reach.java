package com.company.LeetCode_DailyChallenge;

import java.util.PriorityQueue;

public class Furthest_Building_You_Can_Reach {

    public int furthestBuilding(int[] heights, int bricks, int ladders) {

        PriorityQueue<Integer> minHeap= new PriorityQueue<>();

        int n= heights.length;
        int i=1;

        for( ;i<n; i++ ){
            int x=heights[i]- heights[i-1];
            if( x<=0)continue;

            if( minHeap.size()!= ladders){
                minHeap.add(x);
                continue;
            }
            else if (!minHeap.isEmpty() && x>minHeap.peek()) {
                int y = minHeap.poll();

                minHeap.add(x);
                x = y;
            }

                if( bricks>=x){
                    bricks-=x;
                }
                else return i-1;
            }

        return n-1;
        }




}
