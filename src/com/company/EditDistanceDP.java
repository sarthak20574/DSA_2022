package com.company;
public class EditDistanceDP {

    private static int minOf3(int a ,int b, int c){
        return  Math.min(Math.min(a,b),c);
    }

    public static int recursion3RaisedToN(String str1, String str2, int l1, int l2){

        if( l1==0) return l2;

        else  if( l2==0) return l1;

       // for( int i=0 ; i<)

        else if( str1.charAt(l1-1)==str2.charAt(l2-1))
            return recursion3RaisedToN(str1, str2, l1-1, l2-1);

        //min(replace, remove, insert)
        else{
            return 1+  minOf3(recursion3RaisedToN(str1, str2, l1-1, l2-1),
                    recursion3RaisedToN(str1,str2,l1-1, l2),
                    recursion3RaisedToN(str1, str2, l1, l2-1));

        }
    }

    static int[][] storage;

    private static void initilize(int n, int l){

        storage= new int[n][l];
    }

    public static int OnintoL(String s1, String s2, int l1, int l2){

        initilize(l1+1,l2+1);

        for (int i = 0; i < l1+1; i++) {

            for (int j = 0; j < l2+1; j++) {

                if( j==0){
                    storage[i][j]= i;
                }
                else if( i==0){
                    storage[i][j]= j;
                }
                else if( s1.charAt(i)==s2.charAt(j)){
                    OnintoL(s1, s2, i-1, j-1);
                }
                else {

                    storage[i][j]= 1+ minOf3(storage[i-1][j-1], storage[i][j-1], storage[i-1][j]);

                }

            }

        }

        return storage[l1][l2];
    }

}
