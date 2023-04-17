package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Simplify_Path {

    //71. Simplify Path
    //https://leetcode.com/problems/simplify-path/
    // see neetcode's code

    public String simplifyPath(String path) {

        StringBuilder ans= new StringBuilder();

        String[] x= path.split("/");
        int double_dots=0;

        int n= x.length-1;

        while( n>=0){
            String i= x[n--];
            if( i.equals("") || i.equals(".")) continue;
            else if( i.equals(".."))double_dots++;
            else if (double_dots>0){
                double_dots--;
            }
            else {
                StringBuilder cur= new StringBuilder(i);
                cur.reverse();
                ans.append(cur);
                // if( ans.charAt(ans.length()-1)!='/')
                ans.append("/");
            }
        }

        return ans.length()==0?"/":ans.reverse().toString();
    }


    
}
