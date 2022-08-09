package com.company.LeetCode_DailyChallenge;

public class Implement_Trie__Prefix_Tree_ {


//208. Implement Trie (Prefix Tree)
//https://leetcode.com/problems/implement-trie-prefix-tree/
// video= watch the Neet Code video

    class TrieNode{

        TrieNode[] children;
        boolean end;

        public TrieNode(){
            children= new TrieNode[26];
            end= false;
        }

    }

    class Trie {

        TrieNode root;
        public Trie() {

            root= new TrieNode();
        }

        public void insert(String word) {

            TrieNode cur= root;
            for( int i=0; i<word.length(); i++){
                char c= word.charAt(i);

                if( cur.children[c-'a']==null){
                    cur.children[c-'a']=new TrieNode();
                }

                cur= cur.children[c-'a'];
            }
            cur.end=true;
        }

        public boolean search(String word) {

            TrieNode cur= root;
            for( int i=0; i<word.length(); i++){
                char c= word.charAt(i);
                if( cur.children[c-'a']==null) return false;

                cur=cur.children[c-'a'];
            }

            return cur.end==true;

        }

        public boolean startsWith(String prefix) {

            TrieNode cur= root;
            for( int i=0; i<prefix.length(); i++){

                char c= prefix.charAt(i);

                if(cur.children[c-'a']==null) return false;
                cur=cur.children[c-'a'];
            }

            return true;
        }

    }
}
