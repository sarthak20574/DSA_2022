package com.company;

public class Floyd_tortoise_Hare {

    //Floyd’s Cycle-Finding Algorithm
    //Traverse linked list using two pointers.
    //Move one pointer(slow_p) by one and another pointer(fast_p) by two.
    //If these pointers meet at the same node then there is a loop.
    // If pointers do not meet then linked list doesn’t have a loop.
    boolean detectCyclesUsingFloyd(LinkedList.Node head){

        LinkedList.Node slow= head;
        LinkedList.Node fast= head;

        while ( fast!= null && fast.next!= null){

            slow= slow.next;
            fast= fast.next.next;

            if( slow==fast){
                return  true;
            }
        }
        return false;
    }

    //removing the cycle
    //after finding that the cycle exist put one of the hare/tortoise to point ot the head and then
    //increment both the pointer one by one till their .nexts are equal then set the pointer to null

    void removeLoop(LinkedList.Node head){

        // If list is empty or has only one node
        // without loop
        if (head == null || head.next == null)
            return;

        LinkedList.Node slow=head;
        LinkedList.Node fast= head;

        while ( fast!= null && fast.next!=null){

            fast= fast.next.next;
            slow= slow.next;

            if (fast == slow) {
                break;
            }
        }

        if (fast==slow){
            fast= head;
            if( slow!= fast){
                while( fast.next!= slow.next){
                    fast= fast.next;
                    slow=slow.next;
                }
                slow.next= null;
            }
            /* This case is added if fast and slow pointer meet at first position. */
            else {
                while (slow.next!=fast){
                    slow=slow.next;
                }
                slow.next=null;
            }
        }
    }
}
