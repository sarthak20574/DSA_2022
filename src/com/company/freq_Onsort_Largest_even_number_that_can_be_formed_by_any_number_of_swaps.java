package com.company;

public class freq_Onsort_Largest_even_number_that_can_be_formed_by_any_number_of_swaps {
    //Approach: Sort the string in descending order then we will get the largest number possible with the given
    // digit but it may or may not be an even number. In order to make it even (if it not already),
    // an even digit from the number must be swapped with the last digit and in order to maximize
    // the even number, the even digit which is to be swapped must the smallest even digit from the number.
    //
    //Note that the sorting can be done in linear time using frequency
    // array for the digits of the number as the number of distinct elements that
    // are needed to be sorted can be at most 10 in the worst case.
        public String LargestEven(String a){


            //char [] c= a.toCharArray();

            int[] freq= new int[10];
            String end= "";
            StringBuilder ans= new StringBuilder("");
            int min_ele= 11;


            for (int i = 0; i < a.length(); i++) {

                freq[a.charAt(i)-'0']++;
                if( (a.charAt(i)-'0' )% 2==0 && min_ele> a.charAt(i)-'0'){
                    min_ele= a.charAt(i)-'0';
                    end=""+(a.charAt(i)-'0');
                }
            }


            if (min_ele !=11) {
                freq[min_ele]--;
                for( int i=9; i>=0; i--){
                    if( freq[i]>0){
                        for( int k=0 ;k<freq[i]; k++){
                            ans.append(i);
                        }
                    }
                }
                ans.append(end);
            }
            else {
                for( int i=9; i>=0; i--){
                    if( freq[i]>0){
                        for( int k=0 ;k<freq[i]; k++){
                            ans.append(i);
                        }
                    }
                }
            }
            return (ans.toString());
        }



}
