package com.company.LeetCode_DailyChallenge;

public class Element_Appearing_More_Than_25_In_Sorted_Array {

    //1287. Element Appearing More Than 25% In Sorted Array
    //https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/description/

    // must see this soln
    //https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/solutions/451286/java-binary-search/

    public int findSpecialInteger(int[] arr) {

        int c=0, n= arr.length, p=arr[0];

        for( int i=0; i<n; i++){
            if(p==arr[i]){
                c++;
            }
            else{
                p=arr[i];
                c=1;
            }
            if( c>n/4) return p;
        }

        return 0;
    }
}
