package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Course_Schedule_III {

    //630. Course Schedule III
    //https://leetcode.com/problems/course-schedule-iii/
    //https://www.youtube.com/watch?v=ey8FxYsFAMU
    public int scheduleCourse(int[][] courses) {
        int n= courses.length;
        //courses= duration, deadline

        Arrays.sort(courses,(a,b)-> a[1]!=b[1]?a[1]-b[1]:a[0]-b[0]);

        // PriorityQueue<Integer[]> maxHeap= new PriorityQueue<>((a,b)->b[0]-a[0]);
        PriorityQueue<Integer> maxHeap= new PriorityQueue<>((a,b)->b-a);

        int time=0;
        for( int i=0; i<n ; i++){
            if( courses[i][0]<=courses[i][1]){
                if(time+ courses[i][0]<=courses[i][1]){
                    maxHeap.add(courses[i][0]);
                    time=time+ courses[i][0];
                }
                else{
                    if( maxHeap.peek()> courses[i][0] ){
                        time=time+ courses[i][0]-  maxHeap.poll();
                        maxHeap.add(courses[i][0]);
                    }
                }
            }

        }
        return maxHeap.size();

    }
}
