package com.company;

import java.util.Arrays;
import java.util.List;

public class SortingAnArrayOfLargeNumbers {

    //If lengths of two strings are different, then we need to compare lengths to decide sorting order.
    //If Lengths are same then we just need to compare both the strings in lexicographically order.
    //Assumption : There are no leading zeros.

    //https://www.geeksforgeeks.org/sort-array-large-numbers/


    public static List<String> bigSorting(List<String> unsorted) {

        String[] ans= unsorted.toArray(new String[0]);
        Arrays.sort(ans,(left, ryt) -> {
            if (left.length() != ryt.length()) {
                return left.length() - ryt.length();
            }
            return left.compareTo(ryt);
        });

        return List.of(ans);

    }


}