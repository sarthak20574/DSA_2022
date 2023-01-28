package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class Data_Stream_as_Disjoint_Intervals {

    //352. Data Stream as Disjoint Intervals
    //https://leetcode.com/problems/data-stream-as-disjoint-intervals/description/
    //https://www.youtube.com/watch?v=FavoZjPIWpo&ab_channel=NeetCodeIO

    class SummaryRanges {

        TreeMap<Integer, Integer> m;
        public SummaryRanges() {

            m= new TreeMap<>();
        }

        public void addNum(int value) {
            m.put(value, 0);
        }

        public int[][] getIntervals() {


            List<List<Integer>> ans= new ArrayList<>();

            int n=m.size();

            if( n==0) return new int[0][2];
            //if(n==0)

            int start=m.firstKey(), prev=m.firstKey();
            for( int i: m.keySet()){

                if( i-prev<=1){
                    prev= i;
                }
                else{
                    ans.add( Arrays.asList(start, prev));

                    start=i;
                    prev=i;
                }
            }
            ans.add( Arrays.asList(start, prev));


            n= ans.size();
            int[][] ret= new int[n][2];
            int cur=0;

            for( List<Integer> i: ans){

                ret[cur++]= new int[]{i.get(0), i.get(1)};
            }

            return ret;
        }
    }

}
