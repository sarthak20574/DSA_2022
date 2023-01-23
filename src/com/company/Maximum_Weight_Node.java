package com.company;

public class Maximum_Weight_Node {

    //Maximum Weight Node
    //https://practice.geeksforgeeks.org/problems/b64485d3994958cca8748991bb58668204b3e4c0/1

    public int maxWeightCell(int n, int edge[]){


        int[] ans= new int[n];

        for( int i=0; i<n; i++){

            if( edge[i]!=-1)
                ans[edge[i]]+=i;
        }


        int ind=0, maxx=0;

        for( int i=0; i<n; i++){

            if( maxx< ans[i]){
                maxx= ans[i];
                ind=i;
            }
        }

        return ind;
    }

}
