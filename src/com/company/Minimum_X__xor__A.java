package com.company;

public class Minimum_X__xor__A {
//Minimum X (xor) A
    //https://www.youtube.com/watch?v=9AssoQhH5IQ&ab_channel=SagarMalhotra
    //https://practice.geeksforgeeks.org/problems/x-xor-a-is-minimum-and-set-bits-in-x-b/1#
    public static int minVal(int a, int b) {
        int bits_in_A= Integer.bitCount(a);
        int bits_in_B= Integer.bitCount(b);

        if( bits_in_A==bits_in_B) return a;

        else if(bits_in_A> bits_in_B ){

            // delete bits from the one's place
            while( bits_in_A!= bits_in_B ){
                a = a & (a-1);
                bits_in_A--;
            }

        }
        else{

            // add bits to the one's place
            while( bits_in_A!=bits_in_B){
                a= a| ( a+1);
                bits_in_B--;
            }

        }

        return a;

    }
}
