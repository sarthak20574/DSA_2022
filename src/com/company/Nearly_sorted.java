package com.company;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Nearly_sorted {

    //https://practice.geeksforgeeks.org/problems/nearly-sorted-1587115620/1
    //https://www.youtube.com/watch?v=VCFJQURPD-4
    ArrayList<Integer> nearlySorted(int arr[], int num, int k) {
        ArrayList<Integer> ans= new ArrayList<>();
        PriorityQueue<Integer> x= new PriorityQueue<>();

        for( int i=0; i<num; i++){
            if( i<k){
                x.add(arr[i]);
            }
            else {
                x.add(arr[i]);
                ans.add(x.poll());
            }
        }

        while (!x.isEmpty()){
            ans.add(x.poll());
        }

        return ans;
    }

    //in cpp
    /*
    vector <int> nearlySorted(int arr[], int num, int k){

      vector<int> ans;
      priority_queue<int, vector<int>, greater<int>> minHeap;

      for( int i=0; i< num; i++){

          if( i<k){
              minHeap.push(arr[i]);
          }
          else{
              minHeap.push(arr[i]);
              ans.push_back(minHeap.top());
              minHeap.pop();
          }
      }

      while(minHeap.empty()==false){
          ans.push_back(minHeap.top());
          minHeap.pop();
      }
      return ans;
    }

     */

}
