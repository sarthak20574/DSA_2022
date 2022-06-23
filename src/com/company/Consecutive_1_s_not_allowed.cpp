	// #define ll long long

	//Consecutive 1's not allowed
	//https://practice.geeksforgeeks.org/problems/consecutive-1s-not-allowed1912/1/
	//https://www.youtube.com/watch?v=H7tshfFTSvw
	ll countStrings(int n) {

	    int m = 1000000007;
	    int zero_end=0, one_end=0;

	    if( n>=1){
	        zero_end=1;
	        one_end=1;
	    }

	    for( int i=1; i<n; i++){

	        int one_end_t= zero_end;
	        int zero_end_temp= (zero_end+one_end)%m;
	        one_end=one_end_t;
	        zero_end=zero_end_temp;
	    }

	    return (one_end+ zero_end)%m;
	}