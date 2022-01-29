package com.company;

import java.util.Scanner;

public class CodeForcesXORORED {

    //just check elem with max frequency bruh , this is X
    //1
    //3
    //9 10 11
    //Solution Ans : X= 8
    //Right Ans : X=11


    //take x as any element from array and XOR it with all elements.
    // then perform OR operation in array and print x and result

    //(0 XOR _) V (0 XOR _) V (0 XOR _) V  to minimize it we need
    // to place the exact same bit in each of the dashes, in this
    // to minimize we need to write all 0s so we get 0 V 0 V 0 = 0
    // 011 try 000 we get 1 try 111 get 1 so anyway we will get 1
    // so lets choose x=0 or 1, case 3 if all 3 ones the 111
    // put 111 get 0
    // all 0s  x=0, 0s and 1s x=0 or 1, 1s x=1
    //0s  x=0, 0s and 1s x=0, 1s x=1.....bitwise and operation
    //0s  x=0, 0s and 1s x=1, 1s x=1.....bitwise or operation

    //get x using the & operation and using a for loop evaluate te min element

    void f(){
        Scanner scanner = new Scanner(System.in);
        int tests= scanner.nextInt();


        for ( int i= 0; i< tests; i++){
            int length= scanner.nextInt();
            int[] arr = new int[length];

            int x = -1;// setting all the bits to 1

            for (int j=0 ; j< length; j++){
                arr[j]= scanner.nextInt();
            }

            for (int j=0 ; j< length; j++){
                x=x & arr[j];
            }
            int ans=0;
            for( int j= 0 ; j<length;j++){
                ans= ans |(arr[j]^x);
            }
            System.out.println("x: "+x);
            System.out.println("min: "+ans);

        }
    }

}
