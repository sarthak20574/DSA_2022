package com.company.LeetCode_DailyChallenge;

import java.util.LinkedList;
import java.util.Queue;

public class Snakes_and_Ladders {

    //909. Snakes and Ladders
    //https://leetcode.com/problems/snakes-and-ladders/description/

    public int snakesAndLadders(int[][] board) {


        int n= board.length, ans=0;
        int[] maze= new int[n*n+1];
        boolean[] visited= new boolean[n*n];


        int i=n-1, c=0, curr=1;

        while( i>=0){

            if(c==0){

                for( int ii=0; ii<n; ii++){
                    maze[curr++]=board[i][ii];
                }
            }
            else{
                for( int ii=n-1; ii>=0; ii--){
                    maze[curr++]=board[i][ii];
                }
            }

            c++;
            c%=2;
            i--;
        }

        // System.out.println(Arrays.toString(maze));


        //if( n==1) return 0;


        Queue<Integer> q= new LinkedList();

        q.add(1);

        visited[1]=true;

        while( q.isEmpty()==false){

            ans++;

            int len= q.size();

            for( int k=0; k<len;k++){

                int cur= q.poll();

                for( int ll=1; ll<=6; ll++){

                    int next= cur+ll;

                    if( next> n*n) continue;

                    if( maze[next]!=-1){
                        next=maze[next];
                    }
                    if( next== n*n) return ans;

                    if( visited[next]==false){

                        visited[next]=true;
                        q.add(next);
                    }


                }

            }
        }



        /*
        . If the destination to a snake or ladder is the start of another snake or ladder, you do not follow the subsequent snake or ladder.
        */

        return -1;

    }
}
