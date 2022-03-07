package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Greedy {

    //Activity Selection Problem
    //if you are at the ith activity then, our next step should be to
    // select the fastest finishing activity or that finished first
    //sort the activities wrt to end times
    //if( the end times of the next fastest finishing activities is greater
    // than the ongoing activity take it

    //The greedy choice is to always pick the next activity whose finish time is
    // least among the remaining activities and the start time is more than or equal
    // to the finish time of the previously selected activity

    class Activity{
        int start;
        int end;

        public Activity(int start, int end){
            this.start=start;
            this.end= end;
        }
    }

    static class Compare{

        static void compare(Activity arr[], int n){

            Arrays.sort(arr, new Comparator<Activity>() {
                @Override
                public int compare(Activity o1, Activity o2) {
                    return o1.end-o2.end;
                }
            });
        }
    }
     void printMaxActivities(Activity arr[], int n){

        Compare.compare(arr, n);

        System.out.println("the following activiites were selected:");
        System.out.println(arr[0].start+" "+arr[0].end);
        int cur=0, no_of_tasks_done=1;

        for (int i=1; i< n ; i++){
            if( arr[cur].end<=arr[i].start){
                System.out.println(arr[i].start+" "+arr[i].end);
                cur=i;
                no_of_tasks_done++;
            }
        }
         System.out.println("tasks done:"+no_of_tasks_done);

    }

    public Activity[] load(int[] start, int[] end){
        int n=start.length;
        Activity[] activities= new Activity[n];
        for(int i=0 ; i< n; i++){
            activities[i]= new Activity(start[i], end[i]);
        }
        return activities;
    }
}
