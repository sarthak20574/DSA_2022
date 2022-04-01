package com.company;

public class Nodes_at_even_distance {
   /*
   //Nodes at even distance
   //https://practice.geeksforgeeks.org/problems/nodes-at-even-distance0532/1#
   //https://www.youtube.com/watch?v=uKdw47eas_U&ab_channel=CodewithAlisha
   // in c++

    int countOfNodes(vector<int> graph[], int n)
    {
        vector<int> dist(n+1,0);
        vector<bool> visited(n+1,false);
        queue<int> x;
        x.push(1);
        dist[1]=0;
        visited[1]=true;

        while (!x.empty())
        {

            int node=x.front();
            int distance=dist[node];
            x.pop();

            for( int neighbour: graph[node]){
                if( !visited[neighbour]){
                     x.push(neighbour);
                     dist[neighbour]=distance+1;
                     visited[neighbour]=true;
                }

            }
        }

            // counting all nodes at even distances from the root
            int even_count=0,  odd_count=0;
            for( int i=1; i< n+1; i++){

                if( dist[i]%2==0) even_count++;
                else odd_count++;
            }

            return even_count*(even_count-1)/2 + odd_count * ( odd_count-1)/2;

        }
    */
}
