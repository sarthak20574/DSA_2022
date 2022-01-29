package com.company;

import java.util.*;

public class Positive_Negative_Pair {

    //A naive approach is to run two loops i.e. Consider each element of the array using the outer
    // loop and search for its corresponding positive/negative value in the array using an
    // inner loop. Similarly, find all the pairs. Time Complexity of this approach will be O( n2).
    //A better approach is to use sorting i.e. first sort the array and then for each negative
    // element, do a binary search to find its counterpart (+ve number). If found, print that
    // pair. If the current element is positive then break that loop as after that there will
    // be all the positive numbers.

    //Time Complexity: O(nlogn)
    static void printPairs(int arr[], int n)
    {
        // Sort the array
        Arrays.sort(arr);

        // Traverse the array
        boolean pair_exists= false;
        for (int i = 0; i < n; i++)
        {
            // For every arr[i] < 0 element,
            // do a binary search for arr[i] > 0.
            if (arr[i] < 0)
            {

                // If found, print the pair.
                if (java.util.Arrays.binarySearch(arr, -arr[i])!=-1)
                {
                    System.out.println(arr[i] + ", " + -arr[i] );

                    pair_exists = true;
                }
            }

            else
                break;
        }

        if (pair_exists == false)
            System.out.println("No such pair exists");
    }

    //Start traversing the array.
    //Store all the psoitve values in an unordered_set.
    //Check for each negative element, if their corresponding positive element exists in the set or not.
    //If yes, print the pair
    //Also, maintain a flag to check if no such pair exists.
    //time O(n)

    static void print2Pairs(int arr[], int n)
    {
        Set<Integer> pairs = new HashSet<Integer>();
        boolean pair_exists = false;

        // Store all the positive elements
        // in the unordered_set
        for (int i = 0; i < n; i++)
            if (arr[i] > 0)
                pairs.add(arr[i]);

        // Start traversing the array
        for (int i = 0; i < n; i++)
        {

            // Check if the positive value of current
            // element exists in the set or not
            if (arr[i] < 0)
                if (pairs.contains(-arr[i]))
                {
                    // Print that pair
                    System.out.println(arr[i] + ", " + -arr[i]);

                    pair_exists = true;
                }
        }

        if (pair_exists == false)
            System.out.println("No such pair exists");
    }



    public static ArrayList<Integer> findPairs(int arr[], int n)
    {
        ArrayList<Integer> ans= new ArrayList<Integer>();
        HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();

        for (int i=0 ; i< n; i++){

            if( map.containsKey(Math.abs(arr[i]))){
                map.put(Math.abs((arr[i])),map.get(Math.abs(arr[i]))+1);
            }
            else {
                map.put(Math.abs(arr[i]), 1);
            }

            if( map.get(Math.abs(arr[i]))==2){
                ans.add(-Math.abs(arr[i]));
                ans.add(Math.abs(arr[i]));
            }
        }

        if(ans.size()==0){
            ans.add(0);
        }
        return ans;
    }
}
