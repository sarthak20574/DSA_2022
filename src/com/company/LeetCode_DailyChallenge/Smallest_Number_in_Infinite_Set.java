package com.company.LeetCode_DailyChallenge;

import java.util.TreeMap;

public class Smallest_Number_in_Infinite_Set {

    //2336. Smallest Number in Infinite Set

    //https://leetcode.com/problems/smallest-number-in-infinite-set/description/

    class SmallestInfiniteSet {

        int cur;
        TreeMap<Integer, Integer> q;

        public SmallestInfiniteSet() {
            cur=1;
            q= new TreeMap<>();
        }


        public int popSmallest() {

            if( q.isEmpty()==false){
                if( q.firstEntry().getKey()>cur){
                    return cur++;
                }
                else {
                    return q.pollFirstEntry().getKey();
                }
            }
            else return cur++;

        }

        public void addBack(int num) {
            if( cur>num)
                q.put(num,0 );
        }
    }
}
