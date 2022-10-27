package com.company.LeetCode_DailyChallenge;

public class Check_If_Two_String_Arrays_are_Equivalent {

    //1662. Check If Two String Arrays are Equivalent
    //https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {


        int i=0, ii=0, j=0, jj=0;

        while(i!=word1.length || ii!=word2.length){


            if( j==word1[i].length()){
                i++;
                j=0;
            }

            if( jj==word2[ii].length()){
                ii++;
                jj=0;
            }

            if((i==word1.length ) ||
                    (ii==word2.length ) ) break;
            if( word1[i].charAt(j)!=word2[ii].charAt(jj)) return false;

            j++; jj++;
        }

        if((i==word1.length ) &&
                (ii==word2.length ) ) return true;
        else return false;
    }

}
