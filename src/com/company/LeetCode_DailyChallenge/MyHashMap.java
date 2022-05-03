package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;

public class MyHashMap {

        int size=1000001;
        ArrayList<Integer> hashMap;

        public MyHashMap() {
            this.hashMap = new ArrayList<>(size);
            for (int i = 0; i < size ; i++) {
                hashMap.add(i, null);

            }
            System.out.println(hashMap.size());
        }

        public void put(int key, int value) {
            hashMap.add(key, value);
        }

        public int get(int key) {
            return hashMap.get(key);
        }

        public void remove(int key) {
            hashMap.set(key, null);
        }
    }

