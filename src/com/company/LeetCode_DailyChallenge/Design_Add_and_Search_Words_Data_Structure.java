package com.company.LeetCode_DailyChallenge;

public class Design_Add_and_Search_Words_Data_Structure {

    //211. Design Add and Search Words Data Structure
//https://leetcode.com/problems/design-add-and-search-words-data-structure/description/



    class Node{
        boolean end;
        Node[] f;

        Node(){
            f= new Node[26];
        }
    }


    class WordDictionary {
        Node r;

        public WordDictionary() {
            r= new Node();
        }

        public void addWord(String w) {
            Node x=r;
            for( char c: w.toCharArray()){
                if( x.f[c-'a']==null){
                    x.f[c-'a']=new Node();
                }
                x=x.f[c-'a'];
            }
            x.end=true;
        }

        boolean fn( Node x, String w, int ind){

            for( int k=ind; k<w.length(); k++){
                int c=w.charAt(k);

                if( c!='.'){
                    if( x.f[c-'a']==null){
                        return false;
                    }
                    x=x.f[c-'a'];
                }
                else{
                    for( int i=0; i<26; i++){
                        if( x.f[i]!=null){
                            if(fn( x.f[i],w,k+1)) return true;;
                        }

                    }
                    return false;
                }

            }
            return x.end;
        }

        public boolean search(String w) {
            Node x=r;
            return fn( x, w, 0);


        }

    }
}
