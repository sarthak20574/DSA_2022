package com.company;

import java.util.Arrays;

public class Allocate_minimum_number_of_pages {
    // if the arr= { 12, 12, 12, 12} and the students= 4 then the min value is 12
    // if just students= 1 and arr= {10, 20, 30}, then the add all that will be the max= 10+20+30
    // so in {12, 34, 67, 90} for students= 2, min= 12 and max =12+ 34+ 67+ 90= 203
    // answer will lie between min and the max, so mid= low+high/2,
    // now take these pages and allocate it to 2 students such that
    // u don't allocate more than 107 because you want 107 to be your answer
    // 1-> 12+34, 2-> 34, 3-> 90 each shouldn't exceed 107 could allocate 3 students
    // but have 2 students so increase the barrier and now answer will lie between 108
    // and 203, now mid = 108 + 203 /2= 155  so now student 1->12+34+67 and 2-> 90
    // so 155 is one of the result, now for min binary search from 108 to 154
    // and mid = 131, 1-> 12+34+67 and 2-> 90 so now res= 131 now min = 108 and max= 130, mid =119
    //1->12+34+67 and 2-> 90
    //now 108 to 112 mid=110 , 1-> 12+34 and 2-> 67, 3-> 90 so now from 111 to 112, 1-> 12+34 and 2-> 67, 3-> 90
    //now 112 and 112, 1-> 12+34 and 2-> 67, 3-> 90
    // now 113 and 112, break


    static int findPages(int[] arr, int no_of_books, int no_of_students){

        //Arrays.sort(arr);

        if( no_of_books< no_of_students) return -1;
       //check if  the arr is not empty
        int low=arr[0], high=0, mid, ans = Integer.MAX_VALUE;

        //Arrays.sort(arr);
        for( int i=0 ; i<no_of_books; i++){
            high+=arr[i];
        }
        while (low<=high){
            mid=(high+low)/2;

            if( possible_to_allocate(arr,no_of_books, no_of_students,mid)){
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }

    private static boolean possible_to_allocate(int[] arr, int no_of_books, int no_of_students, int mid) {

        int total_pages_for_the_student=0, students_required=1;
        for ( int i =0 ; i< no_of_books; i++){
            if(arr[i]>mid) return false;

            if( arr[i]+total_pages_for_the_student<=mid){
                total_pages_for_the_student+=arr[i];
            }
            else {
                total_pages_for_the_student=arr[i];
                students_required++;
                if (no_of_students<students_required) return  false;
            }
        }
         return true;

    }


}
