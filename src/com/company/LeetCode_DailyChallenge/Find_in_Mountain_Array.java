package com.company.LeetCode_DailyChallenge;

public class Find_in_Mountain_Array {

    //1095. Find in Mountain Array
    //https://leetcode.com/problems/find-in-mountain-array/?envType=daily-question&envId=2023-10-12

//    public int findInMountainArray(int t, MountainArray m) {
//
//        // peak
//        int n=m.length(), peak=-1, beg=0, end= n-1;
//
//
//        while(beg<=end){
//
//            int mid= beg+ (end-beg)/2;
//            if( mid+1<n){
//                if( m.get(mid)<m.get(mid+1)){
//                    beg=mid+1;
//                    //peak=mid+1;
//                }
//                else{
//                    peak=mid;
//                    end= mid-1;
//                }
//            }
//            else {
//
//                if(  m.get(mid-1)< m.get(mid)){
//                    beg=mid+1;
//                    peak=mid;
//                }
//                else{
//                    // peak=mid;
//                    end= mid-1;
//                }
//
//            }
//        }
//
//        int ans=Integer.MAX_VALUE;
//
//        if( m.get(peak)==t) ans= peak;
//
//        beg=0; end= peak-1;
//
//
//        while(beg<=end){
//
//            int mid= beg+ (end-beg)/2;
//            if(t==m.get(mid)){
//                ans= Math.min(ans, mid);
//                end= mid-1;
//            }
//            else if(t<m.get(mid)){
//                end= mid-1;
//            }
//            else{
//                beg=mid+1;
//            }
//        }
//
//        beg=peak; end= n-1;
//
//
//        while(beg<=end){
//
//            int mid= beg+ (end-beg)/2;
//            if(t==m.get(mid)){
//                ans= Math.min(ans, mid);
//                end= mid-1;
//            }
//            else if(m.get(mid)>t){
//                beg= mid+1;
//            }
//            else{
//                end=mid-1;
//            }
//        }
//
//        return ans==Integer.MAX_VALUE?-1:ans;
//    }

}
