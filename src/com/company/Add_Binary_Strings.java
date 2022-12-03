package com.company;

public class Add_Binary_Strings {

    //Add Binary Strings
    //https://practice.geeksforgeeks.org/problems/add-binary-strings3805/1

    String addBinary(String a, String b) {

        int sum, carry=0;

        StringBuilder A= new StringBuilder(a);
        A.reverse();

        StringBuilder B= new StringBuilder(b);
        B.reverse();

        StringBuilder ans=new StringBuilder();

        int n= Math.min( A.length(), B.length());

        for( int i=0; i<n; i++){
            sum= A.charAt(i)-'0' + B.charAt(i)-'0' + carry;

            carry= sum/2;
            sum= sum%2;
            //System.out.println(sum);
            ans.append(sum);
        }

        while( n<A.length()){
            sum= A.charAt(n)-'0' + carry;

            carry= sum/2;
            sum= sum%2;
            ans.append(sum);

            //System.out.println(sum);
            n++;
        }


        while( n<B.length()){
            sum= B.charAt(n)-'0' + carry;

            carry= sum/2;
            sum= sum%2;
            ans.append(sum);
            //System.out.println(sum);
            n++;
        }

        if( carry!=0){
            sum= carry;

            ans.append(sum);
            //System.out.println(sum);
            n++;
        }

        int zero=0;

        ans.reverse();

        while( zero<ans.length() && ans.charAt(zero)=='0'){
            zero++;
        }



        return ans.substring(zero);
    }
}
