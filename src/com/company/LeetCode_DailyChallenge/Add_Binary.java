package com.company.LeetCode_DailyChallenge;

public class Add_Binary {

    //67. Add Binary
    //https://leetcode.com/problems/add-binary/description/

    public String addBinary(String a, String b) {

        StringBuilder ans= new StringBuilder();

        int n1=  a.length()-1;
        int n2=  b.length()-1;

        int s=0, c=0;

        while( n1>=0 && n2>=0){
            s=((a.charAt(n1) -'0') + (b.charAt(n2)-'0') + c)%2;
            c= ((a.charAt(n1) -'0') + (b.charAt(n2)-'0') + c)/2;
            ans.append(s);
            //ans.append(c);
            //System.out.println(s);
            n1--;
            n2--;
        }

        // System.out.println();

        while( n1>=0){
            s=((a.charAt(n1) -'0') + c)%2;
            c= ((a.charAt(n1) -'0') + c)/2;
            //System.out.println(s);
            ans.append(s);
            n1--;
        }
        // System.out.println();

        while( n2>=0){
            s=((b.charAt(n2) -'0') + c)%2;
            c= ((b.charAt(n2) -'0') + c)/2;
            //System.out.println(s);
            ans.append(s);
            n2--;
        }
        //System.out.println();


        if( c!=0){
            ans.append(c);
            //System.out.println(c);
        }

        //System.out.println();

        return ans.reverse().toString();
    }
}
