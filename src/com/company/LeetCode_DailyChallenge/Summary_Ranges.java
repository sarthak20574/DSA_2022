package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Summary_Ranges {

    //228. Summary Ranges
    //https://leetcode.com/problems/summary-ranges/

    public List<String> summaryRanges(int[] nums) {

        int f=0, n= nums.length, i;

        List<String> ans= new ArrayList<>();

        if( n==0)return ans;

        for(  i=1; i<n; i++){
            if( (long)nums[i]-(long)nums[i-1]>1L){

                if( f==i-1)
                    ans.add(nums[i-1]+"");
                else ans.add( nums[f]+"->"+nums[i-1]);

                //  if( f==i-1)
                //     System.out.println(nums[i-1]+"");
                // else System.out.println( nums[f]+"->"+nums[i-1]);


                f=i;
            }
        }
        if( f==i-1)
            ans.add(nums[i-1]+"");
        else ans.add( nums[f]+"->"+nums[i-1]);

        return ans;

    }
}
