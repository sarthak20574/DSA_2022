package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {


    int f(int[] arr,int i,int j){

        if( i>j) return 0;

        return Math.min(arr[i]+f(arr,i-2,j),arr[j]+f(arr,i-1,j-1));
    }


//    static boolean f(long n){
//
//        if( n==0 || n==1) return false;
//        if( n==2 || n==3) return true;
//
//        if ( n % 3 == 0 || n % 2 == 0 )
//            return false;
//
//        for (int i = 5; i * i <= n; i+= 6)
//
//            if ( n % (i + 2) == 0 || n % i == 0)
//                return false;
//
//        return true;
//    }


    public static void main(String[] args) throws IOException {

        int val[] = new int[] {1 ,2 ,5 ,6 ,6, 7, 9 ,16 ,16 ,17 ,19} ;//{6, 14 ,17};
        int wt[] = new int[] {1, 3 ,3 ,5 ,6 ,6, 11, 13, 13, 17, 17, 18, 19, 20} ;//{6, 6, 11, 15, 16};

        int X = 28;
        System.out.println(Find_the_closest_pair_from_two_arrays.printClosest(val, wt, val.length, wt.length, X));

//        Reader.init(System.in);
//        int tests= Reader.nextInt();
//
//        for( int i=0; i<tests;i++){
//
//            int n=Reader.nextInt();
//
//            boolean no[]= new boolean[ n-1];
//
//            for( int j=0 ;j< n-1;j++){
//
//                no[j]=true;
//            }
//            for ( int l=2; l*l<=n-1;l++){
//
//                if( no[l]==true){
//                    for (int k=l*l;k<=n-2;k+=l){
//                        no[k]=false;
//                    }
//
//                }
//            }
//            long ans=0;
//            for( int j=0 ;j< n-1;j++){
//
//                if(no[i]==true){
//                    ans++;
//                }
//            }
//
//            System.out.println(ans);


        //142857144
    }
//
//        int no_gangs =Reader.nextInt();
//            int[] x=new int[no_gangs];
//        long sum=0, min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
//
//        for (int j=0 ;j<no_gangs-1; j++){
//            x[j]=Reader.nextInt();

//            int max_mem=Reader.nextInt();


//        CodeForcesXORORED obj= new CodeForcesXORORED();
//        obj.f();


//        Greedy greedy= new Greedy();
//        Greedy.Activity[] activities= greedy.load(new int[]{5, 1, 3, 0, 5, 8}, new int[]{9, 2, 4, 6, 7, 9});
//        greedy.printMaxActivities(activities,activities.length);


//        Recursion r= new Recursion();
//        int[] arr= new int[]{4,2,1,2,5,2,7};
//        System.out.println(r.moveAllXToTheEnd("axxbdxcefxhix","x","axxbdxcefxhix".length()-1));
//

//        LinkedList linkedList= new LinkedList();
//
//        linkedList.push(5);
//        linkedList.push(4);
//        linkedList.push(3);
//        linkedList.push(2);
//        linkedList.push(1);
//
//        linkedList.printLinkedList();
//        System.out.println();
//
//        AppendTheLastMNodesToTheBeginning obj= new AppendTheLastMNodesToTheBeginning();
//        linkedList.head=obj.appendLastKNodes(linkedList.head,2);
//        linkedList.printLinkedList();


//        long a[] = {1, 3, 5, 7}, b[] = {2, 4, 6, 8};
//        int size = a.length;
//        int size1 = b.length;
//        merge2sortedarrayswithoutusinganyspace p= new merge2sortedarrayswithoutusinganyspace();
//        p.map_method(a,b,size,size1);


}





class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                    reader.readLine() );
        }
        return tokenizer.nextToken();
    }
    static String nextLine() throws IOException {
        return reader.readLine();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}