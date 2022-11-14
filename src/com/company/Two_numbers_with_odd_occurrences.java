package com.company;

public class Two_numbers_with_odd_occurrences {

    //Two numbers with odd occurrences
    //https://practice.geeksforgeeks.org/problems/two-numbers-with-odd-occurrences5846/1
    //https://www.youtube.com/watch?v=pnx5JA9LNM4&ab_channel=Pepcoding
    public int[] twoOddNum(int arr[], int N)
    {

        int xor=0;
        for( int i: arr){
            xor^=i;
        }


        // get the set bit

        int lft_set_bit= xor & -xor; // or xor& ~(xor-1)


        int[] ans= new int[2];

        for( int i: arr){

            // if same bit set as the lftsetbit then collect in one group


            if( (i & lft_set_bit)==0 ){
                ans[0]^=i;
            }
            else{
                ans[1]^=i;
            }
        }

        if( ans[0]< ans[1]){
            int temp= ans[0];
            ans[0]= ans[1];
            ans[1]=temp;
        }
        return ans;

    }
}
