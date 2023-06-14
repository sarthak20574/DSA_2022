package com.company.LeetCode_DailyChallenge;

import java.util.*;

public class Time_Needed_to_Inform_All_Employees {

    //1376. Time Needed to Inform All Employees
    //https://leetcode.com/problems/time-needed-to-inform-all-employees/description/


    public int numOfMinutes(int n, int headID, int[] ma, int[] info) {

        //int[] ans= new int[n];//the no of bomb detenoted by bomb i
        int[] vis=new int[n];

        // Arrays.fill( ans,1);
        Arrays.fill( vis,-1);

        List<List<Integer>> g= new ArrayList<>();
        for( int i=0; i<n; i++){
            g.add( new ArrayList<>());
        }

        for( int i=0; i<n; i++){
            if( ma[i]!=-1)
                g.get(ma[i]).add(i);
        }

        int ans=0;
        System.out.println(g);

        Queue<int[]> q= new LinkedList<>();

        q.add(new int[]{headID, 0});

        while( q.isEmpty()==false){

            int len= q.size();

            for( int i=0; i<len; i++){

                int[] x= q.poll();
                //System.out.println( x+ " "g.get(x).size());


                for( int e: g.get(x[0])){

                    q.add(new int[]{e,x[1]+info[x[0]]});
                    ans= Math.max( ans,x[1]+info[x[0]] );
                    // System.out.println( src +" -> "+ dest+ " = $"+ cost);
                }

            }
        }


        return ans;
    }
}
