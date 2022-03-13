package com.company;

public class SpecialMatrix {

    //https://www.youtube.com/watch?v=qJxJq-DulsE

    // v famous problem

    // can go only down or right
    // if nor blocked then?
    // can only approach the target the rightmost bottom front he top or the left can't come diagonally
    //suppose there are 3 ways to approach from the top and 2 from the left, therefore 5 ways to reach the target
    // to reach any cell in the first row, we can do so in 1 way, so fill all the cells in 1st row and all the
    // cells in the 1st column as 1
    // then a cells ways = previous(left cell) ways+ upside ways

    // if block cells then  all cells after( ryt) to a block can't  be reached so

    // denote blocked cell as -1 and its 1 based indexing in the problem statement so subtract 1 from i and j

    public int FindWays(int n, int m, int[][] blocked_cells) {

        int[][] DP= new int[n][m];

        //setting the blocked cells

        for( int i=0 ; i<blocked_cells.length; i++){
            int x= blocked_cells[i][0]-1;
            int y= blocked_cells[i][1]-1;

            DP[x][y]=-1;
        }

        // initialize the first row

        for( int i=0 ; i<m; i++){
            if( DP[0][i]==-1) break;
            DP[0][i]=1;
        }

        for( int i=0; i< n; i++){
            if( DP[i][0]==-1) break;;
            DP[i][0]=1;
        }

        for( int i=1; i< n; i++){

            for (int j = 1; j < m; j++) {

                if( DP[i][j]==-1) continue;

                if( DP[i-1][j]!=-1) DP[i][j]+=DP[i-1][j]; //not else if( DP[i-1][j]==-1) DP[i][j]=DP[i][j-1];
                // what if both  i-1,j and i,j-1 both -1?

                if( DP[i][j-1]!=-1)DP[i][j]+=DP[i][j-1];
            }
        }

        // if DP[n-1][m-1]==-1 or its blocked so no ways ot reach the cell so return 0
        return DP[n-1][m-1]==-1?0:(DP[n-1][m-1]%1000000007);
    }

}
