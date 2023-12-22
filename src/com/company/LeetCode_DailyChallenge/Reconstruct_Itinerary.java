package com.company.LeetCode_DailyChallenge;

import java.util.*;

public class Reconstruct_Itinerary {

    //332. Reconstruct Itinerary
    //https://leetcode.com/problems/reconstruct-itinerary/description/?envType=daily-question&envId=2023-09-14
    // see neetcode's vid
    //https://leetcode.com/problems/reconstruct-itinerary/solutions/78768/short-ruby-python-java-c/?envType=daily-question&envId=2023-09-14

    List<String> ans= new ArrayList<>();
    Map<String, Queue<String>> m= new HashMap<>();

    public List<String> findItinerary(List<List<String>> t) {


        for( List<String> l: t){

            if( m.containsKey(l.get(0))==false ){
                m.put(l.get(0), new PriorityQueue<>());
            }
            m.get(l.get(0)).add(l.get(1));
        }


        fn("JFK" );

        return ans;
    }

    void fn(String c ){
        while( m.containsKey(c) && m.get(c).isEmpty()==false){
            fn( m.get(c).poll());
        }

        ans.add(0, c);
    }

}
