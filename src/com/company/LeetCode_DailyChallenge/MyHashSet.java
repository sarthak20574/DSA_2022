package com.company.LeetCode_DailyChallenge;

public class MyHashSet {

        //declare an array to keep a check on the elements found
        boolean hashSet[];

        // constraint = 0 to 10^6
        int size=1000001;

        public MyHashSet() {
            hashSet = new boolean[size];
        }

        public void add(int key) {
            hashSet[key]=true;
        }

        public void remove(int key) {
            hashSet[key]= false;
        }

        public boolean contains(int key) {

            return hashSet[key];
        }
    }

