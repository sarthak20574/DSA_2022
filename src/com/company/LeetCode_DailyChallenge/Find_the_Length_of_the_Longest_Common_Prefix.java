package com.company.LeetCode_DailyChallenge;

public class Find_the_Length_of_the_Longest_Common_Prefix {

    //3043. Find the Length of the Longest Common Prefix
    //3043. Find the Length of the Longest Common Prefix
    //https://leetcode.com/problems/find-the-length-of-the-longest-common-prefix/
    //https://leetcode.com/problems/find-the-length-of-the-longest-common-prefix/solutions/4744503/explained-simple-trie/



    // or just store all the prefixes in a set of arr1 and then traverse over the prefixes of each element of arr2 to see if any of them
    // is already in the set



    class Node{
        Node[] ch;

        Node(){
            this.ch= new Node[10];
        }
    }


    Node root;

    void add( int x){

        Node cur= root;
        for( char c: String.valueOf(x).toCharArray()) {
            // System.out.println((x%10)+" "+((x%10)-'0') );

            int rem= c-'0';
            if(cur.ch[rem]==null) cur.ch[rem]= new Node();
            cur= cur.ch[rem];
            // x/=10;
        }
    }

    int ev(int x){

        Node cur= root;
        int ans=0;

        for( char c: String.valueOf(x).toCharArray()){
            int rem= c-'0';

            if( cur.ch[rem]!=null){
                cur=cur.ch[rem];
                ans++;
                // System.out.println( rem);
            }
            else break;

            // x/=10;
        }

        return ans;
    }


    public int longestCommonPrefix(int[] arr1, int[] arr2) {

        root= new Node();

        int ans=0;

        for( int i: arr1){
            add(i);
        }

        for( int i: arr2){
            ans= Math.max( ans, ev(i));
        }

        return ans;
    }
}
