package com.company;

public class HeightUsingParentArray {

    //https://www.youtube.com/watch?v=cvk_40InwAE

    // parent array gives you the parent at each index
    //0 has children 1 and 2, 1 has  3 and 4, 4 has 6 and, 7, 7 has 9 and 10, 9 has 11, 11 hs 12, 2 has 5, 5 has 8
    // so now parent arrasy=[-1, 0, 0, 1, 1, 2,4,4,5,7,7,9,11]
    // start from the end so parent of 12 is 11, so now go to parent of 11, ie, 9 now parent of 9 is 7 now parent of 7
    // is 4 and now parent of 4 is 1 , parent of 1 is 0 and parent of 0 is -1 , now stop
    // number of times you jumped is the height

    int findHeight(int N, int arr[]){
        int i=N-1;
        return f(arr, i)+1;
    }

    int f( int arr[], int i){

        if( arr[i]==-1) return 0;

        else {
            return 1+ f(arr,arr[i] );
        }

    }
}

