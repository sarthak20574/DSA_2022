package com.company.Unboxing_Interview_Series_GFG;

public class longest_even_length_substring {

    // 1 2 3 4 3 2 1

    // they both have to be equal so choose a string and move the pointers by 1 on both the sides as both
    // the sides must have k digits, till and keep checking
    // if the left and the right sums are equal
    //https://www.youtube.com/watch?v=pa9dP6PiEvo from 23 minutes

    public int substr(String str, int N) {

        int ans=0;

        for( int i=0; i<N-1; i++){

            int j=i+1, k=i, l_sum=0, r_sum=0;
            while (k>=0 && j<N){
                l_sum+=(str.charAt(k)-'0');
                r_sum+=(str.charAt(j)-'0');
                if( l_sum==r_sum) ans=Math.max(ans, j-k+1);
                j++;
                k--;
            }
        }

        return ans;
    }

    // with DP

}
