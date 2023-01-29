 //Min operations
  //https://practice.geeksforgeeks.org/problems/5a7e1a52f1b7796238f9efea4c6fda389f26c327/1
  
    int solve(int a, int b) {
        
        // 1011 1001
        
        
        if( a==b) return 0;
        
        else if( (a&b) == min(a,b) ){
            return 1;
        }
        else return 2;
        
        
        
    }