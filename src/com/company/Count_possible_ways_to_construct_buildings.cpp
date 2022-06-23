
	//Count possible ways to construct buildings
	//https://practice.geeksforgeeks.org/problems/count-possible-ways-to-construct-buildings5007/1#
	//https://www.youtube.com/watch?v=0nF-BMYy7tc

	int TotalWays(int N)
	{

	    int m = 1000000007;
	     long long one_end= 0;
	     long long zero_end=0;

	     if(N>=1){
	         one_end=1;
	         zero_end=1;
	     }

	     for( int i=1; i<N; i++){
	         long long t_zero=(zero_end+one_end)%m;
	         long long t_one= zero_end;

	         zero_end= t_zero;
	         one_end=t_one;
	     }
	     long long ans= (zero_end + one_end)%m;

	     return (ans * ans)%m;
	}