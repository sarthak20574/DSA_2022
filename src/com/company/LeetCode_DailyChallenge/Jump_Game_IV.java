package com.company.LeetCode_DailyChallenge;

import java.util.*;

public class Jump_Game_IV {

    //1345. Jump Game IV
    //https://leetcode.com/problems/jump-game-iv/description/
    //https://leetcode.com/problems/jump-game-iv/solutions/1690813/best-explanation-ever-possible-for-this-question/


    public int minJumps(int[] arr) {

        Map<Integer, List<Integer>> g= new HashMap<>();

        int ans=0, n= arr.length;

        if (n==1) return 0;

        for( int i=0; i<n; i++){

            if( g.containsKey(arr[i])==false){
                g.put(arr[i], new ArrayList<>());
            }
            g.get( arr[i]).add(i);
        }

        //    for(  int i:g.keySet() ){
        //        System.out.println(i+" : "+g.get(i).toString());
        //    }


        Queue<Integer> q= new LinkedList<>();
        q.add(0);

        while(q.isEmpty()==false){

            ans++;

            int size= q.size();

            for( int j=0; j<size; j++){

                int cur= q.poll();

                if( cur-1>=0 && g.containsKey(arr[cur-1])){
                    q.add( cur-1);
                }

                if( cur+1==n-1) return ans;

                if( cur+1<n && g.containsKey(arr[cur+1])){
                    q.add(cur+1);
                }

                if( g.containsKey(arr[cur]))
                    for( int i: g.get( arr[cur])){

                        if( i==n-1) return ans;

                        if( g.containsKey(arr[i])){
                            q.add( i);
                        }
                    }
                g.remove(arr[cur]);
            }


        }

        return ans;

    }




}
