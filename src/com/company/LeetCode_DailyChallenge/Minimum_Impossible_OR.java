package com.company.LeetCode_DailyChallenge;

import java.util.HashSet;
import java.util.Set;

public class Minimum_Impossible_OR {

    //2568. Minimum Impossible OR
    //https://leetcode.com/problems/minimum-impossible-or/description/
    // lee's post https://leetcode.com/problems/minimum-impossible-or/solutions/3201897/java-c-python-pow-of-2/

    public int minImpossibleOR(int[] nums) {

        Set<Integer> x= new HashSet<>();

        int ans=1;

        for( int i: nums){
            x.add(i);
        }

        while( x.contains(ans)){
            ans*=2;
        }

        return ans;

    }

}
