package com.company;

import java.util.Collections;

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



    public void loader(){


    }


}









//Interval Scheduling Maximization
//https://www.youtube.com/watch?v=hVhOeaONg1Y

//Given a set of intervals intervals, return a maximal set of the intervals that has no overlaps.
//
//Two intervals overlap if one interval's end strictly crosses another interval's start time.

//maximize the no. of intervals(works)done, optimal solution most intervals without conflicts
// sort by the FINISH times(finish things that finish fast so we do more and more jobs)
// choose the earliest finishing item


//greedy won't create conflicts

//G={g1,g2,g3...gm}
// O={o1,o2, o3...on}
// n>=m  goal: n==m, let k be the interval when the 2 sets differ
//G={g1,g2,gk-1, gk...gm}
// O={g1,g2,gk-1, ok...on}
// i know that the finish time of gk <= ok
// gk-1 can't conflict with gk similarly ok can't conflict with gk-1
// greedy solution chooses by the earliest finish time, so solution either improves or stays the same
// so it will increase cardinality, since no collisions, we can only keep the thinness or decrease it,
// so exchanging gk and ok only makes the solution better

// if we exhaust the solutions and get o''={g1...gm, om+1,...on}
// we know that gm can't conflict with om+1, if didn't conflict then greedy would have found them,
// as it always chooses the earliest finishing time interval that don't conflict with last interval chosen







//2nd part gives all


//7) at least 1 pilot who doesn't