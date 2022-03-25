package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StableMatching {
    void main(){
        int prefer[][] = new int[][]{{7, 5, 6, 4},
                {5, 4, 6, 7},
                {4, 5, 6, 7},
                {4, 5, 6, 7},
                {0, 1, 2, 3},
                {0, 1, 2, 3},
                {0, 1, 2, 3},
                {0, 1, 2, 3}};
        stableMarriage(prefer);
    }

    private void stableMarriage(int[][] prefer) {

        //first give all men their first preference no equality😭

        int n= prefer.length/2;
        int[] women_sPartner=new int[n];

        boolean[] men_free= new boolean[n];

        Arrays.fill(women_sPartner,-1);
        int freeMen=n;
        //by default all boolean is already false
        Arrays.fill(men_free, true);

        while (freeMen>0){
            int i;
            for( i=0 ; i<n; i++){
                if( men_free[i]==true){
                    break;
                }
            }

            for (int j= 0; j <n ; j++) {

                // if empty female
                if(prefer[i][j]==){

                }

            }
        }

    }
}
