package com.company.LeetCode_DailyChallenge;

import java.util.*;

public class Word_Ladder {

    //127. Word Ladder
    //https://leetcode.com/problems/word-ladder/description/
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Set<String> valid= new HashSet<>(wordList);
        Set<String> visited= new HashSet<>();

        int ans=0;

        Queue<String> q= new LinkedList<>();

        q.add(beginWord);
        visited.add(beginWord);


        if( valid.contains(endWord)==false) return 0;

        while( q.isEmpty()==false){

            int len= q.size();

            for( int i=0; i<len;i++){

                String cur= q.poll();
                // System.out.println(endWord.equals(cur)==true);

                if( endWord.equals(cur)==true) return ans+1;

                for( int j=0; j<cur.length(); j++){

                    char[] str= cur.toCharArray();
                    //try each adn every 26 character
                    for( int c=0; c<26; c++){
                        str[j]= (char)('a'+ c);
                        // System.out.println(str[j]);

                        String new_str= new String(str);
                        if( visited.contains(new_str)==false &&
                                valid.contains(new_str)==true){
                            q.add( new_str);
                            visited.add( new_str);
                        }
                    }
                }

            }

            ans++;
        }

        return 0;

    }


}
