package com.company;

public class License_Key_Formatting {

    //License Key Formatting
    //https://practice.geeksforgeeks.org/problems/license-key-formatting/1

    static String ReFormatString(String S, int k){
        StringBuilder ans= new StringBuilder();

        int n=S.length();

        int cur=0;

        for( int i= n-1; i>=0; i--){
            if( S.charAt(i)=='-')continue;
            if( cur==k){
                cur=0;
                ans.insert(0,"-");
            }
            cur++;
            ans.insert(0,Character.toUpperCase(S.charAt(i)));
        }

        return ans.toString();
    }

}
