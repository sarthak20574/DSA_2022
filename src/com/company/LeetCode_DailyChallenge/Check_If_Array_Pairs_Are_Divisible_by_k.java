package com.company.LeetCode_DailyChallenge;

public class Check_If_Array_Pairs_Are_Divisible_by_k {

    //1497. Check If Array Pairs Are Divisible by k
    //https://leetcode.com/problems/check-if-array-pairs-are-divisible-by-k/description/

    /*
    we store the remainders in a freq table of

for k=5

if the remainers are:
4 and -4 can combine to give us a 0(4-4) ,a multiple of 5
4 and 1 can combine to give us 5(4+1) ,ie, a multiple of 5
-4 and -1 can combine to give us 5 ,ie, a multiple of 5

0 and 0 that is both the numbers are fully divisible, then
we can for a pair

therefore pairs are x,y such that x+y=m

for even k like k=4
2can form a pair with itself so we see if the no of numbers giving us 2 as the remainder can form pairs (is, even)
*/

    public boolean canArrange(int[] arr, int k) {
        int[] freq= new int[k];

// i and k-i need to exist in pairs
        for( int i: arr){

            // to handle negative elements -1%5 = -1
            if( i%k<0)
                freq[-i%k]--;
            else
                freq[i%k]++;
        }


//divisible nos need to exist in pairs
        if( freq[0]%2!=0) return false;


        int i=1, j=k-1;

        while( i<j){
            if(freq[i++]!= freq[j--]) return false;
        }

//even k,
        if( k%2==0 && freq[k/2]%2!=0) return false;

        return true;

    }


}
