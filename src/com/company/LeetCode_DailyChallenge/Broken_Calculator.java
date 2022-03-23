package com.company.LeetCode_DailyChallenge;

public class Broken_Calculator {

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
}
