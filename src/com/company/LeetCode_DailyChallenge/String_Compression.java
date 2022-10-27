package com.company.LeetCode_DailyChallenge;

public class String_Compression {

    //443. String Compression
    //https://leetcode.com/problems/string-compression/
    //https://www.youtube.com/watch?v=IhJgguNiYYk&ab_channel=KevinNaughtonJr.



    public int compress(char[] chars) {

        int i=0,j=0,n=chars.length, chars_i=0;

        // chars_i= our ans array's current index


        while( i<n){

            // group all the elements equal to the jth element
            while(i<n && chars[i] == chars[j]){
                i++;
            }


            // now all the elements from jth index to the ith index are same,ie, chars[j]

            // add the jth or new element
            chars[chars_i++]=chars[j];


            // i-j gives us the frequency of the jth element(all the elements from jth index to the ith index are same,ie, chars[j])
            if( i-j>1){

                // add them to our answer array
                String x=String.valueOf(i-j);

                for( char c: x.toCharArray()){

                    chars[chars_i++]=c;
                }

            }


            j=i;
        }

        return chars_i;
    }
}
