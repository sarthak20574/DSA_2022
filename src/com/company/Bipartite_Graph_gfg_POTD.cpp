//Bipartite Graph
//https://practice.geeksforgeeks.org/problems/bipartite-graph/1
//https://www.youtube.com/watch?v=GNajKLjgRaM
		bool isBipartite(int V, vector<int>adj[]){
	   vector<int> x(V, 0);

      // 2 colors = 1 and 2   & 0 = not visited

       for( int i=0; i<V; i++){

           //visit only if not already visited
           if( x[i]==0){
                x[i]= 1;
        if( dfs(V, adj, x,i)== false) return false;
           }
       }
       return true;
	}

    bool dfs( int V, vector <int>adj[], vector<int> & x, int i ){

        vector<int> neighbours= adj[i];

        for( auto c: neighbours){

           if( x[c]== x[i]){
                return false;
            }

            else if( x[c]== 0){
                x[c]= x[i]==1?2:1;
                 if(dfs( V, adj, x, c)== false){
                    return false;
                }
            }
        }
        return true;
    }