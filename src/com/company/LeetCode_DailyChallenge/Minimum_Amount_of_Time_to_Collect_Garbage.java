package com.company.LeetCode_DailyChallenge;

public class Minimum_Amount_of_Time_to_Collect_Garbage {

    //2391. Minimum Amount of Time to Collect Garbage
    //https://leetcode.com/problems/minimum-amount-of-time-to-collect-garbage/description/

    /*
    P, G, M represent the time required to collect P, G, M respectively,
prev_p, prev_G, prev_M represents the position of the truck P, G ,M.

calculate the presum that signifies the time to reach the house i from 0

we traverse through the whole garbage string array
on finding M type, we make the M truck reach our present postion(ie, add the time it takes to rech the present postion, ie add pre[i]-pre[prev_M] ), then we add the time to pick garbage(ie, 1 minute or M++ )

we do the same for all other trucks
     */

    public int garbageCollection(String[] garbage, int[] travel) {

        int P=0, G=0, M=0, prev_P=0, prev_G=0, prev_M=0;

        int n= travel.length;

        int[] pre= new int[n+1];

        for( int i=1;i<n+1; i++){
            pre[i]=pre[i-1]+travel[i-1];
        }


        int cur_pos=0;

        for( int i=0; i<n+1; i++){

            for( char c: garbage[i].toCharArray()){
                if( c=='M'){
                    if( prev_M!=i){
                        M+=pre[i]-pre[prev_M];
                        prev_M=i;
                    }
                    M++;
                }
                else  if( c=='P'){
                    if( prev_P!=i){
                        P+=pre[i]-pre[prev_P];
                        prev_P=i;
                    }
                    P++;
                }
                else{
                    if( prev_G!=i){
                        G+=pre[i]-pre[prev_G];
                        prev_G=i;
                    }
                    G++;
                }
            }
        }

        return G+P+M;

    }
}
