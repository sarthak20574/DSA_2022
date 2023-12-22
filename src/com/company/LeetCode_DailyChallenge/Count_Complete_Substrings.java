package com.company.LeetCode_DailyChallenge;

public class Count_Complete_Substrings {

    //2953. Count Complete Substrings
    //https://leetcode.com/problems/count-complete-substrings/
    //https://www.youtube.com/watch?v=kvJ4CTPzX74&t=2585s&ab_channel=AryanMittal

    public int countCompleteSubstrings(String w, int k) {

        int cur=1, ans=0, n=w.length();

        int[][] f= new int[n][26];

        for( int i=0; i<n; i++){

            if( i-1>=0){
                for( int j=0; j<26; j++){
                    f[i][j]= f[i-1][j];
                }
            }
            f[i][w.charAt(i)-'a']++;
        }

        int l=0;

        for( int i=0; i<n; i++){
            if(i-1>=0 && Math.abs(w.charAt( i-1)-w.charAt(i))>2) l=i;

            for( int j=1; j<=26; j++){

                int len= k*j;
                // 0 1 2 3 4

                if( i-len+1<l) break;
                boolean cu=true;
                for( int kk=0; kk<26 ; kk++){

                    int ff=f[i][kk];
                    if(i-len+1-1>=0 )
                        ff-=f[i-len+1-1][kk];

                    if( ff!=0 && ff!=k){
                        cu=false;
                        break;
                    }
                }
                if( cu) ans++;
            }
        }

        //System.out.println( Arrays.deepToString(f));


        return ans;
    }

}
