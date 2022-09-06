package com.company;

import java.util.ArrayList;
import java.util.List;

public class Print_the_pattern {

    static List<String> pattern(int n){


        List<String> ans= new ArrayList<>();

        int a=0, i=1, j=n*(n+1);

        while(a<n){

            StringBuilder x= new StringBuilder();
            StringBuilder y= new StringBuilder();

            for( int k=0; k<n-a; k++){

                x.append(String.valueOf(i++)).append("*");
                y.append(new StringBuilder(String.valueOf(j--)).reverse()).append("*");
            }

            String add="-".repeat(a*2)+String.valueOf(x.append(y.reverse().subSequence(1, y.length())));

            // System.out.println(add);

            ans.add(add);
            a++;
        }
        return ans;
    }
}
