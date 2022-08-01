package com.company.LeetCode_DailyChallenge;

public class First_Bad_Version {



        /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

//278. First Bad Version
//https://leetcode.com/problems/first-bad-version/

//using (beg + end)/2 instead of mid= beg+(end-beg)/2 can lead to overflows as was the case this time

        public class Solution {
                public int firstBadVersion(int n) {


                        int beg= 1, end= n, mid, ans=-1;

                        while( beg<= end){
                                mid= (beg+(end-beg)/2);

                                if( isBadVersion(mid)==true){
                                        end= mid-1;
                                        ans= mid;
                                }
                                else{
                                        beg=mid+1;
                                }

                        }
                        return ans;
                }

                // just a fake function to stop the function not found error
                boolean isBadVersion( int n){
                        return true;
                }
        }


}
