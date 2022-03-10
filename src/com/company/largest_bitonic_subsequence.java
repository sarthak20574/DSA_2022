package com.company;

public class largest_bitonic_subsequence {
    //in c++
    /*
    	int LongestBitonicSequence(vector<int>nums)
	{
	    int n= nums.size();

	   int left[n], right[n];

	   for( int i=0 ; i< n ; i++){
	       left[i]=1;
	       right[i]=1;
	   }


	   for( int i=0 ; i< n;i++){

	       for( int j=0;j<i; j++){
	           if(nums[j]<nums[i]){
	               left[i]= max(left[j]+1, left[i]);
	           }
	       }
	   }

	   for( int i=n-1 ; i>=0 ; i--){

	       for( int j = n-1 ; j> i; j--){
	           if( nums[i]>nums[j]){
	                right[i]= max( right[j]+1, right[i]);
	           }

	       }
	   }


	   int ans=1;

	   for( int i=0 ; i<n; i++){

	       ans=max(ans, right[i]+left[i]-1);
	   }

	   return ans;

	}
     */

}
