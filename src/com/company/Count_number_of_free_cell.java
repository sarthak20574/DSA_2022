package com.company;

public class Count_number_of_free_cell {

    //Count number of free cell
    //https://practice.geeksforgeeks.org/problems/90a81c305b1fe939b9230a67824749ceaa493eab/1

    long[] countZero(int n, int k, int[][] arr){


        // 9
        // 9- 3*2+1
        //3+1

        // 4- 3 +1
        // 2

        //2 - 3 +2
        //1

        boolean[] rows= new boolean[n+1];
        boolean[] cols= new boolean[n+1];

        int r=0, c=0, l=0;
        long cur= n*n;
        long[] ans= new long[k];

        for( int i[]: arr ){

            int r1= i[0], c1=i[1];

            if(rows[r1]==false){
                rows[r1]=true;
                r++;
                cur= cur - n + c;
            }
            if(cols[c1]==false){
                cols[c1]=true;
                c++;
                cur= cur -n + r;
            }

            ans[l++]= cur;

        }
        return ans;
    }
}
