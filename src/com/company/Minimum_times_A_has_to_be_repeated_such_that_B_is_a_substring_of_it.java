package com.company;

public class Minimum_times_A_has_to_be_repeated_such_that_B_is_a_substring_of_it {
    //https://www.youtube.com/watch?v=3tD7DaZklYg

    //2 cases in abcd either whole word is repeating or a part of the word is
    //abcdabcd or cdabcdab and in ant other cases it can't be a substring

    /*
     int minRepeats(string A, string B) {
        string t=A;
        int ans=1;

        while( A.length()<B.length()){
            A+=t;
         ans++;
        }
        if(A.find(B)!=-1) return ans;

        ans++;
        A+=t;

        if( A.find(B)!=-1) return ans;
        return -1;
    }
     */
}
