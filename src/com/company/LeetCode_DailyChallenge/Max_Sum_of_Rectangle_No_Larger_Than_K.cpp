
    //363. Max Sum of Rectangle No Larger Than K
    //https://www.youtube.com/watch?v=IDv9yvQN3Uc&ab_channel=AyushiSharma
    //https://leetcode.com/problems/max-sum-of-rectangle-no-larger-than-k/submissions/

    int maxSumSubmatrix(vector<vector<int>>& matrix, int k) {

        int r= matrix.size(), c= matrix[0].size(), ans=INT_MIN;

        for( int i=0; i<c; i++){
            vector<int> sums(r);

            for( int j=i; j<c; j++){

                for( int k=0; k<r; k++)
                    sums[k]+=matrix[k][j];

                set<int> pre={0};
                int cur=0;

                for( int x: sums){
                    cur+=x;

                    auto it= pre.lower_bound(cur-k);

                    // if answer found
                    if(it!=end(pre))
                        ans= max(ans, cur- *it);
                    pre.insert(cur);
                }
            }
        }
        return ans;

    }