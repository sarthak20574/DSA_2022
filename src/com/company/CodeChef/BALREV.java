package com.company.CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BALREV {

    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A)
    {
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();

        fn(A, ans);

        return ans;
    }

    private static void fn(ArrayList<Integer> a, ArrayList<ArrayList<Integer>> ans) {

        //if( a.size())

    }


    //https://www.codechef.com/START30C/problems/BALREV



    //11100 => 00111
    //always can make the 1s at the end and the 0s at the start

    static void f() throws IOException {

        Reader.init(System.in);
        int tests = Reader.nextInt();

        for (int i = 0; i < tests; i++) {

            int size = Reader.nextInt();
            String x= Reader.next();

           char[] d=x.toCharArray();

            Arrays.sort(d);

            x= String.valueOf(d);
            System.out.println(x);

            // 1000000007;

        }
    }
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