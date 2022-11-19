package com.company;

public class Sum_of_Beauty_of_All_Substrings {

    //Sum of Beauty of All Substrings
    //https://practice.geeksforgeeks.org/problems/sum-of-beauty-of-all-substrings-1662962118/1

    public static int beautySum(String s) {

        int ans=0, n= s.length();
        int[] f= new int[26];

        for( int i=0; i<n; i++){
            f= new int[26];
            for( int j=i; j<n; j++){
                f[s.charAt(j)-'a']++;
                ans+=fn(f);
                //System.out.println(Arrays.toString(f));
            }
        }
        return ans;
    }


    static int fn( int[] arr){
        int minn= Integer.MAX_VALUE, maxx= Integer.MIN_VALUE;

        for( int i=0; i<26; i++){

            if( arr[i]!=0){
                minn= Math.min( minn, arr[i]);
                maxx= Math.max( maxx, arr[i]);
            }

        }
        // if( minn==Integer.MAX_VALUE || maxx== Integer.MIN_VALUE) return 0;
        return maxx-minn;
    }
}
