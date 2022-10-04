package com.company;

public class Minimum_characters_to_be_added_at_front_to_make_string_palindrome {

    //Minimum characters to be added at front to make string palindrome
    //
    //


    public static int minChar(String str) {

        int i=0,j=str.length()-1,unequal_index=str.length()-1, ans=0;

        while( i<=j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;

            }else{
                ans++;
                unequal_index--;
                i=0;
                j= unequal_index;
            }
        }

        return ans;
    }


}
