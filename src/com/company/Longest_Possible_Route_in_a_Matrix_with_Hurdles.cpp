
//Longest Possible Route in a Matrix with Hurdles
//https://www.youtube.com/watch?v=PYNQ0wSGgMs
//https://practice.geeksforgeeks.org/problems/longest-possible-route-in-a-matrix-with-hurdles/1

    int longestPath(vector<vector<int>> matrix, int xs, int ys, int xd, int yd)
    {
        // if the end is 0 can't reach
        if( matrix[xd][yd]==0) return -1;
        int ans=-1;

        backtrack( matrix, xs, ys, xd, yd, 0, ans);

        return ans;
    }

    // ans is send by value
    void backtrack( vector<vector<int>>& matrix, int x,
    int y,int  xd, int yd, int cur_length, int &ans){

        if( x==xd &&  y== yd){
            ans = max(cur_length, ans);
            return;
        }
        else if( matrix[x][y]==1){

            // mark it as visited so that its neighbours can't visit it too  else  just up and down or infinite loop
            matrix[x][y]=2;

            vector<pair<int, int>> neighbours= {{0,1}, {1,0}, {-1, 0}, {0,-1}};

            for( int i=0; i< 4; i++){
                int x_new= x+neighbours[i].first;
                int y_new= y+ neighbours[i].second;

                if( x_new>=0 && y_new>= 0 && x_new<matrix.size() && y_new< matrix[i].size() && matrix[x_new][ y_new]==1){
                    backtrack( matrix, x_new, y_new,xd, yd, cur_length+1, ans);
                }
            }
            // but its non neighbours can visit it too and use it in their path
            matrix[x][y]=1;
        }
}