package com.company;

public class Transfiguration_Transform_String {

    // traverse form back, if equal then move both the pointers, else if not equal k,
    // then increment count and move only the first String's pointer
    // also for abd and abc return -1 as c doesn't exist in the String
     static int transfigure (String A, String B){
        int A_length= A.length(), B_length=B.length();

        if(A_length!=B_length) return -1;

//        //abc and aad also will give sum=0 so its wrong
//        int sum=0;
//        for (int i=0; i<A_length; i++){
//
//            sum+=A.charAt(i);
//            sum-=B.charAt(i);
//        }
//        if(sum!=0) return -1;

        //can also use map

        int[] count_array= new int[256];
        for( int i=0; i<A_length;i++){
            count_array[A.charAt(i)]++;
            count_array[B.charAt(i)]--;
        }

        for( int i=0 ; i< 256;i++){
            if( count_array[i]!=0){
                return -1;
            }
        }

        int ans=0,i=A_length-1, j=A_length-1;

        while (i>=0){
            if( A.charAt(i)==B.charAt(j)){
                i--;
                j--;
            }
            else {
                i--;
                ans++;
            }
        }

        return ans;
    }

    /*

int transform (string A, string B)
   {
       unordered_map<char, int> map;
       int ans=0;

       int n= A.size();
       int m= A.size();


       for( auto i: A) {
           map[i]++;
       }
       for( auto i: B){
           map[i]--;
       }

       for(auto i: map){
           if( i.second!=0) return -1;
       }

       int i= n-1;  int  j= m-1;

       while( i>=0 && j>=0){
           if( A[i]== B[j]){
               i--;
               j--;
           }
           else{
               j--;
               ans++;

           }
       }
     */

}
