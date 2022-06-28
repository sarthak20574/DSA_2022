package com.company;

//Equivalent Sub-Arrays
//https://practice.geeksforgeeks.org/problems/equivalent-sub-arrays3731/1#
//https://www.youtube.com/watch?v=ceRJzjBrhPU

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Equivalent_Sub_Arrays {

    static int countDistinctSubarray(int arr[], int n) {

        Set<Integer> x= new HashSet<>();
        int ans=0;

        for( int i: arr){
            x.add( i);
        }

        Map<Integer, Integer> map =new HashMap<>();
        int r =0, l =0;

        boolean c1=true, c2=true;

        while (true){
            c1= false;
            c2=false;
            while (r<n ){
                //System.out.println();
                c1= true;
                if(map.size()==x.size()) break;
                map.put( arr[r], map.getOrDefault(arr[r], 0)+1);
                r++;
                // System.out.print(" loop 1: "+arr[r-1]);
                // System.out.print("  ans: "+ans);
                // System.out.print("  r: "+r);
                //  System.out.print("  l: "+l);
            }

            while (l<r){
                // System.out.println();
                c2= true;
                if(map.size()==x.size()){
                    ans+=n-r+1;
                }


                // System.out.print(" loop 2: "+arr[l]);
                //   System.out.print("  ans: "+ans);
                //   System.out.print("  r: "+r);
                //  System.out.print("  l: "+l);

                if( map.get(arr[l])==1){
                    map.remove(arr[l]);
                }
                else {
                    map.put(arr[l], map.get(arr[l])-1);
                }

                l++;

                if( map.size()!=x.size()) break;
            }
            if( c2 ==false && c1== false) break;
        }

        return ans;
    }
}
