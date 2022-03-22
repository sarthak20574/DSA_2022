package com.company;

public class Smaller_on_Left {

    //https://practice.geeksforgeeks.org/problems/smaller-on-left20360700/1#
    //https://www.youtube.com/watch?v=3JDNMGFB1B4
    // binary search, so ned to get he left side sorted and get the immediate smaller/greater no can
    // be obtained
    //use set to check an element that is jsut smaller than the element at i



    //lower bound returns address of the element if 2 is passed thn gives a number
    // that is greater than the 2
    // kin 2,3,4 lower_bound(3) gives 4

    // if no nos are smaller than a number then it returns s.begin so we push -1
    // in  2 3 4 5 1 when we iterate over 3 we don't get any element that is just bigger than 3 so
    // it returns a 2.end or 2.next
    // so decrement the index and push_back it

    /*
    vector<int> Smallestonleft(int arr[], int n)
{
   vector<int> ans;
   set<int>s;
   for( int i=0 ; i< n; i++){
   auto index=s.lower_bound(arr[i]);
   if( index==s.begin()) ans.push_back(-1);

   else{
       index--;
       ans.push_back(*index);
   }
   s.insert(arr[i]);
}
return ans;
}
     */
}
