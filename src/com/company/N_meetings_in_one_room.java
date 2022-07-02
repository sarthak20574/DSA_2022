package com.company;

import java.util.Arrays;

public class N_meetings_in_one_room {

    //N meetings in one room
    //https://www.youtube.com/watch?v=II6ziNnub1Q&ab_channel=takeUforward
    //https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1#
    static public class meet{
        int index;
        int start;
        int end;
        meet( int i, int s, int e){
            index= i;
            start= s;
            end=e;
        }
    }

    public static int maxMeetings(int start[], int end[], int n)

    {
        meet x[]= new meet[n];
        if( n==0) return 0;

        for( int i=0; i<n; i++){
            x[i]= new meet(i,start[i], end[i]);
        }
        Arrays.sort( x,(a, b)->a.end-b.end);


        int ans=1;
        int prev_e=x[0].end;
        for( int i=1; i< n; i++){

            if( prev_e<x[i].start){
                // System.out.println(" inn: "+x[i-1].end+" "+x[i].start);
                ans++;
                prev_e= x[i].end;
            }
        }

        return ans;
    }
}
