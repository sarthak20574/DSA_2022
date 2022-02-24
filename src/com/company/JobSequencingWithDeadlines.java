package com.company;

import java.util.*;

public class JobSequencingWithDeadlines {
    // incomplete

//https://www.youtube.com/watch?v=zPtI8q9gvX8



    static class Job{
        int index;
        int weight;
        int deadline;


        public Job(int index, int weight, int deadline){
            this.index= index;
            this.weight= weight;
            this.deadline= deadline;
        }
    }


    // O(n^2)
    int[] JobScheduling(Job arr[], int size){

        int[] ans= new int[size];

        for( int i=0 ;i < size; i++){

        }










        return ans;
    }



    public void loader(){


        Job[] jobs = {
                new Job(1,2,100),new Job(2,1,19),
                new Job(3,2,27), new Job(4,1,25),
                new Job(5,1,15)
        };

    }


}
