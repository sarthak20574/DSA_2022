package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Count_Number_of_Bad_Pairs {


    //2364. Count Number of Bad Pairs
    //https://leetcode.com/problems/count-number-of-bad-pairs/
    //https://www.youtube.com/watch?v=ahFuc87-S1o&ab_channel=EasyCode

    // bad pairs= i < j and j - i != nums[j] - nums[i].

    /*

    instead of counting bad pairs we count the good pairs
    then, bad pairs= total pairs- good pairs

    for a good pair,
    j - i == nums[j] - nums[i]
    => j-nums[j]= i-nums[i];

    we store these in a hash map with values as the count of the keys i-nums[i]


    for an array [ 1,2,3,4] of length 4,
    1 can make 3 pairs with the elements {2,3,4}
    2 can make 2 pairs with the elements {3,4}
    3 can make 1 pairs with the elements {4}
    4 can make 0 pairs

    therfore sum = 3 + 2 + 1 + 0= sum of first n-1 elements, ie, n*(n-1)/2

    */

    public long countBadPairs(int[] nums) {

        long n=nums.length, good_pairs=0;

        Map<Integer, Integer> freq_map= new HashMap<>();

        for( int i=0; i<n; i++){

            good_pairs+=freq_map.getOrDefault(i-nums[i], 0);

            freq_map.put(i-nums[i], freq_map.getOrDefault(i-nums[i], 0)+1);
        }
        return n*(n-1)/2 - good_pairs;
    }
}
