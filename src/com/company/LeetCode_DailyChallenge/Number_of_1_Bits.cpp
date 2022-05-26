//Number of 1 Bits
//https://leetcode.com/problems/number-of-1-bits/
//https://www.youtube.com/watch?v=5Km3utixwZs

//to count the number pf the 1s in the integer we AND it by 1 or 000001 and then see or mod it by 32 and get the remainder
// to move to the next bit shift to right or integer divison by 2


 int hammingWeight(uint32_t n) {
        int ans=0;
        while( n){
            ans+=n%2;
            n=n>>1;
        }

        return ans;
    }


    //or if n= 0000111 then n-1= 0000110 so n & n-1 gives us 0000110 so traverse only O( no. of 1s)

   int hammingWeight(uint32_t n) {
       int ans=0;

       while( n){
       n=n&(n-1);
       ans++;
       }
       return ans;
       }