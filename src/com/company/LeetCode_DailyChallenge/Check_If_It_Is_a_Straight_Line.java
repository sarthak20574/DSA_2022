package com.company.LeetCode_DailyChallenge;

public class Check_If_It_Is_a_Straight_Line {

    //1232. Check If It Is a Straight Line
    //https://leetcode.com/problems/check-if-it-is-a-straight-line/description/
    public boolean checkStraightLine(int[][] c) {

        if( c.length<=2) return true;

        //y2-y1 = m ( x2-x1)
        // y_ * x_1=x_ * y_1

        long x_=c[0][0]-c[1][0], y_= c[0][1]-c[1][1];


        int n= c.length;
        for( int i=2; i<n; i++){
            long x_1=c[i][0]-c[1][0], y_1= c[i][1]-c[1][1];

            if( y_ * x_1!=x_ * y_1) return false;
        }

        return true;
    }
}
