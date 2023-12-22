package com.company.LeetCode_DailyChallenge;

public class K_th_Symbol_in_Grammar {

    //779. K-th Symbol in Grammar
    //see neetcode's vid

    public int kthGrammar(int n, int k) {

        int cur=0;
        k--;

        double low=0, high=(int)Math.pow(2,n)-1, mid;
        //    0
        // 0    1
        //0  1  1 0

        // mid always even

        for( int i=0; i<n; i++){

            mid= low + (high-low)/2;
            // 1 2   3 4
            //4/2  if >2  then right


            // else if( mid==k) return cur==0?1:0;;

            if( k<mid){
                // gp to left
                // no change in cur's value
                high= (int)mid;
                // System.out.println(" goin to left "+mid );
                // System.out.println("low= "+low+", high="+high);
            }
            // System.out.println(cur);
            else{
                low= ((int) mid)+1;
                cur= cur==0?1:0;
                //  System.out.println(" goin to ryt "+mid );
                //   System.out.println("low= "+low+", high="+high);
            }
        }
        return cur;
    }
}
