package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class MaximuArea_of_a_Piece_of_Cake_After_Horizontal_and_Vertical_Cuts {

    //1465. Maximum Area of a Piece of Cake After Horizontal and Vertical Cuts
    //https://leetcode.com/problems/maximum-area-of-a-piece-of-cake-after-horizontal-and-vertical-cuts/

    // greedy as the name sounds so find the max gap lengthwise adn breadth wise
    // and multiply them to get the area
    // eg i for 1 2 4 and 1 5 9  for h=5 qand w= 10,
    //we have 0-1 =1; 1-2=1; 2-4=2; 4-5= 1 and 0-1= 1; 1-5=4; 5-9=4; 9-10=1
    //the max lengtwise is 2 and breadthwise is 4 therefore area = 2x4 =8

    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {

        Arrays.sort( horizontalCuts);
        Arrays.sort( verticalCuts);

        // first length/breath will be b/w 0 and the first cut
        int maxX= horizontalCuts[0];
        int maxY= verticalCuts[0];

        for( int i=1; i<horizontalCuts.length; i++){
            maxX= Math.max( horizontalCuts[i]-horizontalCuts[i-1], maxX);
        }

        for( int i=1; i<verticalCuts.length; i++){

            maxY= Math.max( verticalCuts[i]- verticalCuts[i-1], maxY);
        }

        // last length/breath will be b/w last cut and the boundary

        maxX= Math.max( maxX,h-horizontalCuts[horizontalCuts.length-1]);
        maxY= Math.max( maxY, w- verticalCuts[verticalCuts.length-1]);

        return (int)((long)maxX * maxY % 1000000007);

    }
}
