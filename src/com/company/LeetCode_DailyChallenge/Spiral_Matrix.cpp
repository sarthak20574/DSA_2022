//54. Spiral Matrix
    //https://leetcode.com/problems/spiral-matrix/submissions/

    vector<int> spiralOrder(vector<vector<int>>& matrix) {
       // 00 01 02....12 22 ...
            vector<int> ans;

            int i0=0, i1= matrix.size()-1, j1= matrix[0].size()-1,j0=0;
        while( i0<=i1 && j0<=j1){

            // upper row left to right
            if( i0<=i1)
                 for( int i=j0; i<= j1; i++){
                 ans.push_back(matrix[i0][i]);
            }
            i0++;


            // right top to bottom
           if( j0<=j1)
                 for( int i=i0; i<=i1; i++){
                 ans.push_back(matrix[i][j1]);
            }
            j1--;

            // bottom right to left
             if( i0<=i1)
                 for( int i=j1; i>=j0; i--){
                 ans.push_back(matrix[i1][i]);
            }
            i1--;

            // left bottom to top
            if( j0<=j1)
                 for( int i=i1; i>=i0; i--){
                 ans.push_back(matrix[i][j0]);
            }
            j0++;


        }
        return ans;
    }