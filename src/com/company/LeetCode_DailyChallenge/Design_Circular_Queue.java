package com.company.LeetCode_DailyChallenge;

public class Design_Circular_Queue {

    class MyCircularQueue {

        //622. Design Circular Queue
        //https://leetcode.com/problems/design-circular-queue/description/

        int[] queue;
        int front, end, size, cur_size;
    public MyCircularQueue(int k) {
            queue= new int[k];
            front=0;
            end=-1;
            size= k;
            cur_size=0;
        }

        // void it(){
        //     for( int x: queue){
        //         System.out.print(x);
        //     }
        //      System.out.println();
        // }

        public boolean enQueue(int value) {

            // it();

            if( isFull()==true) return false;

            end= (end+1)%size;
            queue[end]=value;
            cur_size++;

            return true;
        }

        public boolean deQueue() {

            if( isEmpty()==true) return false;

            front= (front+1)%size;
            cur_size--;
            return true;

        }

        public int Front() {

            if( isEmpty()==true) return -1;
            return queue[front];
        }

        public int Rear() {

            if( isEmpty()==true) return -1;
            return queue[end];
        }

        public boolean isEmpty() {

            return cur_size==0;

        }

        public boolean isFull() {
            return cur_size==size;
        }
    }
}
