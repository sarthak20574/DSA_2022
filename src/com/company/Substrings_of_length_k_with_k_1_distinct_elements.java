package com.company;

import java.util.HashMap;
import java.util.Map;

public class Substrings_of_length_k_with_k_1_distinct_elements {

    static int countOfSubstrings(String S, int K) {

        int ans=0, i=0, j=K-1, n= S.length();

        Map<Character, Integer> m= new HashMap<>();
        for( int x=0; x<K-1; x++){
            m.put(S.charAt(x),m.getOrDefault(S.charAt(x),0)+1);
        }

        for( ; j<n; i++,j++){
            m.put(S.charAt(j),m.getOrDefault(S.charAt(j),0)+1);
            if( m.size()==K-1) ans++;
            m.put(S.charAt(i), m.get(S.charAt(i))-1);
            if( m.get(S.charAt(i))==0){
                m.remove(S.charAt(i));
            }
        }

        return ans;
    }
}
