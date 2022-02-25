package com.company;

public class Fibonacci_with_DP {

    // take a look at this too https://github.com/sarthak20574/DSA_2022/blob/master/src/fibonaccimatrix.png
    // and do it in log(n)

    // tabulation(bottom up)
    static int[] arr;

    static void initialize(int n) {

        arr = new int[n];
    }

    static public int fib(int n) {
        initialize(n + 1);

        arr[0] = 0;

        if (n + 1 > 2)
            arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];

    }


    //memoization

    static int[] arr1;

    static void initialize1(int n) {

        arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = -1;
        }
    }

    static public int fib1(int n) {
        initialize1(n + 1);
        return f(n);
    }

    private static int f(int n) {

        if (arr1[n] ==-1) {

            if (n <= 1) arr1[n] = n;

            else {
                arr1[n] = f(n - 1) + f(n - 2);
            }

        }
        return arr1[n];
    }
}
