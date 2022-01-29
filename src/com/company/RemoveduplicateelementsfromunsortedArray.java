package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class RemoveduplicateelementsfromunsortedArray {

    //Take a Set
    //Insert all array element in the Set. Set does not allow duplicates and sets
    // like LinkedHashSet maintains the order of insertion so it will remove
    // duplicates and elements will be printed in the same order in which it is inserted.
    //Convert the formed set into array.
    //Print elements of Set.
    //https://www.geeksforgeeks.org/remove-duplicates-from-unsorted-array-using-set-data-structure/?ref=rp
    //time: O(n)
    public static void removeDuplicates(int[] arr)
    {
        LinkedHashSet<Integer> set
                = new LinkedHashSet<Integer>();

        // adding elements to LinkedHashSet
        for (int i = 0; i < arr.length; i++)
            set.add(arr[i]);

        // Print the elements of LinkedHashSet
        System.out.print(set);
    }

    //Take a hash map, which will store all the elements which have appeared before.
    //Traverse the array.
    //Check if the element is present in the hash map.
    //If yes, continue traversing the array.
    //Else Print the element.
    //https://www.geeksforgeeks.org/remove-duplicates-from-unsorted-array-using-map-data-structure/
    //Time Complexity – O(N)
    static void removeDups(int[] arr, int n)
    {
        // Hash map which will store the
        // elements which has appeared previously.
        HashMap<Integer,
                        Boolean> mp = new HashMap<>();

        for (int i = 0; i < n; ++i)
        {

            // Print the element if it is not
            // there in the hash map
            if (mp.get(arr[i]) == null)
                System.out.print(arr[i] + " ");

            // Insert the element in the hash map
            mp.put(arr[i], true);
        }
    }

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> output_arr= new ArrayList();

        for( int i=0 ; i<n ;i++){
            int index= Math.abs(arr[i])-1;
            if( arr[index]<0) output_arr.add(index+1);
            arr[index]= -arr[index];
        }
        if( output_arr.size()==0){
            output_arr.add(-1);
        }
        return output_arr;
    }






}
