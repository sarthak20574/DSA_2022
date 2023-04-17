package com.company;

public class Maximum_Possible_Value {

    //Maximum Possible Value
    //https://practice.geeksforgeeks.org/problems/2d3fc3651507fc0c6bd1fa43861e0d1c43d4b8a1/1

    long maxPossibleValue(int n, int a[] ,int b[]) {

        // 4    / 4     /2


        long ans=0, pair=0, low=Integer.MAX_VALUE;


        for( int i=0; i<n; i++){

            long cur= b[i]/4;

            b[i]%=4;

            // System.out.println(a[i]+" : "+b[i] +" no= "+ cur+ " total= "+ (cur*4 * a[i]));

            ans+= cur*4 * a[i];

            cur= b[i]/2;

            pair+=cur;

            low= Math.min( low, a[i]);

            ans+= cur*2 * a[i];

            //System.out.println(a[i]+" : "+b[i] +" no= "+ cur+ " total= "+ (cur*2 * a[i]));

        }

        if( pair%2!=0) ans-= 2* low;

        // System.out.println(low);


        return ans;

    }

}
