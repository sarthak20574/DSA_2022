package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Stamping_The_Sequence {

    //936. Stamping The Sequence
    //https://www.youtube.com/watch?v=EtalsGoNrBI&ab_channel=AlgorithmsMadeEasy

    public int[] movesToStamp(String stamp, String target) {

        char[] tar= target.toCharArray();
        char[] sta= stamp.toCharArray();
        int remain=0;
        List<Integer> ans= new ArrayList<>();
        boolean[] visited= new boolean[tar.length];

        while( remain!=tar.length){
            boolean changed=false;

            for( int i=0; i<=tar.length-sta.length; i++){

                if( visited[i]==false && isReplasable(i,sta,tar)){
                    remain=replace(i,tar,sta.length, remain);
                    changed= true;
                    ans.add( i);
                    visited[i]= true;
                }

                if( remain==tar.length) break;
            }

            if(changed==false){
                return new int[0];
            }
        }

        int[] ret= new int[ans.size()];
        for( int i=0, k=ans.size()-1; i<ans.size(); i++, k--){
            ret[i]= ans.get(k);
        }
        return ret;
    }
    boolean isReplasable(int i,char[] sta,char[] tar){

        for( int j=0; j<sta.length; j++){
            if(tar[i+j]!='?' && sta[j]!=tar[i+j]) return false;
        }

        return true;

    }

    int replace(int pos,char[] tar,int len, int remain){

        for( int i=0; i<len; i++){
            if( tar[i+pos]!='?'){
                remain++;
                tar[i+pos]='?';
            }
        }

        return remain;
    }

}
