package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public ListNode doubleIt(ListNode head) {

        StringBuilder x= new StringBuilder
    }


    public static void main(String[] args) throws IOException {

        System.out.println("hiiiiiiii");

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