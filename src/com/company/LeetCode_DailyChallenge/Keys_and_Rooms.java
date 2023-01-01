package com.company.LeetCode_DailyChallenge;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Keys_and_Rooms {

    //841. Keys and Rooms
    //https://leetcode.com/problems/keys-and-rooms/
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {


        int n= rooms.size();
        boolean[] visited= new boolean[n];


        Queue<Integer> q= new LinkedList<>();

        q.add(0);

        while( q.isEmpty()==false){

            int x= q.poll();
            visited[x]=true;

            for( int k: rooms.get(x)){
                if( visited[k]==false){
                    q.add(k);
                }
            }
        }

        for( int i=0; i< n; i++){
            if( visited[i]==false) return false;
        }

        return true;
    }
}
