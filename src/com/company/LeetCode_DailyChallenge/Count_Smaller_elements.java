package com.company.LeetCode_DailyChallenge;

public class Count_Smaller_elements {

    int[] ans;

    int[] constructLowerArray(int[] arr, int n) {

        ans= new int[n];


        // 0 to 5 => 0 to 2( size=3) 3 to 5(size =3)
        // 0 to 4=> 0 to 2 (size= 3) 3 to 4 (size=2)


        int[] index= new int[n];

        for( int i=0; i< n; i++){
            index[i]=i;
        }


        divide(arr,index, 0, n-1);

        return ans;
    }


    void divide( int[] arr, int[] index,int beg, int end){

        // 0 to 5 => 0 to 2( size=3) 3 to 5(size =3)
        // 0 to 4=> 0 to 2 (size= 3) 3 to 4 (size=2)
        if( beg>=end){// > required?
            return;
        }

        int mid=(beg+end)/2;
        divide( arr,index, beg, mid);
        divide( arr, index, mid+1, end);

        merge(arr,beg, mid, end, index);
    }



    void merge(int[] arr, int beg, int mid, int end, int[] index){

        int i=beg, j= mid+1;

        int k=0;

        int[] t= new int[end-beg+1];

        while( i<=mid && j<=end){
            if(arr[index[i]]>arr[index[j]]){
                ans[index[i]]+=end-j+1;
                t[k++]=index[j++];

            }
            else if(arr[index[i]]<=arr[index[j]]){
                t[k++]=index[i++];
            }
        }

        while( i<=mid){
            t[k++]=index[i++];
        }
        while(j<=end){
            t[k++]= index[j++];
        }

        k=0;
        for( int l=beg; l<=end; l++){
            index[i]=t[k++];
        }


    }

}
