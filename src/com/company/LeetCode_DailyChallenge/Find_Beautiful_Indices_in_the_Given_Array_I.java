package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Find_Beautiful_Indices_in_the_Given_Array_I {

    //3006. Find Beautiful Indices in the Given Array I
    //https://leetcode.com/problems/find-beautiful-indices-in-the-given-array-i/

    public List<Integer> beautifulIndices(String s, String a, String b, int k) {

        int n= s.length();
        List<Integer> aa=new ArrayList<>();
        List<Integer> bb=new ArrayList<>();
        List<Integer> ans= new ArrayList<>();

        for( int i=0; i<n && i+a.length()<=n; i++){
            if(s.substring(i,i+a.length()).equals(a)){
                aa.add(i);
            }
        }

        for( int i=0; i<n && i+b.length()<=n; i++){
            if(s.substring(i,i+b.length()).equals(b)){
                bb.add(i);
            }
        }

        // a-b

        for( int ele: aa){
            int low=0,high=bb.size()-1, mid;
            while( low<=high){
                mid= low+(high-low)/2;

                if(k>=Math.abs(bb.get(mid)-ele)){
                    ans.add(ele);
                    break;
                }
                else if( ele>bb.get(mid)){
                    low= mid+1;
                }
                else{
                    high= mid-1;
                }
            }
        }
        return ans;
    }
}
