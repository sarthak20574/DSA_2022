//Shortest Path between Cities
//https://practice.geeksforgeeks.org/problems/shortest-path-between-cities/1#

int shortestPath( int x, int y){
        int ans=0;
        while( true){

            if( x==y)break;
            if(x>y ){
                x=x/2;
            }
            else{
                y=y/2;
            }
            ans++;
        }
        return ans;

    }