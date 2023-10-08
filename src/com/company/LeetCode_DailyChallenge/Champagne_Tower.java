package com.company.LeetCode_DailyChallenge;

public class Champagne_Tower {

    //799. Champagne Tower
    //799. Champagne Tower
    //https://leetcode.com/problems/champagne-tower/description/
    // see neetcode io's vid

    public double champagneTower(int p, int r, int c) {

        double[] prev= new double[r+1], cur= new double[r+1];;

        prev[0]=p;

        // 50
        // 49/
        //

        for( int i=1; i<=r; i++){

            for( int j=0; j<=i; j++){
                //if( prev[i]<1) return 0;

                if( prev[j]>1)
                    cur[j]+=Math.max((prev[j]-1)/2, 0);

                if( j-1>=0){
                    //if( prev[j-1]==0) return 0;
                    cur[j]+=Math.max((prev[j-1]-1)/2, 0);
                }


            }

            // System.out.println(Arrays.toString(prev));
            //  System.out.println(Arrays.toString(cur));

            prev=cur;
            cur= new double[r+1];


        }

        // for( int i=0; i<=r; i++){

        //     cur+=1;

        //     if( p-cur>=0){
        //         p-=cur;
        //     }
        //     else return 0;

        //     System.out.println(i+" " +cur+" " +p);
        // }

        // // 0.5x + x+ x+ 0.5= 3 x


        //  System.out.println(" "+cur+" " +p);

        //  System.out.println(r+" " +p);

        //  // 4   6
        //  // 4  7


        // double x=(double)p/(double)r;

        // if( r==1 || r==0) return Math.min(1.0,p/(double)(r+1));

        // if( c==0 || c==r){
        //     return Math.min(1.0,x/2.0);
        // }
        // else return Math.min(1.0,x);

        return Math.min(1,prev[c]);
    }
}
