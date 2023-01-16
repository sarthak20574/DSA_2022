package com.company.LeetCode_DailyChallenge;

import java.util.Collections;
import java.util.List;

public class Meeting_Rooms {
    //Meeting Rooms
    // not on leetcode

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

    public class Interval {
      int start, end;
      Interval(int start, int end) {
          this.start = start;
          this.end = end;
      }
  }


    public boolean canAttendMeetings(List<Interval> intervals) {

        Collections.sort(intervals, (x, y)-> x.start-y.start);

        int n= intervals.size();

        for( int i=1; i<n; i++){
            //System.out.println(i.start + " : "+ i.end);
            if( intervals.get(i-1).end> intervals.get(i).start) return false;
        }

        return true;
    }

}
