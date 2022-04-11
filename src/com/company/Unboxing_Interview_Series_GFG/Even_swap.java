package com.company.Unboxing_Interview_Series_GFG;

public class Even_swap {


    /*

//Even swap
//https://practice.geeksforgeeks.org/contest/interview-series-44/problems/
 vector <int> lexiographicallyLargest(vector <int> &a,int n)
        {
          // scan for all even or odd only containing subarray and then
          //just sort, to reduce complexity just store the starting and
          //the ending index in a list and then sort all of them at the end

          int i=0, j=0;

          while (j<n){

              if((a[i] & 1) == (a[j] & 1)){
                  while((a[i] & 1) == (a[j] & 1)){
                      //cout<<i<<j;
                  j++;
              }

          }
          // sort it in descending order
              // j is 1 index ahead of the only even/odd subarray
           // cout<<i<<j<<"out ";
             else{
               sort(a.begin()+i, a.begin()+j, greater<int>());
              i=j;
             }


              }
           sort(a.begin()+i, a.end(), greater<int>());
           return a;
        }
     */

}
