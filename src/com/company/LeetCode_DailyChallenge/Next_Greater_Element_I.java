package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Next_Greater_Element_I {
    //496. Next Greater Element I
    //https://leetcode.com/problems/next-greater-element-i/


    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> m = new HashMap<>();

        for( int i=0; i<nums1.length; i++){
            m.put( nums1[i], i);
        }


        int[] ans= new int[nums1.length];

        Arrays.fill(ans, -1);
        Stack<Integer> s=new Stack<>();
        s.add(nums2[0]);

        for( int i=1; i<nums2.length; i++){

            if( s.peek()<nums2[i]) {

                while( s.isEmpty()==false && s.peek()<nums2[i]){
                    int x= s.pop();
                    if( m.containsKey(x)){
                        ans[m.get(x)]=nums2[i];
                    }
                }
            }
            s.add(nums2[i]);
        }

        return ans;

    }
}
