package com.company;

public class K_th_Element_of_Two_Sorted_Arrays {

    //non-tested
     //have 2 sorted arrays merge them to get the sorted arrays
    //Time: O(n)
    //Space: O(m+n)
    static int method1(int arr1[], int arr2[], int m, int n, int k)
    {
        int[] final4= new int[m+n];
        int i=0, j=0, index_of_newArray=0;
        while (i<m && j<n){

            if( arr1[i]<arr2[j]){
                final4[index_of_newArray++]=arr1[i++];
            }
            else {
                final4[index_of_newArray++]=arr2[j++];
            }
        }

        while (j<n){
            final4[index_of_newArray++]=arr2[j++];
        }
        while (i<m){
            final4[index_of_newArray++]=arr1[i++];
        }

        return final4[k-1];
    }

    //non-tested
    // returning the kth element without using the extra element
    //Time:O(k)
    //Space:O(1)
    static int method2(int arr1[], int arr2[], int m, int n, int k){

        int i=0, j=0, iterate_index=0;

        while (i<m && j<n){

            if( arr2[j]>arr1[i]){
                iterate_index++;
                if(iterate_index==k) return arr1[i];
                i++;
            }
            else {
                iterate_index++;
                if( k==iterate_index) return arr2[j];
                j++;
            }
        }

        while (i<m){
            iterate_index++;
            if(iterate_index==k) return arr1[i];
            i++;
        }
        while (j<n){
            iterate_index++;
            if( k==iterate_index) return arr2[j];
            j++;
        }
        return Integer.MIN_VALUE;

    }





    //max heap






}
