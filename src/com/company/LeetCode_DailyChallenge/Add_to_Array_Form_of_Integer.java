package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Add_to_Array_Form_of_Integer {

    //989. Add to Array-Form of Integer
    //

    public List<Integer> addToArrayForm(int[] num, int k) {
        int carry=0, j=0, i=num.length-1;

        List<Integer> ans= new ArrayList<>();


        while( k>0 || i>=0){

            int sum= k%10 + carry;
            if( i>=0){
                //System.out.println(" num="+ num[i]);
                sum+=num[i--];
            }

            // System.out.println(sum+" k="+k + " carry= "+carry);
            k/=10;
            carry=sum/10;

            ans.add( 0, sum%10);
        }

        if(carry!=0) ans.add(0, carry);

        return ans;
    }

}
