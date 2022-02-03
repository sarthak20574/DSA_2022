package com.company;

public class Count_set_bits_in_an_integer {

    static int method(int n){
        if(!a_given_number_is_power_of_2.isPowerofTwo(n)){
            return -1;
        }

        int i=1, pos=1;

        //Iterate through bits of n till we find a set bit
        // i&n will be non-zero only when 'i' and 'n' have a set bit
        // at same position

        while ((i&n)==0){

            i=i<<1;
            pos++;
        }
        return pos;
    }

    //count the no of right shifts it takes for n to become 0
    static int method2(int n) {
        if (!a_given_number_is_power_of_2.isPowerofTwo(n)) {
            return -1;
        }

        int count=0;
        while (n>0){
            n=n>>1;
            count++;
        }
        return count;
    }




    static int setBits(int N) {
        int count=0;

        while (N>0){
            count+=N&1;
            N=N>>1;
        }
        return count;
    }
}