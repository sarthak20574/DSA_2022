package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Earthquake_and_the_Paint_Shop {
    class alphanumeric {
        public String name;
        public int count;
        alphanumeric(String name, int count) {
            this.name = name;
            this.count = count;
        }
    };
    class Solution {
        alphanumeric[] sortedStrings(int N, String A[]) {


            Map<String, Integer> m= new HashMap<>();
            for( String x:A){
                m. put( x, m.getOrDefault(x, 0)+1);
            }

            alphanumeric[] ans= new alphanumeric[m.size()];

            int i=0;
            for( String x: m.keySet()){
                ans[i++]=new alphanumeric(x, m.get(x));
            }

            Arrays.sort( ans, (a, b)-> a.name.compareTo(b.name));

            return ans;

        }
    };

}
