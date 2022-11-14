package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Satisfy_the_equation {

    //Satisfy the equation
    //https://practice.geeksforgeeks.org/problems/satisfy-the-equation5847/1
    //https://www.youtube.com/watch?v=f4_iFYEDEpA&ab_channel=SagarMalhotra

    static int[] satisfyEqn(int[] arr, int n) {
        int[] ans= new int[4];

        Map<Integer, int[]> m= new HashMap<>();

        Arrays.fill(ans, Integer.MAX_VALUE);

        for( int i=0; i<n; i++){

            for( int j=i+1; j<n; j++){

                int sum= arr[i]+ arr[j];

                if( m.containsKey(sum)==false){
                    m.put( sum, new int[]{i,j});
                }
                else{

                    int[] x= m.get(sum);

                    // its unique


                    if( x[0]!=i && x[1]!=j && x[0]!=j && x[1]!=i ){
                        int[] cur= new int[4];
                        cur[2]= i;
                        cur[3]= j;
                        cur[0]= x[0];
                        cur[1]= x[1];



                        if( ans[0]==Integer.MAX_VALUE){
                            for( int k=0; k<4; k++){
                                ans[k]=cur[k];
                            }
                        }
                        else{
                            boolean replace=false;
                            for( int k=0; k<4; k++){
                                if(ans[k]<cur[k]){
                                    break;
                                }
                                else if(ans[k]>cur[k]){
                                    replace=true;
                                    break;
                                }

                            }
                            if( replace==true){
                                for( int k=0; k<4; k++){
                                    ans[k]=cur[k];
                                }
                            }


                        }
                    }

                }
            }
        }
        if( ans[0]==Integer.MAX_VALUE){
            Arrays.fill(ans,-1);
        }

        return ans;
    }
}
