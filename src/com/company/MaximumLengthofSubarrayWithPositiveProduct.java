package com.company;

public class MaximumLengthofSubarrayWithPositiveProduct {


/*

Intuition
At every iteration, tracking maximum length of positive multiplicative result and negative multiplicative result can help.
Multiplicative Result : result(+ve/-ve) of multiplication of bunch of numbers(some of which can be +ve/-ve)

Algorithm

If we see a 0, we gotta start off things again
If we see a positive number :
2.1. Increase length of positive mutilpicative result till now.
2.2. Increase length of negative mutilpicative result till now, unless we had not encountered any negative before.
If we see a negative number:
3.1. It's time to swap positive and negative multiplicative results' lengths and do similar task as we did in above case.
In each iteration, use the length of positive mutilpicative result to compute answer.
*/

    /*
    int getMaxLen(vector<int>& nums) {

        int ans=0;

        int maxx=0,minn=0;

        int n= nums.size();

        for( int i=0; i< n; i++){

            if( nums[i]==0) {
                maxx=0; minn=0;
            }
            else if( nums[i]>0){
                maxx++;
                if( minn!=0)minn++;
            }
            else{

                int temp=minn;
                //  -1 -2 0 -3 min=1
                // max=0
                minn=maxx+1;
                if( temp!=0) maxx=temp+1;
                else maxx=0;

            }

            ans= max(ans, maxx);
        }
        return ans;
    }
};
 */

}
