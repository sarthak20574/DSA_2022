package com.company.LeetCode_DailyChallenge;

public class Minimum_Additions_to_Make_Valid_String {

    //2645. Minimum Additions to Make Valid String
    //https://leetcode.com/problems/minimum-additions-to-make-valid-string/description/

    public int addMinimum(String word) {

        int ans=0;

        char prev= 'z';

        for( char c: word.toCharArray()){

            if( prev>= c){
                ans++;
            }
            prev= c;
        }

        return ans*3-word.length();
    }

    /*

    also a nice solution

    int ans = 0, i = 0;
    while(i < word.size()){
        (word[i] == 'a') ? i++ : ans++;
        (word[i] == 'b') ? i++ : ans++;
        (word[i] == 'c') ? i++ : ans++;
    }
    return ans;
}
    */

}
