#include <bits/stc++.h>
using namespace std;

//https://practice.geeksforgeeks.org/problems/1a31d09f7b8e9c0633339df07858deb3a728fe19/1#
//https://www.youtube.com/watch?v=yqP5HVO6NSw

//brute
vector<int> farNumber(int N,vector<int> Arr){

        vector<int> ans(N, -1);
        for( int i=0; i< N; i++){

            for( int j=N-1;j>i;j--){

                if( Arr[j]<Arr[i]) {
                    ans[i]=j;
                    break;
            }
        }
    }
    return ans;
        }

// efficient

