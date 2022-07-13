package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class LRU_Cache {

    class LRUCache {

        //146. LRU Cache
        //https://leetcode.com/problems/lru-cache/
        //https://www.youtube.com/watch?v=S6IfqDXWa10&ab_channel=BackToBackSWE

        int n;
        Node head= new Node();
        Node tail= new Node();
        int cur_n;

        Map<Integer, Node> map;


        public LRUCache(int capacity) {

            n=capacity;
            cur_n=0;

            //connect head and the tail
            head.next= tail;
            tail.prev= head;

            map = new HashMap<>();
        }

        public int get(int key) {
            Node x= map.get(key);

            if( x!=null){

                delete( x);
                append(x);
                return x.val;
            }

            else{
                return -1;
            }
        }

        public void put(int key, int value) {

            //if present in lru, just update its pos

            if( map.containsKey(key)){

                Node x= map.get(key);

                x.val=value;
                delete(x);
                append(x);
            }
            else{

                if( cur_n==n){
                    int kk= tail.prev.key;
                    delete(tail.prev);
                    map.remove(kk);
                }
                else{
                    cur_n++;
                }

                Node neww= new Node();
                neww.key= key;
                neww.val= value;
                map.put( key, neww);
                append(neww);

            }
        }


        class Node{

            int key;
            int val;
            Node next;
            Node prev;
        }

        void delete(Node x){
            x.prev.next=x.next;
            x.next.prev= x.prev;
        }

        void append(Node h){

            h.next= head.next;
            h.prev= head;

            head.next=h;
            h.next.prev=h;
        }
    }
}
