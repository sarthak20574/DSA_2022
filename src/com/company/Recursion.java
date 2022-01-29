package com.company;

public class Recursion {

    void printIncreasingNumbers( int n){
        if( n==0) return;
        else {
            printIncreasingNumbers(n-1);
            System.out.println(n);

        }
    }

    void printDecreasingNumbers(int n){
        if( n==0) return;
        else {
            System.out.println(n);
            printDecreasingNumbers(n-1);
        }
    }
    static int min= Integer.MAX_VALUE;
    static int max=Integer.MIN_VALUE;

    void lastAndfirstOccurenceInAnArray(int[] arr,int size, int n){

        if( size-1==-1) {
            System.out.println("min: "+min+" max:"+max);
            return;
        }
        else if( arr[size-1]==n){
            System.out.println("inside");
            if (min>size-1) min=size;
            if (max<size-1) max=size;
        }

            lastAndfirstOccurenceInAnArray(arr, size-1, n);

    }

    int lastOccurenceOfANumber(int[] arr,int i, int n, int key) {
        // first traverse to the end then start checking, then start checking
        if (i == n) return -1;
        int restArray = lastOccurenceOfANumber(arr, i + 1, n, key);
        if (restArray != -1) return restArray;

        if (arr[i] == key) return i;
        return -1;
    }

    String reverseStringUsingRecursion(String word,int i, int size){
        if(i==size) return "";
        String ans= reverseStringUsingRecursion(word,i+1,size);
        return  ans+word.charAt(i);
    }

    //replace pi with 3.14
    String replacePiWith(String word,int i, int size){
        if(i==size){
            return "";
        }
        if(word.charAt(i)=='p'){
            if(i+1!=size && word.charAt(i+1)=='i'){
                return "3.14"+replacePiWith(word,i+2,size);
            }
        }
        return word.charAt(i)+replacePiWith(word, i+1, size);
    }

    void towerOfHanoi(int n, String A, String B, String C){

        if( n==1){
            System.out.println(n+" from "+A+" to "+C);
            return;
        }
        towerOfHanoi(n-1,A,C,B);
        System.out.println(n+" from "+A+" to "+C);
        towerOfHanoi(n-1,B,A,C);
        //164:11
    }


    static String end="";
    String moveAllXToTheEnd(String word, String x, int size){
        if(size==-1) return "";

        String ans= moveAllXToTheEnd(word,x,size-1);
        if ((word.charAt(size)+"").equals(x)){
            end+=x;
            if(size==word.length()-1) return ans+end;
            return ans;
        }
        if(size==word.length()-1) return ans+word.charAt(size)+end;
        return ans+word.charAt(size);
    }

}
