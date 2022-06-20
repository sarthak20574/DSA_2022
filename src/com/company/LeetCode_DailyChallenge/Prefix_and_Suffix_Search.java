package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Prefix_and_Suffix_Search {


    //745. Prefix and Suffix Search
    //https://leetcode.com/problems/prefix-and-suffix-search/
    //https://www.youtube.com/watch?v=U7fIQ7qAeuE

    class WordFilter {

        class Trie{
            public Trie[] t;
            List<Integer> index;

            Trie(){
                t= new Trie[26];
                index= new ArrayList<>();
            }

            public void insert( String word, int i){

                // get the present root
                Trie temp = this;

                // traverse thge whole string
                // check if its already present if not create a new one, else update the precious root

                for( char x: word.toCharArray()){
                     if( temp.t[x-'a']== null){
                         temp.t[x-'a']= new Trie();
                     }
                     // update the root
                    temp= temp.t[x-'a'];
                     temp.index.add(i);
                }
            }

            public List<Integer> startsWith(String word){

                Trie temp= this;
                for( char x: word.toCharArray()){
                     if( temp.t[x-'a']== null){
                         return  new ArrayList<>();
                     }
                     temp= temp.t[x-'a'];
                }

                return temp.index;
            }
        }


        Trie suffix;
        Trie preffix;

        public WordFilter(String[] words) {
            suffix = new Trie();
            preffix= new Trie();

            for( int i=0; i< words.length; i++){
                preffix.insert( words[i], i);
                suffix.insert( new StringBuilder(words[i]). reverse().toString(), i);
            }
        }

        public int f(String prefix, String sufix) {

            List<Integer> x= preffix.startsWith(prefix);
           List<Integer> y= suffix.startsWith(new StringBuilder(sufix). reverse().toString());

           int i= x.size()-1;
           int j= y.size()-1;

           while (i>=0 && j>= 0){

               if(Objects.equals(x.get(i), y.get(j))) return x.get(i);
               else if((x.get(i)> y.get(j)) ) i--;
               else{
                   j--;
               }
           }
           return -1;
        }
    }

}
