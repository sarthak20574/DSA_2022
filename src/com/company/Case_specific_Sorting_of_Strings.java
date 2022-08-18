package com.company;

import java.util.Arrays;

public class Case_specific_Sorting_of_Strings {

    //Case-specific Sorting of Strings
    //https://practice.geeksforgeeks.org/problems/case-specific-sorting-of-strings4845/1
    //https://www.youtube.com/watch?v=FT-myuyXnlM&ab_channel=SagarMalhotra


    public static String caseSort(String str)
    {

        int n= str.length();

        char[] arr= str.toCharArray();

        int upper=-1, lower=-1;


        Arrays.sort(arr);

        //check if there is an uppercase letter

        if( arr[0]<'a'){

            upper=0;
        }

        for( int i=0; i<n; i++){


            if( arr[i]>='a'){

                lower= i;
                break;
            }
        }


        if( upper==-1 || lower==-1) return new String(arr);

        StringBuilder ans= new StringBuilder();

        for( int i=0; i<n; i++){

            //lowercase
            if( str.charAt(i)>='a'){
                ans.append(arr[lower]);
                lower++;
            }
            else{
                ans.append(arr[upper++]);
            }
        }

        return ans.toString();

    }

}
