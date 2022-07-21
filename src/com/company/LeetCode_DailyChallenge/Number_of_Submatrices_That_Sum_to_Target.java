package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Number_of_Submatrices_That_Sum_to_Target {


    //1074. Number of Submatrices That Sum to Target
    //https://leetcode.com/problems/number-of-submatrices-that-sum-to-target/
    //https://www.youtube.com/watch?v=vAOXSaoUlMg&ab_channel=TechAdorabyNivedita


    public int numSubmatrixSumTarget(int[][] matrix, int target) {

        int r= matrix.length;
        int c= matrix[0].length;
        int ans=0;

        //traversing each and every possible row sibmatrix row wise
        for( int i=0; i< r; i++){
            int[] arr= new int[c];

            for( int j=i; j<r;j++){

                //now calculating columnwise
                for( int k=0; k<c; k++){
                    arr[k]+=matrix[j][k];
                }
                ans+=subarraySum(arr, target);

            }
        }
        return ans;

    }


    //from sumarray sum equals k problem
    int subarraySum( int[] arr, int k){

        int n= arr.length;

        Map<Integer, Integer> m= new HashMap<>();

        int pre=0, ans=0;

        m.put(0,1);
        for( int i=0; i<n; i++){

            pre+=arr[i];
            ans+=m.getOrDefault(pre-k,0);

            m.put(pre,m.getOrDefault(pre,0)+1);
        }

        return ans;
    }

}
