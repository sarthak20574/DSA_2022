package com.company.non_leetcode_companyQuestion;

import java.util.HashSet;
import java.util.Set;

public class Line_Reflection {

    //356. Line Reflection
    //https://leetcode.com/problems/line-reflection/description/

    /*

    Given n points on a 2D plane, find if there is such a line parallel to the y-axis that reflects the given points symmetrically.

In other words, answer whether or not if there exists a line that after reflecting all points over the given line, the original points' set is the same as the reflected ones.

Note that there can be repeated points.

Example 1:
Input: points = [[1,1],[-1,1]]
Output: true
Explanation: We can choose the line x = 0.


Example 2:
Input: points = [[1,1],[-1,-1]]
Output: false
Explanation: We can't choose a line.
     */


    public boolean isReflected(int[][] points) {


        int minn=points[0][0], maxx=points[0][0];
        //Set<Integer> s= new HashSet<>();
        Set<String> s= new HashSet<>();

        for( int[] i: points){

            minn= Math.min(i[0], minn);
            maxx= Math.max( i[0], maxx);
            s.add(i[0]+" "+i[1]);
        }

        // line=> x= ( minn+ maxx)/2;

        int mid =  ( minn+ maxx);


        for( int[] i: points){

            // (x1 + x2)/2 = mid

            int x1=i[0];

            if( s.contains((mid-x1)+" "+i[1])==false){

                // System.out.println(x1+" "+( mid-x1));
                return false;

            }
        }


        return true;

    }
}
