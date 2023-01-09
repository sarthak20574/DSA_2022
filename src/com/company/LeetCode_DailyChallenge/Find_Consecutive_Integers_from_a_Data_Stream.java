package com.company.LeetCode_DailyChallenge;

import java.util.HashSet;
import java.util.Set;

public class Find_Consecutive_Integers_from_a_Data_Stream {

    class DataStream {


        //2526. Find Consecutive Integers from a Data Stream
        //https://leetcode.com/problems/find-consecutive-integers-from-a-data-stream/description/
        // so brilliant
        //https://leetcode.com/problems/find-consecutive-integers-from-a-data-stream/solutions/3015020/Is-it-really-a-medium-problem/

        Set<Integer> x;
        int size;
        int k;
        int value;

        public DataStream(int value, int k) {

            x= new HashSet<>();
            size=0;
            this.k=k;
            this.value= value;
        }

        public boolean consec(int num) {

            size++;
            if( num!=value) x.add(size);

            if( size>=k){
                if( x.contains(size-k)) x.remove(size-k);
            }
            else return false;



            return x.size()==0;

        }
    }

}
