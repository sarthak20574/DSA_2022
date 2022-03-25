package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;

public class Boats_to_Save_People {
    //https://leetcode.com/problems/boats-to-save-people/

    public int numRescueBoats(int[] people, int limit) {

        // take the heaviest and see if you can send the lightest with the lightest person
        //else just send the heaviest

        int ans=0;
        Arrays.sort( people);


        int i=0, j=people.length-1;
        while (i<=j){

            if( people[i]+people[j]<=limit){
                //people[i]=-1;
                //people[j]=-1;
                System.out.println("i="+i);
                System.out.println("j="+j);
                i++;
                j--;
            }
            else {
                //people[i]=-1;
                System.out.println("in else");
                System.out.println("i="+i);
                System.out.println("j="+j);
                j--;
            }
            ans++;
        }

        return ans;
    }
}
