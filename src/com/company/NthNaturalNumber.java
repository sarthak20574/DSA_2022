package com.company;


public class NthNaturalNumber {

    //for base 2 number onlt 0 and 1 allowed so base 9 means 0-8 allowed
    // same way as we convert decimal to binary....5=2*2+1, 2*1+0.....101..remainers in each step *10

     long findNth(long N)
    {
        long ans=0;
        long multiply_by_10=1;
        while (N>0){
            ans+= (N%9)*multiply_by_10;
            multiply_by_10*=10;
            N/=9;
        }
        return ans;
    }

}
