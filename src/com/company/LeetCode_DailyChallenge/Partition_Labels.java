package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Partition_Labels {

    //763. Partition Labels
    //https://leetcode.com/problems/partition-labels/description/

    public List<Integer> partitionLabels(String s) {

        int[] last_i= new int[26];

        Arrays.fill(last_i, -1);

        int n= s.length();
        for( int i=0; i<n; i++){
            last_i[s.charAt(i)-'a']=i;
        }

        //System.out.println(Arrays.toString(last_i));

        List<Integer> ans= new ArrayList<>();

        int str=0, max_i=0;

        for( int i=0; i<n; i++){

            max_i=Math.max(max_i, last_i[s.charAt(i)-'a']);
            if( max_i==i){
                ans.add(i-str+1);
                str=i+1;
            }
        }

        return ans;
    }
}
