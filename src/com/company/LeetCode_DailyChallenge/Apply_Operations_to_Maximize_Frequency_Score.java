package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Apply_Operations_to_Maximize_Frequency_Score {

    //2968. Apply Operations to Maximize Frequency Score
    //https://leetcode.com/problems/apply-operations-to-maximize-frequency-score/description/
    //https://www.youtube.com/watch?v=gYoaR_LNBno&t=5349s&ab_channel=AryanMittal
    // must see https://leetcode.com/problems/apply-operations-to-maximize-frequency-score/solutions/4415578/beats-100-explained-prefix-sum-binary-search-c-java-python-js/

    public int maxFrequencyScore(int[] nums, long k) {

        Arrays.sort(nums);

        int n=nums.length, l=1, h=n, ans=1;

        long[] p= new long[n];

        p[0]= nums[0];

        for( int i=1; i<n; i++){
            p[i]=p[i-1]+nums[i];
        }


        while(l<=h){
            int mid= l+(h-l)/2;

            if( fn(nums,mid, p,k)){
                ans=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }

        return ans;
    }

    boolean fn(int[] nums, int len, long[] p, long k){

        int n= nums.length;

        for(int i=0; i<n; i++){

            int l=i, h=i+len-1;
            int mid=(h+l)/2;

            if( h>=n) return false;

            long c_l= 1L*p[h]- 1L*p[mid]- 1L*(h-mid)*nums[mid];

            long x=l-1>=0?p[l-1]:0;
            long c_r= -1L*p[mid]+ 1L*x+ 1L*(mid-l+1)*nums[mid];

            if( c_l+ c_r<=k) return true;
        }

        return false;
    }
}
