package com.company;

import java.util.ArrayList;

public class Generate_IP_Addresses {

    //Generate IP Addresses
    //https://practice.geeksforgeeks.org/problems/generate-ip-addresses/1
    //https://www.youtube.com/watch?v=61tN4YEdiTM&ab_channel=NeetCode

    public ArrayList<String> genIp(String s) {

        ArrayList<String> ans= new ArrayList<>();
        if( s.length()>12) return ans;

        fn( ans, "", 0, 0, s);

        return ans;
    }

    void fn( ArrayList<String> ans, String cur, int dots, int index, String s){

        if( dots>4) return;
        else if(dots==4 && index==s.length()){
            ans.add(cur.substring(0, cur.length()-1));// the last . is not to be added
        }
        else{

            for( int i= 1; i<4 && index+i<=s.length();i++){

                String new_str= s.substring(index, index+i);

                if( ( new_str.length()==1 || new_str.startsWith("0")==false) && Integer.parseInt(new_str)<256){
                    fn( ans, cur+new_str+".", dots+1, index+i, s);
                }
            }
        }

    }
}
