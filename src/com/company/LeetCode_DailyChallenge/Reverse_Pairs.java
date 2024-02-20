package com.company.LeetCode_DailyChallenge;

public class Reverse_Pairs {

    //493. Reverse Pairs
    //https://leetcode.com/problems/reverse-pairs/
    //https://www.youtube.com/watch?v=0e4bZaP3MDI&ab_channel=takeUforward


    long ans=0;
    public int reversePairs(int[] nums) {
        ans=0;
        fn(nums, 0, nums.length-1);
        // System.out.println(Arrays.toString(nums));

        return (int)ans;
    }

    void fn( int[] arr, int l, int h){

        if( l>=h) return;

        int m= l+(h-l)/2;
        fn( arr,l,m);
        fn( arr,m+1, h);

        mer(arr,l,m,h);
    }

    void mer(int[] arr, int l, int m, int h){

        int[] res= new int[h-l+1];

        int i=l, j=m+1, cur=0;

        int cc=m+1;
        for( int ii=l; ii<m+1; ii++){

            while( cc<=h && arr[ii]/2.0 >arr[cc]){
                cc++;
            }
            ans+=cc-m-1;
        }



        //i=l, j=m+1, cur=0;

        while( i<=m && j<=h){
            if( arr[i]<=arr[j]){
                res[cur++]=arr[i++];
            }
            else{
                // if( arr[i]/2.0>arr[j]){
                //     //System.out.println(h-j);
                //     ans+=(m-l+1-i);
                //     }
                res[cur++]=arr[j++];
            }
        }
        while( i<=m){
            //ans+=(h-j);
            res[cur++]=arr[i++];

        }
        while( j<=h){
            // ans+=(h-j);
            res[cur++]=arr[j++];
        }


        for( int k=0; k<h-l+1; k++){
            arr[l+k]=res[k];
        }
    }


}
