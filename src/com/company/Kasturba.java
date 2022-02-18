package com.company;

public class Kasturba {

    //incomplete

    //With above trick, the recurrence becomes T(n) = 3T(n/2) + O(n) and solution of this recurrence is
    //  O(nlog base2 3) or O(n1.59)



    //given two unequal sized bit strings, converts them to
    // same length by adding leading 0s in the smaller string. Returns the
    // the new length

    void makingThemOfSameLength(String a, String b){
        int a_length=a.length();
        int b_length=b.length();

        StringBuilder aBuilder = new StringBuilder(a);
        for(int i = 0; i<=b_length-a_length; i++){
            aBuilder.insert(0, "0");
        }
        a = aBuilder.toString();

        StringBuilder bBuilder = new StringBuilder(b);
        for(int i = 0; i<a_length-b_length; i++){
            bBuilder.insert(0, "0");
        }
        b = bBuilder.toString();
    }

//    static Long karatsubaAlgo(String A, String B) {
//
//        if( A.length()==1){
//            return A;
//        }
//
//        String A1=
//
//    }

}
