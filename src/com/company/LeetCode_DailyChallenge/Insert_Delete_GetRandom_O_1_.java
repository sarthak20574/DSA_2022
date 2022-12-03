package com.company.LeetCode_DailyChallenge;

import java.util.*;

public class Insert_Delete_GetRandom_O_1_ {

    // 380. Insert Delete GetRandom O(1)
    //https://leetcode.com/problems/insert-delete-getrandom-o1/description/

    class RandomizedSet {

        Map<Integer, Integer> index;
        List<Integer> arr;
        Random rand;


        public RandomizedSet() {
            index= new HashMap<>();
            arr= new ArrayList<>();
            rand= new Random();
        }

        public boolean insert(int val) {
            if( index.containsKey(val)){
                return false;
            }
            else{
                index.put(val, arr.size());
                arr.add(val);
                return true;
            }
        }

        public boolean remove(int val) {
            if( index.containsKey(val)){

                int ind=index.get(val);
                index.remove(val);

                //overwrite the postion of the current element with the last element of the list then delete the last element

                if( ind!=arr.size()-1){
                    int temp=arr.get(arr.size()-1);
                    arr.set(ind, temp);
                    index.put(temp, ind);
                }

                arr.remove(arr.size()-1);


                return true;
            }
            else{
                return false;
            }
        }

        public int getRandom() {

            int ind= rand.nextInt(arr.size());
            return arr.get(ind);

        }
    }


}
