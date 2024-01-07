package com.company.LeetCode_DailyChallenge;

import java.util.HashSet;
import java.util.Set;

public class Maximum_Size_of_a_Set_After_Removals {
    //10037. Maximum Size of a Set After Removals

    //https://leetcode.com/problems/maximum-size-of-a-set-after-removals/
    //https://leetcode.com/problems/maximum-size-of-a-set-after-removals/solutions/4520990/c-java-python-set-difference/

    public int maximumSetSize(int[] nums1, int[] nums2) {

        int n= nums1.length;

        Set<Integer> s1= new HashSet<>(),s2= new HashSet<>(), com=new HashSet<>();

        for( int i: nums1)
            s1.add(i);

        for( int i: nums2)
            s2.add(i);


        for( int i:s1)
            if( s2.contains(i))
                com.add(i);

        return
                Math.min(
                        Math.min(s1.size()-com.size(), n/2)+Math.min(s2.size()-com.size(), n/2)
                                + com.size()
                        ,n);
    }
}
