package com.company;

public class AppendTheLastMNodesToTheBeginning {
    //Append the last M nodes to the beginning of the given linked list.

    // Find the first node of the last M nodes in the list, this node will be the
    // new head node so make the next pointer of the previous node as NULL and point
    // the last node of the original list to the head of the original list. Finally,
    // print the updated list




    //write the lenght function for the corner case
    public LinkedList.Node appendLastKNodes(LinkedList.Node head, int k){

        int length=5;
        if(k==length || k==0){
            return head;
        }

        int count=1;
        LinkedList.Node endNode =head;
        while (count!=k){
            endNode = endNode.next;
            count++;
        }
        //System.out.println(endNode.value);

        LinkedList.Node startNode=head;
        while (endNode.next!=null && endNode.next.next!=null){
            endNode=endNode.next;
            startNode=startNode.next;
        }
        if( endNode.next!=null)
        endNode.next.next=head;
        LinkedList.Node newHead= startNode.next;
        startNode.next=null;
        return newHead;
    }

    //new tail will be the (n-k)th and the head be the newhead be (n-k+1)
    //new tail's next=null and previous tail's next =

}
