package com.company;

import java.util.*;

public class JobSequencingWithDeadlines {

//https://www.youtube.com/watch?v=zPtI8q9gvX8


    static class Job{
        int index;
        int profit;
        int deadline;


        public Job(int index, int profit, int deadline){
            this.index= index;
            this.profit = profit;
            this.deadline= deadline;
        }
    }


    // O(n^2)
    int[] JobScheduling(Job arr[], int size){

        // sort the jobs in descending order of their profit
        Arrays.sort(arr, (a,b)->{

            return b.profit - a.profit;
        });

        // find the max deadline
        int max_deadline=0;
        for( int i=0 ; i< size ; i++){
            if( arr[i].deadline> max_deadline){
                max_deadline= arr[i]. deadline;
            }
        }

        int[] ans=new int[max_deadline+1];// +1 size of array as to we also have to include the

        // initialize the arrays with an invalid value, don't forget
        Arrays.fill(ans,-1);


        // now start traversing the job array and pushing the most profitable to its last deadline/or its 1 less deadline

        int max_profit=0, no_of_jobs=0;
        for( int i=0 ; i<size; i++){

            for( int deadline= arr[i].deadline; deadline>0; deadline--){
                if (ans[deadline]==-1){
                    ans[deadline]=arr[i].index;
                    max_profit+=arr[i].profit;
                    no_of_jobs++;
                    break;
                }
            }
        }

        return new int[]{no_of_jobs, max_profit};
    }

    // can be done in O(n logn) using priority queue(max heap)



    public void loader(){


        Job[] jobs = {
                new Job(1,2,100),new Job(2,1,19),
                new Job(3,2,27), new Job(4,1,25),
                new Job(5,1,15)
        };

    }


}
