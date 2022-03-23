package com.company.LeetCode_DailyChallenge;

public class Broken_Calculator {

    //https://leetcode.com/problems/broken-calculator/submissions/

    public int brokenCalc(int startValue, int target) {
        int ans=0;

        while(startValue<target){

            if( target%2!=0){
                target++;
            }
            else {
                target/=2;
            }
            ans++;
        }


        // can directly write if(startValue!=target){
        // ans+=startValue=target
        // OR
        while (startValue!=target){
            startValue--;
            ans++;
        }
        return ans;
    }

    // recusrsive

    public int brokenCalc1(int startValue, int target) {

        if( startValue>=target){// DF =
            return startValue-target;
        }
        else if(target%2==0){
            return 1+brokenCalc1(startValue,target/2);
        }
        else {
            // now target is odd
            return 1+ brokenCalc1(startValue, target+1);
        }
    }
}
