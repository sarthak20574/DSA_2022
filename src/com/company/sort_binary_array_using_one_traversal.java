//package com.company;
//
//public class sort_binary_array_using_one_traversal {
//}
//
//package com.company;
//
//public class Main {
//
//    public static void main(String[] args) {
//        int a[] = { 1, 0, 0, 1, 0, 1, 0, 1, 1, 1,
//                1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0 };
//
//        int n = a.length;
//
//        sortBinaryArray(a, n);
//
//        for (int i = 0; i < n; i++)
//            System.out.print(a[i] + " ");
//
//    }
//
//    private static void sortBinaryArray(int[] a, int n) {
//        int sum=0;
//        for ( int i=0; i<n; i++){
//            sum+=a[i];
//        }
//
//        for (int i=n-1 ;i>=0; i--){
//            if( sum>0){
//                a[i]=1;
//                sum--;
//            }
//            else {
//                a[i]=0;
//
//            }
//        }
//    }
//void binSort(int A[], int N)
//        {
//        int l=0, r=N-1;
//        while(l<r){
//        if(A[l]==1 && A[r]==0) swap(A[l++], A[r--]);
//        else if(A[l]==0) l++;
//        else if(A[r]==1) r--;
//        }

//}
//
