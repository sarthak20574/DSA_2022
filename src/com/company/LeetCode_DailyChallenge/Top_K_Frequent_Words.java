package com.company.LeetCode_DailyChallenge;

import java.util.*;

public class Top_K_Frequent_Words {

    //692. Top K Frequent Words
    //


    // 2 choices either take the cur no or don't take it not take= no of choices=n-1 but still have to choose r
    // if the no is selected then, n-1 choices remain and we can choose only r-1

    public List<String> topKFrequent(String[] words, int k) {

        int n= words.length;

        Map<String, Integer> m= new HashMap<>();

        for( int i=0; i<n; i++){
            m.put(words[i], m.getOrDefault(words[i],0)+1);
        }

        PriorityQueue<String> q= new PriorityQueue<>((a, b) -> (
                m.get(a) == m.get(b) ? b.compareTo(a): m.get(a) - m.get(b)
        ));

        for( String i: m.keySet()){
            q.add(i);
            if (q.size()>k){
                q.poll();
            }
        }

        List<String> ans= new ArrayList<>();

        for( int i=0; i<k;i++){
            ans.add(0,q.poll());
        }
        return ans;
    }

}
