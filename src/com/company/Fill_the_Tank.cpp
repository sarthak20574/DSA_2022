//Fill the Tank
//https://practice.geeksforgeeks.org/problems/fill-the-tank3026/1
//https://www.youtube.com/watch?v=SLHzS_ZKWPY

long long dfs(vector<int> x[], int n, int cur, int parent,int *cap){

    long long w= 0;
    long long children=0;

    for( auto i: x[cur]){

        if( i!= parent){
             long long c= dfs(x, n, i,cur, cap );
             if( c==-1) return -1;
             w= max( w, c);
        children++;
        }
    }

    if( children * w + cap[cur-1]> 1e18) return -1;

    return children * w + cap[cur-1];
}


    long long minimum_amount(vector<vector<int>> &Edges, int n, int s, int *cap){

       vector<int> v[n+1];// 1 based indexing?

       for( auto x: Edges){
           v[x[0]].push_back(x[1]);
           v[x[1]].push_back(x[0]);
       }

       return dfs(v, n, s, -1,cap);

    }