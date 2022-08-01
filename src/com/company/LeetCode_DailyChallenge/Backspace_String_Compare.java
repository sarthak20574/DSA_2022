package com.company.LeetCode_DailyChallenge;

public class Backspace_String_Compare {



    //incorrect have to debug
    public boolean backspaceCompare(String s, String t) {

        int i= s.length()-1, j= t.length()-1;
        int hash=0;
        while (true){
            hash=0;
            while (i>=0 && s.charAt(i)=='#'){
                hash+=1;
                i--;
            }
            while (i>=0 && hash!=0){
                hash-=1;
                i--;
            }

            hash=0;
            while (j>=0 && t.charAt(j)=='#'){
                hash+=1;
                j--;
            }
            while (j>=0 && hash!=0){
                hash-=1;
                j--;
            }
            if( i>=0 && j>=0 && s.charAt(i)!=t.charAt(j)){
                return false;
            }
            else if(  (i>=0 || j>=0)==false) return false;
            else if(  (i>=0 || j>=0)==false)return true;
            else {
                i--;
                j--;
            }
        }
    }


    public boolean backspaceCompare1(String s, String t) {
        int n1= s.length(),n2= t.length();

        StringBuilder x= new StringBuilder();
        int no_of_backs=0;
        for( int i=n1-1; i>=0 ; i--){

            if( s.charAt(i)=='#'){
                no_of_backs++;
                continue;
            }
            while (no_of_backs>0){
                i--;
                no_of_backs--;
            }

            if( i>=0) x.append(s.charAt(i));// i<n
        }

        StringBuilder y= new StringBuilder();
        no_of_backs=0;
        for( int i=n2-1; i>=0 ; i--){

            if( t.charAt(i)=='#'){
                no_of_backs++;
                continue;
            }
            while (no_of_backs>0){
                i--;
                no_of_backs--;
            }
            if( i>=0) y.append(t.charAt(i));// i<n
        }

        return x.equals(y);

    }

}
