package com.company.LeetCode_DailyChallenge;

public class Rectangle_Area {

    //223. Rectangle Area
    //https://leetcode.com/problems/rectangle-area/description/

    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {


        // add the area of the 2 rectangles
        int ans= (ax2-ax1) * (ay2- ay1) + (bx2-bx1) * (by2- by1);

        // find the overlapping mid rectangle's rectangle if it exists
        int x2= Math.min( ax2, bx2);
        int x1= Math.max( ax1, bx1);
        int y2= Math.min( ay2, by2);
        int y1= Math.max( ay1, by1);

        //check if the rectangle overlaps if yes we remove the overlaping area
        if( x2>x1 && y2> y1){
            ans-= (y2-y1) * (x2-x1);
        }


        return ans;
    }

}
