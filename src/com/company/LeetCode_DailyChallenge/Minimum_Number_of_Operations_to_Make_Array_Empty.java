package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Number_of_Operations_to_Make_Array_Empty {

    //2870. Minimum Number of Operations to Make Array Empty
    //https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/description/

    public int minOperations(int[] nums) {

        Map<Integer, Integer> m= new HashMap<>();

        for( int i: nums)
            m.put(i, m.getOrDefault(i, 0)+1);

        // rem= 0 1 2

        int ans=0;


        for( int i: m.keySet()){
            if(m.get(i)==1) return -1;

            int rem= m.get(i)%3;
            //4/3 1-1 +2

            //System.out.println( m.get(i)+" "+ rem);

            if( rem==1) ans+=m.get(i)/3-1 +2 ; // 7/3 -1 + 2 = 2-1 +2= 3  (4+3);
            else if( rem==2) ans+=m.get(i)/3+1; //5= 1+ 1=2 (3+2) ;
            else ans+=m.get(i)/3;
        }
        return ans;
    }
}
