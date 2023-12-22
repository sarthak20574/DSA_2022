package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Make_Lexicographically_Smallest_Array_by_Swapping_Elements {

    //2948. Make Lexicographically Smallest Array by Swapping Elements
    //https://leetcode.com/problems/make-lexicographically-smallest-array-by-swapping-elements/
    //https://www.youtube.com/watch?v=QB2lRj3IV7k&t=1620s

    public int[] lexicographicallySmallestArray(int[] nums, int lim) {

        int n= nums.length;
        int[][] k= new int[n][2];

        for( int i=0; i<n; i++)
            k[i]= new int[]{nums[i], i};

        Arrays.sort(k, (a, b)->a[0]-b[0]);

        List<List<int[]>> l= new ArrayList<>();

        List<int[]> ll= new ArrayList<>();
        ll.add( k[0]);

        for( int i=1; i<n; i++){
            if( k[i][0]-k[i-1][0]>lim){
                l.add(ll);
                ll= new ArrayList<>();
            }
            ll.add(k[i]);
        }
        l.add(ll);

        int[] ans= new int[n];

        for(List<int[]> i: l){

            int len=i.size();
            int[] in= new int[len];
            //    int[] val= new int[len];

            for( int ii=0; ii<len; ii++){
                in[ii]=i.get(ii)[1];
            }

            Arrays.sort( in);

            for( int ii=0; ii<len; ii++){
                ans[in[ii]]=i.get(ii)[0];
            }
        }

        return ans;


    }
}
