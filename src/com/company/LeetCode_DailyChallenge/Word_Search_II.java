package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Word_Search_II {

    //212. Word Search II
    //https://leetcode.com/problems/word-search-ii/description/
    // see Neetcode

    class TrieNode{

        TrieNode[] children= new TrieNode[26];
        String c;
    }

    TrieNode fillTrie( String[] words){

        TrieNode root= new TrieNode();

        for( String x: words){

            TrieNode cur= root;

            for( char a: x.toCharArray()){
                if( cur.children[a-'a']==null){
                    cur.children[a-'a']= new TrieNode();
                }
                cur= cur.children[a-'a'];
            }
            cur.c= x;
        }

        return root;
    }
    public List<String> findWords(char[][] board, String[] words) {

        List<String> ans= new ArrayList<>();

        TrieNode trie= fillTrie(words);

        int n=board.length, m=board[0].length;




        for( int i=0; i< n; i++){
            for( int j=0; j< m; j++){
                fn(board, trie,i, j,n,m, ans);
            }
        }

        return ans;
    }


    void fn(char[][] board, TrieNode root, int i, int j,
            int n, int m, List<String> ans){

        // visited or not in trie
        if( board[i][j]=='#' || root.children[ board[i][j]-'a']==null){
            return;
        }

        // else move root there
        root= root.children[ board[i][j]-'a'];

        // check if we have reached the end of a word
        if( root.c!= null){
            ans.add(root.c);
            //delete the word but don't return becasue therer could be words like app and apple
            root.c= null;
        }

        int[][] dir={{0,1}, {0,-1}, {1,0}, {-1,0}};

        //mark as visited

        char present=  board[i][j];
        board[i][j]='#';

        for( int k=0; k<4; k++){

            int x= i+dir[k][0];
            int y= j+ dir[k][1];

            if(x>=0 && y>=0 && x< n && y<m){

                //System.out.println(word.charAt(cur));
                fn(board, root,x, y,n,m, ans);

            }
        }

        board[i][j]=present;
    }
}
