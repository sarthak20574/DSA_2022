package com.company.LeetCode_DailyChallenge;

public class Bitwise_AND_of_Numbers_Range {

    //201. Bitwise AND of Numbers Range
    //https://leetcode.com/problems/bitwise-and-of-numbers-range/description/
    //https://www.youtube.com/watch?v=6aHmj9ihjMY&ab_channel=ErrichtoAlgorithms

    // must see-   https://leetcode.com/problems/bitwise-and-of-numbers-range/solutions/593317/simple-3-line-java-solution-faster-than-100/

    public int rangeBitwiseAnd(int m, int n) {
        int ans=0;
        for( int i=30; i>=0; i--){
            if( (m & (1<<i))== ((n& (1<<i)) )){
                ans |=(m & (1<<i));
            }
            else{
                break;
            }
        }
        return ans;
    }


}
