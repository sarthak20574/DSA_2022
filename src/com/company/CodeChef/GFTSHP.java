package com.company.CodeChef;

import java.io.IOException;
import java.util.Arrays;

public class GFTSHP {
    public static void main(String[] args) throws IOException {

        for( int i=1 ; i<= 53; i++){
            System.out.println(i+": "+fn(i));
        }

        System.out.println(26+": "+fn(27));


       // System.out.println(0%26);


//        Reader.init(System.in);
//
//        int tests= Reader.nextInt();
//
//        for( int i=0; i<tests; i++){
//
//            int n= Reader.nextInt();
//            int k= Reader.nextInt();
//
//            int[] arr=new int[n];
//
//            for( int j=0 ; j<n; j++){
//                arr[j]=Reader.nextInt();
//            }
//
//            Arrays.sort(arr);
//
//            int ans=0, sum=0;
//
//            for( int j=0 ; j<n; j++){
//                if( sum+arr[j]>k) {
//                    ans=j;
//                    break;
//                }
//                sum+=arr[j];
//            }
//
//            if( ans==0) ans=n;
//            else if(sum+Math.ceil(arr[ans]/2)<=k) ans++;
//
//            System.out.println(ans);
//        }

    }
}
