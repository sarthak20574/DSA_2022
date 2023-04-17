package com.company;

import java.util.ArrayList;




public class Find_anagrams_in_linked_list {
    static class Node
    {
        char data;
        Node next;

        Node(char x){
            data = x;
            next = null;
        }
    }

    public static ArrayList<Node> findAnagrams(Node head, String s) {

        int n= s.length();

        StringBuilder x= new StringBuilder();

        Node t= head;

        while( t!=null){
            x.append(t.data);
            t=t.next;
        }

        int[] c1= new int[26];
        int[] c2= new int[26];

        for(char c: s.toCharArray() ){
            c1[c-'a']++;
        }

        if( x.length()<n)return new ArrayList<>();

        int i=0;
        for( ; i<n; i++){
            c2[x.charAt(i)-'a']++;
        }

        ArrayList<Integer> ind=new ArrayList<>();
        if( eq( c1, c2)) {

            ind.add(0);
        }

        while( i<x.length()){

            c2[x.charAt(i)-'a']++;
            c2[x.charAt(i-n)-'a']--;

            if( eq(c1,c2)){

                if(ind.isEmpty()==false && i- ind.get(ind.size()-1)<=n){

                }
                else {
                    ind.add(i);
                }
            }
            i++;
        }


        ArrayList<Node> ans= new ArrayList<>();

        for( int k: ind){
            Node neww= new Node('x');
            Node h= neww;
            for( int l=0; l<n; l++){
                h.next= new Node(x.charAt(k+l));
                h= h.next;
            }
            ans.add(neww.next);
        }
        return ans;

    }


    static boolean eq(int[] a, int[] b){

        for( int i=0; i<26; i++){

            if( a[i]!=b[i]) return false;
        }
        return true;
    }

}
