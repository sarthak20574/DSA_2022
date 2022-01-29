package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

//    static class Activity{
//        int mem_needed;
//        int mem_added;
//
//        public Activity(int mem_needed, int mem_added){
//            this.mem_needed = mem_needed;
//            this.mem_added = mem_added;
//        }
//    }
//
//    static class Compare{
//
//        static void compare(Activity[] arr, int n){
//
//            Arrays.sort(arr, new Comparator<Activity>() {
//                @Override
//                public int compare(Activity o1, Activity o2) {
//                    return o1.mem_needed-o2.mem_needed;
//                }
//            });
//        }
//    }
 //   static void printMaxActivities(Activity arr[], int n, int max_mem){


//        int ii=0;
//        while (ii<n){
//
//            System.out.println(arr[ii].mem_needed+" "+arr[ii].mem_added);
//            ii++;
//        }

       // Compare.compare(arr, n);

//        int i=0;
//        while (i<n){
//
//            System.out.println(arr[i].mem_needed+" "+arr[i].mem_added);
//            i++;
//        }

//        int i=0;
//        while (i<n && arr[i].mem_needed<=max_mem){
//                max_mem+=arr[i].mem_added;
//            //System.out.println(arr[i].mem_needed+" "+arr[i].mem_added);
//            i++;
//        }
//        System.out.println(max_mem);
//
//    }
//
//    public static Activity[] load(int[] start, int[] end){
//        int n=start.length;
//        Activity[] activities= new Activity[n];
//        for(int i=0 ; i< n; i++){
//            activities[i]= new Activity(start[i], end[i]);
//        }
//        return activities;
//    }
//
//





    public static void main(String[] args) throws IOException {
        
        int[] arr = {3,5,1,4,2};

        No_of_inversions obj = new No_of_inversions();
        System.out.println(obj.noInInversions(arr,0,arr.length));



//        Reader.init(System.in);
//        int tests=Reader.nextInt();
//
//        for (int i=0 ; i<tests; i++) {
//            int n = Reader.nextInt();
//            int x = Reader.nextInt();
//            String str = Reader.nextLine();
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



//        Greedy obj= new Greedy();
//
//        int[] wt = { 10, 40, 20, 30 };
//        int[] val = { 60, 40, 100, 120 };
//        int capacity = 50;
//        System.out.println(obj.getMaxValue(wt, val, capacity));

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