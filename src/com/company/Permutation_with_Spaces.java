package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Permutation_with_Spaces {
    //Permutation with Spaces in gfg
    //https://www.youtube.com/watch?v=1cspuQ6qHW0
    //https://practice.geeksforgeeks.org/problems/permutation-with-spaces3627/1#
    static ArrayList<String> permutation(String S){

        // 2choices either include the letter with or without spaces
        // draw the recursive tree, like
        //A then AB or A B then

        // after taking make the input smaller

        ArrayList<String> ans= new ArrayList<>();

        String presentString= String.valueOf(S.charAt(0));
        S=S.substring(1);
        backTrack(ans,presentString, S);
        Collections.sort(ans);
        return ans;
    }

    private static void backTrack(ArrayList<String> ans, String presentStr, String S){
        if(S.length()==0 ){
            ans.add(presentStr);
            return;
        }


        //for( int j=0; j<n; j++ ){
        backTrack(ans, presentStr+S.charAt(0),S.substring(1) );


        //if( presentStr.length()!=n)
        backTrack(ans, presentStr+" "+S.charAt(0),S.substring(1) );

//            if( prev_space==false )
//            backTrack(ans, presentStr+" ",S,i, n, true);

    }

}
