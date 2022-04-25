package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Peeking_Iterator {

    class PeekingIterator implements Iterator<Integer> {
        List<Integer> list;
        public PeekingIterator(Iterator<Integer> iterator) {
            list= new ArrayList<>();

            while (iterator.hasNext()){
                list.add(iterator.next());
            }
        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            if(!list.isEmpty())return list.get(0);
            return -1;
        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            int ans;
            if( !list.isEmpty()){
                ans=list.get(0);
                list.remove(0);
                return ans;
            }
            return -1;
        }

        @Override
        public boolean hasNext() {
            return !list.isEmpty();
        }
    }
}
