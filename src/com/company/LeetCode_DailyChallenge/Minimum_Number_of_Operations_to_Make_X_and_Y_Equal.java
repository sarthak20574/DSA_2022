package com.company.LeetCode_DailyChallenge;

public class Minimum_Number_of_Operations_to_Make_X_and_Y_Equal {

    //2998. Minimum Number of Operations to Make X and Y Equal
    //https://leetcode.com/problems/minimum-number-of-operations-to-make-x-and-y-equal/
    //https://www.youtube.com/watch?v=xUkhl5NVHm0&ab_channel=AryanMittal

    //https://leetcode.com/problems/minimum-number-of-operations-to-make-x-and-y-equal/solutions/4518333/c-java-simple-dp-very-easy-and-simple-to-understand/

    public int minimumOperationsToMakeEqual(int x, int y) {

        // x, y

        if (x <= y)
            return y - x;

        int ans=x-y;

        // 9 = 4+5   5-9%5(4)+9
        ans= Math.min( ans, 1+ x%5 +minimumOperationsToMakeEqual( x/5, y));
        ans= Math.min( ans, 1+ 5-x%5 +minimumOperationsToMakeEqual( x/5 +1, y));
        ans= Math.min( ans, 1+ x%11 +minimumOperationsToMakeEqual( x/11, y));
        ans= Math.min( ans, 1+ 11-x%11 +minimumOperationsToMakeEqual( x/11 +1, y));

        return ans;
    }
}
