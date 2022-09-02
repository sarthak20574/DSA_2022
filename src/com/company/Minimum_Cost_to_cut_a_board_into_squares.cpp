
//Minimum Cost to cut a board into squares
//https://practice.geeksforgeeks.org/problems/minimum-cost-to-cut-a-board-into-squares/1
//https://www.youtube.com/watch?v=dFWjPjs2yGs&ab_channel=Let%27sPracticeTogether

    int minimumCostOfBreaking(vector<int> X, vector<int> Y, int M, int N){
        
        
        sort( X.rbegin(), X.rend());
        sort(Y.rbegin(), Y.rend());
        
        
        int ans=0, i=0, j=0,hor=1, ver=1 ;
        
        while( i<M-1 && j<N-1){
            
            if( X[i]>Y[j]){
                
                ans+= (hor)*X[i++];
                
                ver++;
            }
            else{
                ans+=ver* Y[j++];
                hor++;
            }
        }
        
         
            while(i<M-1){
                
                ans+= (hor)*X[i++];
                
                ver++;
            }
            
            while(j<N-1){
                 ans+=ver* Y[j++];
                hor++;
            }
            
            return ans;
        
        
    }