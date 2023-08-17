package com.company.premium_problems;

import java.util.Arrays;

public class Meeting_Rooms_II {

    //253. Meeting Rooms II
    //https://leetcode.com/problems/meeting-rooms-ii/description/
    /*

    Given an array of meeting time intervals intervals where intervals[i] = [starti, endi], return the minimum number of conference rooms required.



Example 1:

Input: intervals = [[0,30],[5,10],[15,20]]
Output: 2
Example 2:

Input: intervals = [[7,10],[2,4]]
Output: 1


Constraints:

1 <= intervals.length <= 104
0 <= starti < endi <= 106
     */

    public int minMeetingRooms(int[][] intervals) {

        int n= intervals.length;
        int[][] arr= new int[2*n][];


        int cur=0;
        for( int[] i: intervals){
            arr[cur++]= new int[]{i[0], 1};
            arr[cur++]= new int[]{i[1], -1};
        }

        Arrays.sort( arr, (a, b)->a[0]==b[0]?a[1]-b[1]: a[0]-b[0]);


        int ans=1;
        cur=0;

        for( int[] i: arr){

            cur+=i[1];
            ans= Math.max( ans, cur);

        }
        Object obj = "hello";
        Integer num = (Integer) obj;

        return ans;
    }

}
