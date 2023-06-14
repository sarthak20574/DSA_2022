package com.company.LeetCode_DailyChallenge;

import java.util.TreeMap;

public class Snapshot_Array {

    //1146. Snapshot Array
//https://leetcode.com/problems/snapshot-array/description/

    class SnapshotArray {
        int snap_id=0;
        TreeMap<Integer, Integer>[] m;
        public SnapshotArray(int length) {

            for( int i=0; i<length; i++){
                m[i]= new TreeMap<>();
                m[i].put(0,0);
                //initially values are 0
            }
        }

        public void set(int index, int val) {
            m[index].put(snap_id, val);
        }

        public int snap() {
            return snap_id++;
        }

        public int get(int index, int snap_id) {
            return m[index].floorEntry(snap_id).getValue();
        }
    }
}
