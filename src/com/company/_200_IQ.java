package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class _200_IQ {

    //200 IQ
    //https://my.newtonschool.co/playground/code/d6q9z2fi9uwc
    public static void main (String[] args) {

        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int x=sc.nextInt();

        int[] no= new int[n];

        Arrays.fill(no, -1);

        for( int i=0; i< x; i++){

            int index=sc.nextInt();
            int y= sc.nextInt();

            if(  index==1 && y==0 && n!=1 || no[index-1]!=-1 && no[index-1]!=y){
                System.out.println(-1);
                System.exit(0);
            }
            no[index-1]=y;
        }


        if( n>1 && no[0]==-1){
            no[0]=1;
        }



        StringBuilder ans= new StringBuilder();

        for (int i = 0; i <n ; i++) {
            if( no[i]==-1) ans.append(0);
            else  ans.append(no[i]);
        }
        System.out.println(ans.toString());



    }
}
