 //1423. Maximum Points You Can Obtain from Cards
    //https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
    //https://www.youtube.com/watch?v=GIO9YRFmMXA

   int maxScore(vector<int>& cardPoints, int k) {

        // the problem is to find the min subarray of size n-k



        int sum_present= 0, min_sum=INT_MAX;
        int  n= cardPoints.size();

        for( int i=0; i<n-k; i++){
            sum_present+=cardPoints[i];
        }
         min_sum= sum_present;

        int j=n-k;
        while(j<n){

            sum_present= sum_present+cardPoints[j]-cardPoints[j-(n-k)];
            min_sum= min( min_sum, sum_present);
            j++;

        }


        // find the total sum
        int ans=0;
        for(int i=0; i<n; i++){
            ans+=cardPoints[i];
        }

       // max points= total sum - min sum of the sub array
        return ans- min_sum;
    }