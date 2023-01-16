package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Count_the_Number_of_Good_Subarrays {

    //2537. Count the Number of Good Subarrays
    //https://leetcode.com/problems/count-the-number-of-good-subarrays/description/

    public long countGood(int[] nums, int k) {

        int n= nums.length;
        long ans=0, sum=0;
        Map<Integer,Long> m= new HashMap<>();
        int i=0, j=0;
        while( j<n && i<=j){

            //System.out.println(i+" : "+j);

            if( sum<k){
                long x= m.getOrDefault(nums[j],0L);
                sum-=  (x * ( x-1))/2;

                m.put(nums[j], m.getOrDefault(nums[j],0L)+1L);
                //x= m.get(nums[j]);
                x++;
                sum+= (x * ( x-1))/2;

                //System.out.println(i+" : "+j+" in i, sum: "+sum);

                j++;
            }
            else {
                long x= m.get(nums[i]);
                sum-=  (x * ( x-1))/2;

                m.put(nums[i], m.get(nums[i])-1L);
                //x= m.get(nums[j]);
                x--;
                sum+= (x * ( x-1))/2;

                // System.out.println(i+" : "+j+" in i, sum: "+sum);

                i++;
            }
            //System.out.println(i+" : "+j+" sum: "+sum);

            if( sum>=k){
                ans+=n-j+1;
                //System.out.println(n-j+1);
            }

        }

        while (sum>=k){
            long x= m.get(nums[i]);
            sum-=  (x * ( x-1))/2;

            m.put(nums[i], m.get(nums[i])-1L);
            //x= m.get(nums[j]);
            x--;
            sum+= (x * ( x-1))/2;

            // System.out.println(i+" : "+j+" in i, sum: "+sum);

            i++;

            if( sum>=k){
                ans+=n-j+1;
                //System.out.println(n-j+1);
            }

        }
        return ans;
    }
}
