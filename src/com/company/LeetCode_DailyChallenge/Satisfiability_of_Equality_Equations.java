package com.company.LeetCode_DailyChallenge;

public class Satisfiability_of_Equality_Equations {

    //990. Satisfiability of Equality Equations
    //https://leetcode.com/problems/satisfiability-of-equality-equations/description/
    //see Disjoint Set | Union By Rank and Path Compression vy striver https://www.youtube.com/watch?v=3gbO7FDYNFQ&ab_channel=takeUforward

    public boolean equationsPossible(String[] equations) {

        int[] parent=  new int[26];

        for( int i=0; i<26; i++){
            parent[i]=i;
        }

        for( var x: equations){

            if( x.charAt(1)=='='){

                int par_x= par( x.charAt(0)-'a', parent);
                int par_y= par( x.charAt(3)-'a', parent);

                parent[par_x]= par_y;
            }
        }

        for( var x: equations){

            if( x.charAt(1)=='!' &&
                    par(x.charAt(0)-'a', parent)==
                            par(x.charAt(3)-'a', parent)){

                return false;
            }
        }

        return true;

    }


    int par( int i, int[] parent){

        if( i != parent[i]){
            parent[i]= par( parent[i], parent);
        }
        return parent[i];
    }

}
