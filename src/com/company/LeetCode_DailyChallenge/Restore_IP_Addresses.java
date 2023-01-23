package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Restore_IP_Addresses {

    //93. Restore IP Addresses
    //https://leetcode.com/problems/restore-ip-addresses/description/

    List<String> ans;

    public List<String> restoreIpAddresses(String s) {

        ans= new ArrayList<>();

        fn(s, 0, s.length(), 0 , new StringBuilder(),
                new StringBuilder());

        return ans;
    }

    void fn(String s, int i, int n, int pts, StringBuilder cur,
            StringBuilder no){

        if( pts>3) return;

        if( no.toString().equals("")==false &&
                Integer.parseInt(no.toString())>255) return;

        if( i==n && pts==3 && no.toString().equals("")==false ){

            StringBuilder neww= new StringBuilder(cur);

            if( no.length()>1 && no.charAt(0)=='0') return;

            neww.append(new StringBuilder(no) );
            ans.add( neww.toString() );
            return;
        }

        if( i>=n) return;

        // either put a dot or add to the previous no


        StringBuilder neww= new StringBuilder(cur);

        StringBuilder noo= new StringBuilder(no);
        noo.append(s.charAt(i) );
        fn(s, i+1, n, pts, neww, noo );



        //put a dot

        //should have atleast 1 digit
        if( no.toString().equals("")==false ){

            StringBuilder newww= new StringBuilder(cur);

            if( no.length()>1 && no.charAt(0)=='0') return;

            newww.append( new StringBuilder(no) );
            newww.append(".");

            StringBuilder x= new StringBuilder();
            x.append(s.charAt(i));

            fn(s, i+1, n, pts+1, newww, x);
        }
    }


}
