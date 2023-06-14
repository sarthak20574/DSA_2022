package com.company.LeetCode_DailyChallenge;

public class Find_Smallest_Letter_Greater_Than_Target {

    //744. Find Smallest Letter Greater Than Target
    //https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
    public char nextGreatestLetter(char[] l, char t) {
        int n= l.length, ans=n, low=0, high=n-1;

        while( low<=high){
            int mid= low+(high-low)/2;

            if( l[mid]<=t){
                low= mid+1;
            }
            else{
                ans= mid;
                high= mid-1;
            }
        }

        return ans==n? l[0]: l[ans];
    }
}
