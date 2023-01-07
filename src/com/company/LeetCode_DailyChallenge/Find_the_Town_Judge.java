package com.company.LeetCode_DailyChallenge;

public class Find_the_Town_Judge {

    //997. Find the Town Judge
    //https://leetcode.com/problems/find-the-town-judge/description/?envType=study-plan&id=graph-i

    public int findJudge(int n, int[][] trust) {

        // how many ppl trust i
        int[] trusted_by= new int[n+1];

        // how many i trusts
        int[] trusts= new int[n+1];

        for( int[] i: trust){
            trusted_by[i[1]]++;
            trusts[i[0]]++;
        }


        for( int i=1; i<=n; i++){

            if( trusted_by[i]==n-1 && trusts[i]==0) return i;
        }

        return -1;
    }
}
