package com.company;

public class Subset_Sum_Problem_DP_25 {

    //https://www.youtube.com/watch?v=tRpkluGqINc&t=0s

    // supply n as size-1 as the parameter
    static boolean recursion(int set[], int size, int sum){
        //https://www.geeksforgeeks.org/subset-sum-problem-dp-25/


        if( sum==0) return  true;

        else if( size ==0) return false; //as this will check the -1 index if the case is left unchecked

        // if the last element is greater the the sum then just ignore it
        else if ( set[size-1]>sum) return recursion(set, size-1, sum);

        else {
            return recursion(set, size -1, sum) ||recursion(set, size -1, sum- set[size-1]);
        }
    }

    //https://www.youtube.com/watch?v=tRpkluGqINc&t=0s

    // 0st elelements...so T FFFF
    // 1st element...4, 2 subsets {} or 4 so only 0 or 4 we are gonna get true
    // in 2nd elelemnt either 2 joins 4 or doesn't for sum =3 , if use 2 still will have
    // 1 can thr remaining team make the remaining 1
    // for sum=4 if the 2nd element goes batting the rest of the team needs to store the
    // remaining 4-2(check that up going to above and sum(here,4)-2(2nd element) i-1(previous row) j-1
    // next element 7, 7 can't go for batting unless the sum is atleast 7, so he will just ask
    // if the remaining ppl can make the runs till 7, or take the elements from the top column


    static boolean[][] matrix;

    static void initiaize(int size, int sum){

        matrix= new boolean[size][sum];

        for (int i = 0; i < size; i++) {
            matrix[i][0]=true;
        }
//        for (int i = 1; i < sum; i++) {
//            matrix[0][1]=false;
//        }

    }

    static Boolean DP(int N, int arr[], int sum){

        initiaize(N+1,sum+1);

        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if( arr[i-1]>j){
                    matrix[i][j]=matrix[i-1][j];
                }
                else {
                    matrix[i][j]= matrix[i-1][j] ||
                            matrix[i-1][j-arr[i-1]];
                }
            }
        }

//        for (int i = 1; i < N; i++) {
//            for (int j = 1; j < sum; j++) {
//                //System.out.print(matrix[i][j]+" ");
//            }
//            //System.out.println();
//        }

        return matrix[N][sum];
            }
}
// to find the numbers trace, store the array elements, its will be matrix(i-1,j)|| matrix(i-1, j-arr[i-1]),
// in case of the and get all ith elelemnt that lead to the the true way leading to the matrix( i-1, j-arr[i-1])

