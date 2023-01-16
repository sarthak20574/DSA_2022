package com.company.LeetCode_DailyChallenge;

import java.util.*;

public class Lexicographically_Smallest_Equivalent_String {


    class Solution {

        //1061. Lexicographically Smallest Equivalent String
        //https://leetcode.com/problems/lexicographically-smallest-equivalent-string/description/

        Set<List<Character>> componeents;

        public String smallestEquivalentString(String s1, String s2, String baseStr) {


            componeents= new HashSet<>();

            Map<Character,HashSet<Character>> g= new HashMap<>();


            int n= s1.length();
            for( int i=0; i<n; i++){
                if( g.get(s1.charAt(i))==null)
                    g.put(s1.charAt(i),new HashSet<>());

                g.get(s1.charAt(i)).add(s2.charAt(i));


                if( g.get(s2.charAt(i))==null)
                    g.put(s2.charAt(i),new HashSet<>());

                g.get(s2.charAt(i)).add(s1.charAt(i));
            }

            List<Character> chars= new ArrayList<>();

            for( char x: g.keySet()){
                chars.add(x);

                // System.out.print(x+": ");
                // for( char xxx: g.get(x)){
                //     System.out.print(xxx+" ");
                // }
                // System.out.println();
            }

            Set<Character> vis= new HashSet<>();

            for( char c: chars){

                if( vis.contains(c)==false){
                    List<Character> neww= new ArrayList<>();
                    neww.add(c);

                    dfs(c, g,neww, vis );
                    componeents.add(neww);


                    System.out.println(neww.toString());
                }
            }


            Map<Character, Character> ans= new HashMap<>();

            for( List<Character> x: componeents){



                char minn= 'z';
                for( char xx: x){
                    // System.out.println(xx);
                    minn= (char) Math.min(minn, xx);
                }
                //    System.out.println();


                for( char xx: x){
                    ans.put(xx, minn);
                }
            }

            StringBuilder ret= new StringBuilder();
            for( char c : baseStr.toCharArray()){
                ret.append(ans.getOrDefault(c, c));
            }
            return ret.toString();


        /*
         p=m m=p
         a=o o=a
         r=k  k=r

         e=i  i=e
         r=s s=r

         p = 1
         m = 1

         a


         r k s



        */
        }

        void dfs(char c, Map<Character, HashSet<Character>> g,
                 List<Character> cur , Set<Character> vis){

            vis.add(c);

            for( char i: g.get(c)){

                if( vis.contains(i)==false){
                    cur.add(i);
                    dfs(i, g, cur, vis);
                }
            }

        }


    }

}
