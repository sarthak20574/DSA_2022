package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {


//    static boolean f(long n){
//        if (n <= 3)
//            return true;
//
//
//        if ( n % 3 == 0 || n % 2 == 0 )
//            return false;
//
//        for (int i = 5; i * i <= n; i = i + 6)
//
//            if ( n % (i + 2) == 0 || n % i == 0)
//                return false;
//
//        return true;
//    }


    public static void main(String[] args) throws IOException {

        //System.out.println(NthNaturalNumber.findNth(11));

//        Reader.init(System.in);
//
//            int no_gangs =Reader.nextInt();
//
//            for (int j=0 ;j<no_gangs; j++){
//               long x=Reader.nextInt();
//
//               //if( x==2) return;
//               while (!f(x)){
//
//                   x++;
//               }
//                System.out.println(x);
//
//            }


//        Reader.init(System.in);
//        int tests=Reader.nextInt();
//
//        for (int i=0 ; i<tests; i++) {
//            int n = Reader.nextInt();
//            int x = Reader.nextInt();
//            String str = Reader.nextLine();!
//
//            if( n<x) {
//                System.out.println(0);
//                continue;
//            }
//
//            int ans[] = new int[n],count=0, index_ans=0;
//            boolean used=false,inside=false;
//            for (int j=0;j<n; j++){
//
//                count=0;
//                while (j<n && str.charAt(j)=='0'){
//                    used=true;
//                    count++;
//                    j++;
////
//                }
//                while (j+1 < n && str.charAt(j+1)=='0' && used) {
//                    inside=true;
//                    count++;
//                    j++;
//                }
//                if (used){
//                    ans[index_ans++]=count+1;
//
//                    count=0;
//                    used=false;
//
//                    //j++;
//                }
//
//                }
//
//            int max=0;
//            for(int j=0 ; j<n && ans[j]!=0; j++){
////                if( max<ans[j]){
//                    max+=ans[j];
////                }
//            }
//
//            if( x!=0)
//            System.out.println(max/x);
//            else System.out.println(x);
//
//        int N = 3;
//        int arr[] = {1, 2, 1};
//        int D = 2;
//
//        System.out.println(Allocate_minimum_number_of_pages.findPages(arr,N, D));




        }




//            int max_mem=Reader.nextInt();
//
//            int[] a = new int[n];
//            int[] b = new int[n];
//
//            for (int j=0 ;j<n; j++){
//                a[j]=Reader.nextInt();
//            }
//
//            for (int j=0 ;j<n; j++){
//                b[j]=Reader.nextInt();
//            }
////            System.out.println(Arrays.toString(a));
////            System.out.println(Arrays.toString(b));
//
//            Activity[] activities= load(a,b);
//
//            printMaxActivities(activities,n,max_mem);

        //      }


//        CodeForcesXORORED obj= new CodeForcesXORORED();
//        obj.f();


//        substringOfString obj= new substringOfString();
//        obj.method1("abcdef");

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