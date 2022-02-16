package com.company;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

public class LRU_Cache {

    HashSet<Integer> set;
    Deque<Integer> deque;
    int max_size;

    public LRU_Cache(int capacity){
        set= new HashSet<>();
        deque= new LinkedList<>();
        this.max_size=capacity;
    }

    void refer(int page_no){
        if(!set.contains(page_no)){

            // if filled queue, remove the last element and add new eleemnt to the front,
            // if not full just add the new element
            if( deque.size()==max_size){
                int last_ele=deque.removeLast();
                set.remove(last_ele);
            }
        }
        // if already contains jsut remove it and add to the start
        else {


        }

    }

}
