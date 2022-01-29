package com.company;

import java.util.HashSet;

public class substringOfString {

    public void method1(String string){
        int length= string.length();
        HashSet<String> set= new HashSet<>();
        String ans="";
        int n=0 ;
        int c= 0 ;
        for ( int ii= 0 ; ii<length; ii++) {
            for (int i= 0; i< length; i++){
                ans="";
                ans+=string.charAt(i);
                //System.out.println(ans);
               // c++;
                set.add(ans);
                for( int j= 0; j<length;j++){
                    ans+=string.charAt(j);
                    //System.out.println(ans);
                    //c++;
                    set.add(ans);
                }
            }
        }

        int count= 0;
        for (String x:set){
            count++;
            System.out.println(x);
        }
        System.out.println("Count:"+count);
    }

}
