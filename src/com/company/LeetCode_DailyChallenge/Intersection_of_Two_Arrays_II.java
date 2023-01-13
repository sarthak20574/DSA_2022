package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Intersection_of_Two_Arrays_II {
    //350. Intersection of Two Arrays II
    //https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
    public int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> ans= new ArrayList<>();

        Map<Integer, Long> m= new HashMap<>();

        for( int i: nums1){
            m.put( i, m.getOrDefault(i,0L)+1L);
        }

        for( int i: nums2){
            if( m.containsKey(i)){
                ans. add(i);
                m.put(i, m.get(i)-1L);
                if( m.get(i)==0)m.remove(i);
            }
        }

        int n=ans. size();

        int[] ret=new int[n];
        for( int i=0; i<n;i++){
            ret[i]= ans.get(i);
        }

        return ret;
    }
}
