 //Change Bits
  //https://practice.geeksforgeeks.org/problems/change-bits1538/1#

    vector<int> changeBits(int N) {
        int x=1;

        while( x-1<N){
            x=2*x;
        }

        vector<int> ans(2);
        ans[1]=x-1;
        ans[0]=ans[1]-N;

        return ans;
    }