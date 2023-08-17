package com.company.premium_problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Meeting_Rooms {
    //252. Meeting Rooms
    // https://leetcode.com/problems/meeting-rooms/description/
    // also available on u know where( its a premium problem)
    /*

    Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all meetings.


(0,8),(8,10) is not conflict at 8

Example1

Input: intervals = [(0,30),(5,10),(15,20)]
Output: false
Explanation:
(0,30), (5,10) and (0,30),(15,20) will conflict
Example2

Input: intervals = [(5,8),(9,15)]
Output: true
Explanation:
Two times will not conflict

    */



    public boolean canAttendMeetings(int[][] in) {

        Arrays.sort(in, (a, b)->a[0]-b[0]);

        int prev=0;

        for( int[] i: in){

            if( prev>i[0]) return false;

            prev= i[1];
        }

        return true;

    }
}
