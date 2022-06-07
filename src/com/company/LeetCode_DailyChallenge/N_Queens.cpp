#include <bits/stdc++.h>

using namespace std;
//55. N-Queens
//https://leetcode.com/problems/n-queens/
//https://www.youtube.com/watch?v=wGbuCyNpxIg
//https://www.youtube.com/watch?v=xFv_Hl4B83A


vector<vector<string>> ans;


bool isValid(int n ,int row, int col, vector<string> &s){
    //horizontal & vertical
    for( int i=row; i>=0; i--){
        if(s[i][col]=='Q') return false;
    }

    //diagnol
    for(int i=row-1, j=col-1; i>=0 && j>=0 ; i--, j--){
        if( s[i][j]=='Q') return false;
    }

    for(int i=row-1, j=col+1; i>=0 && j<n; i--,j++){
        if( s[i][j]=='Q') return false;
    }
    return true;
}


 void backtrack(int n, int row, vector<string>& s){

        if (row == n)
        {
            ans.push_back(s);
            return;
        }


        for (int i = 0; i < n; i++)
        {
            cout<<i<<row<<" \n";
            if (isValid(n,row, i, s) == true)
            {
                s[row][i]='Q';
                backtrack(n, row+1, s);

                //back track
                s[row][i]='.';
            }
            else{
                s[row][i]='.';
            }

        }
    }


vector<vector<string>> solveNQueens(int n)
{
    if( n<=0) return {{}};
    vector<string> s(n, string(n, '.'));

        backtrack(n, 0, s);
        return ans;
}