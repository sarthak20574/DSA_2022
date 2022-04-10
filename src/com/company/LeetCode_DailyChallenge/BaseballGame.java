package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;

public class BaseballGame {
    // can use stack too

    public int calPoints(String[] ops) {

        ArrayList<Integer> x= new ArrayList<>();
        int ans=0;
        int n= ops.length;

        for( String op: ops){

            if( op .equals("C")){
                ans-=x.get(x.size()-1);
                x.remove(x.size()-1);
            }
            else if( op.equals("D")){
                ans+=2*x.get(x.size()-1);
                x.add(2*x.get(x.size()-1));
            }
            else if(op.equals("+")){
                ans+=x.get(x.size()-1)+x.get(x.size()-2);
                x.add(x.get(x.size()-1)+x.get(x.size()-2));
            }
            else {
                x.add(Integer.parseInt(op));
                ans+=x.get(x.size()-1);
            }
        }
        return ans;
    }
}
