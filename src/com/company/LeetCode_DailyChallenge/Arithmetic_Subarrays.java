package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Arithmetic_Subarrays {

    //1630. Arithmetic Subarrays
    //https://leetcode.com/problems/arithmetic-subarrays/description/?envType=daily-question&envId=2023-11-23

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {


        int len= l.length;

        List<Boolean> ans= new ArrayList<>();

        for( int i=0; i<len; i++){

            Map<Integer,Integer> m= new HashMap<>();

            int minn= Integer.MAX_VALUE, maxx=Integer.MIN_VALUE;
            for( int j=l[i]; j<=r[i]; j++){
                m.put(nums[j],m.getOrDefault(nums[j], 0)+1);
                maxx= Math.max( maxx, nums[j]);
                minn= Math.min( minn, nums[j]);
            }

            int n= r[i]-l[i]+1;
            int d=(maxx-minn)/(n-1);

            boolean cur= true;
            for( int jj=0; jj<n;jj++){
                if(m.containsKey(minn+d*jj)==false){
                    cur= false;
                    break;
                }
                m.put(minn+d*jj,m.get(minn+d*jj)-1);

                if( m.get(minn+d*jj)==0)
                    m.remove(minn+d*jj);
            }
            if( m.isEmpty()==false) cur=false;

            ans.add(cur);
        }
        return ans;
    }
}
