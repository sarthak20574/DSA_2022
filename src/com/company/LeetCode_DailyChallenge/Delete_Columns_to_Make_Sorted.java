package com.company.LeetCode_DailyChallenge;

public class Delete_Columns_to_Make_Sorted {

    //944. Delete Columns to Make Sorted

 //https://leetcode.com/problems/delete-columns-to-make-sorted/description/
 public int minDeletionSize(String[] strs) {

  int n= strs[0].length(), ans=0;

  char prev='a';

  for( int i=0; i<n; i++){

   prev='a';

   for( String x: strs){

    if( prev>x.charAt(i)){
     ans++;
     break;
    }
    prev= x.charAt(i);
   }
  }

  return ans;
 }
 }
