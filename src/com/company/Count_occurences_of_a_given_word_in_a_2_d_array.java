package com.company;

public class Count_occurences_of_a_given_word_in_a_2_d_array {

    //Count occurences of a given word in a 2-d array
    //https://practice.geeksforgeeks.org/problems/count-occurences-of-a-given-word-in-a-2-d-array/1
    //  nice video https://www.youtube.com/watch?v=ZYeVllg0D7E&ab_channel=CodeLibrary-byYogesh%26Shailesh

    // forgot to check target.charAt(0)== mat[i][j] for the first element
    //and that you can use the same g for 2 words, ie, skeegeeks...it counts as 2 words

    public int findOccurrence(char mat[][], String target)
    {
        int r= mat.length, c= mat[0].length,ans=0;

        boolean[][] visited= new boolean[r][c];

        // by default boolean variables are false in java

        for( int i=0; i<r; i++){

            for( int j=0; j<c; j++){


                if( target.charAt(0)== mat[i][j]){

                    //System.out.println("in");
                    visited[i][j]=true;

                    ans+=fn(mat, i, j,visited, r, c,target, 1) ;

                    visited[i][j]=false;
                }


            }
        }

        return ans;
    }


    int fn(char[][] arr, int i, int j, boolean[][] visited,
           int r, int c, String target, int cur_char){

        if( cur_char==target.length()) return 1;

        else if( i==r || j==c) return 0;

        else {

            int[][] d={{0,1}, {0,-1}, {1,0}, {-1,0}};

            int found=0;
            for( int k=0; k<4;k++){
                int x= i+ d[k][0];
                int y= j+ d[k][1];

                if( x>=0 && y>=0 && x<r && y<c
                        && arr[x][y]==target.charAt(cur_char) && visited[x][y]==false){

                    visited[x][y]=true;
                    found+=fn( arr, x,y, visited, r, c, target, cur_char+1 );
                    visited[x][y]=false;
                }
            }
            return found;
        }
    }
}
