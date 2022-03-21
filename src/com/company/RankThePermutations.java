package com.company;

public class RankThePermutations {
    //https://www.youtube.com/watch?v=2VIxVd50lB4
    // if word = boat
    // then
    //abot
    //abto
    //aobt
    //aotb
    //atbo
    //atob
    //baot
    //bato
    //boat


    // seeing abot
    //here fixing a we can fill next in 3! ways
    //then fix b we need it so now, next is ba, so next 2 can be filled in 2! ways
    // next we have bo fine next boa fine next boat done
    // so we get 3!+2!+1= 6+2+1=9th

    // trick in b o a t
    // how many letters in that are smaller than b. 1, then ,letter to the right of o smaller than o=1,
    // similarly smaller than a=0, and samller than t=0
    //so now we get 1 1 0 0, factorial it....get  (1*3!+ 1*2!+ ...)=8 so there are words befreo the letter boat


    // for m o t h e r..... in sorted its e h m o r t........like all letter that are "smaller" than m not bigger
    // we get 2 2 3 1 0 0


    // in this problem we have to return 0 if there are any repeating letters
    //https://practice.geeksforgeeks.org/problems/rank-the-permutations2323/1#
  /*
  int rank(string S){

        long long int  n= S.size();

        unordered_map<int, int>mp;
        for( int i=0 ; i<n ;i ++){
            mp[S[i]]++;
        }

        for( auto x:mp){
            if( x.second>1){

                return 0;
            }
        }

        long long int  fac[n+1]={0};
        fac[0]=1;

        for( int i=1; i<n; i++){
            fac[i]= (fac[i-1]*i)%1000003 ;
        }


        long long int  rank[n]= {0};
       for( int i=0 ; i< n-1; i++){
           long long int  count=0;

           for( int j=i+1; j<n; j++){

               if(S[i]>S[j])(count++)%1000003;
           }
           rank[i]=(count)%1000003 ;

       }

       long long int ans=0;
       for( int i=0 ; i< n ; i++){
           ans+=(fac[n-i-1]*rank[i])%1000003 ;

       }

       return (ans+1)%1000003 ;
    }
   */
}
