
//354. Russian Doll Envelopes
//https://leetcode.com/problems/russian-doll-envelopes/
// O(n^2) soln in https://www.youtube.com/watch?v=97YbdxpZmn4

 int maxEnvelopes(vector<vector<int>>& e) {
        int n= e.size();
        vector<int> dp(n, 1);
        sort( e.begin(), e.end());
         for( int j=0; j<n; j++){
          cout<<e[j][0]<<" "<<e[j][1]<<endl;
         }

        for( int i=0; i< n ; i++){

            for( int j=0; j<i; j++){
                if( e[j][0]<e[i][0] && e[j][1]<e[i][1])
                    dp[i]= max( dp[i], 1+dp[j]) ;

            }
        }
        return *max_element(dp.begin(), dp.end());
    }


    //O(nlogn)
    // https://www.youtube.com/watch?v=S9oUiVYEq7E
    //



    for( int i=0; i<)
