package com.company.LeetCode_DailyChallenge;

public class The_Employee_That_Worked_on_the_Longest_Task {

    //2432. The Employee That Worked on the Longest Task
    //https://leetcode.com/problems/the-employee-that-worked-on-the-longest-task/

    public int hardestWorker(int n, int[][] logs) {

        int maxx_t=0;

        int ans[]= new int[n];
        int prev=0;
        for( int[] i: logs){
            int t= i[1]-prev;
            prev= i[1];
            ans[i[0]]=Math.max(t,ans[i[0]]);
            maxx_t= Math.max(ans[i[0]], maxx_t);
        }

        // System.out.println(Arrays.toString(ans));

        for (int i = 0; i < n; i++) {
            if( ans[i]==maxx_t)return i;
        }


        return -1;
    }
}
