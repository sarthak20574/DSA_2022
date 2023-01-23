package com.company.LeetCode_DailyChallenge;

public class Apply_Bitwise_Operations_to_Make_Strings_Equal {

    //2546. Apply Bitwise Operations to Make Strings Equal
    //https://leetcode.com/problems/apply-bitwise-operations-to-make-strings-equal/description/

    public boolean makeStringsEqual(String s, String target) {

        long z1=0, z2=0;
        for( int i=0;i<s.length(); i++){
            if( s.charAt(i)=='0')z1++;
        }
        for( int i=0;i<s.length(); i++){
            if( target.charAt(i)=='0')z2++;
        }

        int n= s.length();
        if(z2==n){
            if(z1!=n) return false;
        }
        if(z1==n){
            if(z2!=n) return false;
        }
        return true;
    }
}
