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


    //Fractional Knapsack Problem
    //calculate the ratio value/weight for each item and sort
    // the item on basis of this ratio. Then take the item with the
    // highest ratio and add them until we can’t add the next item
    // as a whole and at the end add the next item as much as we can.

    public double getMaxValue(int[] weight, int[] values, int capacity){
        int length=weight.length;
        Item[] items=new Item[length];

        for( int i= 0 ; i<length; i++){
            items[i]= new Item(weight[i],values[i],i);
        }

        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return (int) (o2.cost-o1.cost);
            }
        });

        int totalValue=0;
        int index= 0 ;
        while (index<length && capacity>=items[index].weight){
            totalValue+=items[index].value;
            capacity-=items[index].weight;
            index++;
        }
        if(index<length ){
            totalValue+=capacity*items[index].cost;
        }

        return totalValue;
    }

    class Item{
        int weight;
         int value;
         double cost;

         int ind;//???

        public Item(int weight, int value, int ind){
            this.weight= weight;
            this.value=value;
            this.ind= ind;
            this.cost= value/weight;
        }
    }

    //gfg solution
    double fractionalKnapsack(int W, Item arr[], int n)
    {
        Arrays.sort(arr, (a,b)->
            b.value/b.weight-a.value/a.weight
        );

        int index=0;
        int ans=0;
        while (index < n && W >= arr[index].weight) {
            ans+=arr[index].value;
            W-=arr[index].weight;
            index++;

        }

        if( index<n){
            ans+=(((double)W)*((double)arr[index].value)/((double)arr[index].weight));
        }

        return ans;
    }


}
