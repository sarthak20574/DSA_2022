package com.company;

import java.util.Arrays;

public class sortEvenInFirstHalfAndSortedOddInSecondHalf {
    void segregateEvenOdd(int arr[], int n) {

        //https://www.geeksforgeeks.org/segregate-even-and-odd-numbers/?ref=lbp
        int l = 0, h = n - 1, count = 0;
        for (int i = 0; i < n; i++) {
            while (l <= h) {

                if (arr[l] % 2 == 0) {
                    l++;
                    count++;
                } else if (arr[h] % 2 != 0) h--;
                else {
                    int temp = arr[l];
                    arr[l] = arr[h];
                    arr[h] = temp;
                    l++;
                    h--;
                    count++;
                }

            }
        }
        Arrays.sort(arr, 0, count);
        Arrays.sort(arr, count, n);
    }

}
