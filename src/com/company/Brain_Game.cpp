//Brain Game
	//https://practice.geeksforgeeks.org/problems/brain-game1742/1#
	//https://www.youtube.com/watch?v=fpLiLMge2ks&ab_channel=Let%27sPracticeTogether


	bool isPrime( int x){

	    for( int i=2; i<=sqrt(x);i++){

	        if( x%i==0) return false;
	    }

	    return true;
	}

	int prime_factors(int x){
	    int n= x;
	    int ans=0;

	    for( int i=2; i<= x/2; i++){
	        while( n%i==0){
	            ans++;
	            n/=i;
	        }
	    }

	    return ans;

	}


    bool brainGame(vector<int>nums) {
        int moves=0;

        for( auto i: nums){

            if( isPrime(i)==false){
                moves= moves^(prime_factors( i)-1);
                // cout<<prime_factors( i)<<" ";
                // cout<<moves<<endl;
            }

        }

        if( moves==0) return false;
        return true;
    }