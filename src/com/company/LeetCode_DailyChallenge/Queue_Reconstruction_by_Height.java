package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Queue_Reconstruction_by_Height {

    //406. Queue Reconstruction by Height
    //https://www.youtube.com/watch?v=-izPCK8E8fI&ab_channel=TechAdorabyNivedita
    //https://leetcode.com/problems/queue-reconstruction-by-height/

    // another solution
    //https://www.youtube.com/watch?v=khddrw6Bfyw&ab_channel=TECHDOSE

    // we sort it in the descending order of the heights if the heights are equal then with respect to the k values
    // so now while traversing, all the elements to the left of an element of the given array will be greater or equal to the element
    // so for {5,3} you want 3 elements greater then 5 so just insert it in the 4th position
    //or 3rd index because since you have sorted the given array in descending array of heights
    // you know all the 3 elements before will be greater than 5


    public int[][] reconstructQueue(int[][] people) {

        List<int[]> ans= new LinkedList<>();

        Arrays.sort(people, (a,b)-> (a[0]==b[0]? a[1]-b[1]:b[0]-a[0]));

        //when you insert an element at index i in a linked list the element present at the i'th index gets shifted
        // to the i+1 th element

        for( int[] i: people){
            ans.add( i[1], i);
        }

        return ans.toArray(new int[people.length][]);
    }
}
