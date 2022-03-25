package com.company;

public class Longest_Palindromic_Subsequence_DP {

    //substring
    // brute forces= generate all substrings in O(n^2) and then check the longest solution

    //errichto( LC Substring not LC subsequence)
    //https://www.youtube.com/watch?v=0CKUjDcUYYA
    //we are repeating that instead of checking if [L, R] is a good palindrome we
    // check if [l+1,R-1] is a palindrome && L==R
    // start from middle and start checking the left and the ryt element( for even 1221 and 12321
    // so start checking from the 2s in both the examples


    //https://www.youtube.com/watch?v=_nCsPn7_OgI
    // for a g b d b a
    // 5,5 means that string starts at 5 and ends at 5
    // 0,1 so lngest palindromic subsequence with a,g? still 1
    // 0,2 means that max( (0,1), (1,2))  max(i,

    // for 2,4 we see trhat 2th and 4th are the same for the both so there...
    // 0,5 lcs= 0,5 + 1,4= 2(as ele at 0 and 5 are same) +3( longest between 1 and 4)= 5





}
