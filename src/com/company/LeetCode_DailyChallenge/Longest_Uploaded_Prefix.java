package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Longest_Uploaded_Prefix {
    //2424. Longest Uploaded Prefix
//https://leetcode.com/problems/longest-uploaded-prefix/description/

    class LUPrefix {

        boolean[] arr;
        int cur, size;

        public LUPrefix(int n) {

            arr= new boolean[n+1];
            Arrays.fill( arr, false);
            cur=1;
            size=n;
        }

        public void upload(int video) {

            arr[video]= true;
            while( cur<size+1 && arr[cur]==true){
                cur++;
            }
        }

        public int longest() {

            return cur-1;
        }
    }
}
