package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Counting_elements_in_two_arrays {


//Counting elements in two arrays
//https://practice.geeksforgeeks.org/problems/counting-elements-in-two-arrays/1

    class Solution {
        public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[],
                                                                 int m, int n) {
            ArrayList<Integer> ans = new ArrayList<>();

            Arrays.sort(arr2);

            for (int i : arr1) {
                ans.add(fn(i, arr2));
            }

            return ans;
        }

        static int fn(int ele, int arr2[]) {
            int beg = 0, end = arr2.length - 1, mid, ans = -1;

            while (beg <= end) {

                mid = beg + (end - beg) / 2;

                if (arr2[mid] <= ele) {
                    ans = mid;
                    beg = mid + 1;

                } else {
                    end = mid - 1;
                }

            }

            return ans != -1 ? ans + 1 : 0;
        }
    }
}
