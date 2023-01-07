package com.company.LeetCode_DailyChallenge;

import java.util.*;

public class Minimum_Genetic_Mutation {


    //433. Minimum Genetic Mutation
    //https://leetcode.com/problems/minimum-genetic-mutation/description/

    public int minMutation(String start, String end, String[] bank) {

        Set<String> vis=new HashSet<>();
        Set<String> valid= new HashSet<>();

        // if end genen not in bank

        for( String x: bank){
            valid. add(x);
        }

        vis.add(start);


        int ans=0;
        Queue<String> q= new LinkedList<>();
        q.add(start );

        while( q.isEmpty()==false){

            int len= q.size();

            for( int i=0; i<len; i++){

                String x= q.poll();

                if(x.equals(end)==true) return ans;

                List<String> nigh= fn( x);

                for( String k: nigh){


                    if( vis.contains(k)==false && valid.contains(k)==true){
                        // System.out.println(k);
                        q. add(k);
                        vis.add( k);
                    }
                }
            }


            ans++;
        }

        return -1;
    }


    List<String> fn(String x){
        char[] k= {'A', 'C', 'G', 'T'};

        int n= x.length();
        List<String> ans=new ArrayList<>();

        for( int i=0; i<n; i++){
            char[] x_c= x.toCharArray();


            for( int l=0; l<4; l++){
                x_c[i]=k[l];
                ans. add( new String( x_c));
            }
        }


        return ans;
    }
}
