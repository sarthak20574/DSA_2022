package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Minimum_Seconds_to_Equalize_a_Circular_Array {

    //2808. Minimum Seconds to Equalize a Circular Array
    //https://leetcode.com/problems/minimum-seconds-to-equalize-a-circular-array/description/
    //https://www.youtube.com/watch?v=RFaCL68Zt74&t=967s

    public int minimumSeconds(List<Integer> nums) {

        Map<Integer, List<Integer>> m= new HashMap<>();

        int n= nums.size();

        for( int i=0; i<n; i++){
            if( m.containsKey(nums.get(i))==false){
                m.put( nums.get(i), new ArrayList<>());
            }

            m.get(nums.get(i)).add(i);
        }

        for( int i: m.keySet()){
            int x=m.get(i).get(0);
            m.get(i).add(n+ x);
        }

        int ans=n;

        for( int i: m.keySet()){
            int cur=0;

            for( int j=1; j<m.get(i).size(); j++){
                cur= Math.max((m.get(i).get(j)-m.get(i).get(j-1))/2, cur );
            }

            ans= Math.min( ans, cur);
        }

        return ans;

    }
}
