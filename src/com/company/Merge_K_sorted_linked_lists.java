package com.company;
import com.company.LinkedList.Node;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Merge_K_sorted_linked_lists {

    //https://www.youtube.com/watch?v=ptYUCjfNhJY
    // using min heap
    // till then min heap is not empty then keep adding the head of the heap( min element)
    // then add the next element from the linked list from where the removed head belonged


    // gfg
    /*class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/
// a is an array of Nodes of the heads of linked lists
// and N is size of array a

    Node mergeKList(Node[]arr, int K) {

        PriorityQueue<Node> minHeap= new PriorityQueue<>(new NodeComparator());

        Node head= new Node(0);
        Node end= head;

        // add all the heads to the min heap

        for(int i=0; i<K; i++){
            // DF to check if the head is null
            if( arr[i]!=null)
                minHeap.add(arr[i]);
        }

        //DF return null if the heap is empty
        if(minHeap.isEmpty()) return null;

        while (!minHeap.isEmpty()){

            Node smallElement= minHeap.poll();
            end.next=smallElement;
            end=end.next;

            // add the next element to the minHeap from the small element
            // Df to check if there is actually an element left after the small element or null
            if( smallElement.next !=null)
                minHeap.add( smallElement.next);
        }
        return head.next;
    }

}
class NodeComparator implements Comparator<Node> {
    @Override
    public int compare(Node o1, Node o2) {
        // ascending order?
        if( o1.value>o2.value)  return 1;

        else if( o1.value<o2.value) return  -1;
        else return 0;
    }
}
