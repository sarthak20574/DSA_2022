package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Fruit_Into_Baskets {

    //904. Fruit Into Baskets
    //https://leetcode.com/problems/fruit-into-baskets/description/
    public int totalFruit(int[] fruits) {

        int i=0,j=0, ans=0, n=fruits.length;
        Map<Integer, Integer> s= new HashMap<>();

        while(j<n){

            //  if(j<n){
            s.put(fruits[j], s.getOrDefault(fruits[j],0)+1);
            j++;

            // }


            while(s.size()>2){
                s.put( fruits[i],s.get(fruits[i])-1);

                if( s.get(fruits[i])==0){
                    s.remove(fruits[i]);
                }
                i++;
            }
            ans= Math.max(j-i,ans);

        }

        return ans;
    }

}
