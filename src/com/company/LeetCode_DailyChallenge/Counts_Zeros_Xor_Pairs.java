package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Counts_Zeros_Xor_Pairs {
    //Counts_Zeros_Xor_Pairs
    //https://practice.geeksforgeeks.org/problems/counts-zeros-xor-pairs0349/1
    //https://www.youtube.com/watch?v=IWEVmB8QF2k&ab_channel=Pepcoding
    public static long calculate(int arr[], int n) {

        Map<Integer, Integer> freq_map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (freq_map.containsKey(arr[i])) freq_map.put(arr[i], freq_map.get(arr[i]) + 1);
            else
                freq_map.put(arr[i], 1);
        }
        int ans = 0;

        for (int z : freq_map.keySet()) {
            // returns the set of all keys not their freq
            int x = freq_map.get(z);
            ans += (x - 1) * x / 2;
        }
        return ans;
    }

    public static long calculate2(int arr[], int n) {

        Arrays.sort(arr);

        int ans = 0, i = 0, j = 1;
        while (i < n && j < n) {

            while (i < n && j < n && arr[i] == arr[j]) {
                ans += j - i;
                j++;
            }
            i = j;
            j++;
        }
        return ans;
    }

}
