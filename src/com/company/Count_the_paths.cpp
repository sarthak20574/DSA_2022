//Count the paths
//https://practice.geeksforgeeks.org/problems/count-the-paths4332/1

int dfs(vector<int> graph[], int s, int d){

    // reached the destination
    if( s==d) return 1;

    int ans =0;

    // traverse throyught the various nodes connected to the sourse/ present node

    for( auto nextt: graph[s]){
        ans+= dfs( graph, nextt, d);
    }
    return ans;
}


	int possible_paths(vector<vector<int>>edges, int n, int s, int d){

	    vector<int> graph[n];

	    for( auto &x: edges){
	        graph[x[0]].push_back(x[1]);
	    }

	    return dfs( graph, s, d);
	}