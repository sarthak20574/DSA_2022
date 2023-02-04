	//Max Sum without Adjacents
	//https://practice.geeksforgeeks.org/problems/7a33c749a79327b2889d420dd80342fff33aac6d/1
	int findMaxSum(int *arr, int n) {


	    if( n==1) return arr[0];

	    int prevv=arr[0], prev=max(arr[1], arr[0]);

	    for( int i=2; i<n; i++){

	        int neww= max(prevv+ arr[i], prev);

	       // cout<<prevv <<" "<<prev<<"\n";
	        prevv=prev;
	        prev=neww;
	    }
	    return prev;
	}