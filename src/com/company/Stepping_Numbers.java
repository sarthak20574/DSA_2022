package com.company;

import java.util.ArrayList;
import java.util.List;

public class Stepping_Numbers {

    //Stepping Numbers
    //https://practice.geeksforgeeks.org/problems/stepping-numberswrong-output1813/1
    //https://www.youtube.com/watch?v=h-QfDR_75ZY&ab_channel=Leetforces

    int steppingNumbers(int n, int m){

        List<Integer> ans=new ArrayList<>();

        if (n==0) ans. add(0);

        for(int i=1; i<=9; i++){
            fn( i,n, m, ans);
        }

        return ans.size();
    }



    void fn( int cur, int n, int m, List<Integer> ans){

        if( cur>m) return;

        else if(n<= cur && cur<=m) ans.add( cur);

        int lastdigit=cur%10;


        if(lastdigit!=0)
            fn( cur*10+lastdigit-1, n,m,ans);

        if(lastdigit!=9)
            fn( cur*10+lastdigit+1, n,m,ans);
    }
}
