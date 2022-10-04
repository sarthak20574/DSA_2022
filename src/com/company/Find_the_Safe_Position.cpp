
  //Find the Safe Position
   //https://practice.geeksforgeeks.org/problems/game-of-death-in-a-circle1840/1

 int safePos(int n, int k) {
        
        return fn( n,k)+1;
    }
    
    int fn( int n, int k){
        if( n==1)return 0;
        
        //int prev_ans=fn(n-1, k); 
        
        return (fn(n-1, k)+k)%n;
    }