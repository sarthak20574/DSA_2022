package com.company;

public class Bitwise_AND_of_the_Array {

    //left shift: x<<k = x * 2^k
    // right shift: x>>k = floor(x/(2^k))

    //N=4, X=2
    // A={3,1,2,7}
    // ans= 2
    // 3= 0011, 1=0001, 2= 0010, 7=0111 and we nned the AND to be stricly greater than X(2 =0010)
    // eg: if x=7 just get the next value of power of 2, ie , >X and then from that power( 3 here) just make all
    // numbers 0 at that bit( 3 here) as one till the last bit and thats the answer
    // this will fail in this case


    // if the bit is set in X then we don't do anthing else
    // which bit is not set we need to modify it

}
