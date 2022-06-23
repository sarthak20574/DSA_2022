package com.company.LeetCode_DailyChallenge;

import java.util.*;

public class Task_Scheduler {

    //621. Task Scheduler
    //https://leetcode.com/problems/task-scheduler/
    //https://www.youtube.com/watch?v=ySTQCRya6B0

    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> x= new HashMap<>();

        int size= tasks.length;
        for( int i=0; i< size; i++){
            x.put(tasks[i],x.getOrDefault(tasks[i],0)+1);
        }

        PriorityQueue<Integer> maxHeap= new PriorityQueue<>((a,b)-> b-a);
        maxHeap.addAll(x.values());

        int ans=0;

        while (!maxHeap.isEmpty()){
            // n( inclusive) so n+1 time
            List<Integer> cur_tasks_array= new ArrayList<>();

            for( int i=0; i<n+1; i++){
                if( !maxHeap.isEmpty()){
                    cur_tasks_array.add(maxHeap.poll());
                }
                else break;
            }

            for( int a:  cur_tasks_array ){
                if(--a>0) maxHeap.add(a);
            }

            ans+= maxHeap.isEmpty()? cur_tasks_array.size():n+1;
        }
        return ans;

    }
}
