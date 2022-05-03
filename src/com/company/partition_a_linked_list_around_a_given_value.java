package com.company;

public class partition_a_linked_list_around_a_given_value {
    //https://practice.geeksforgeeks.org/problems/partition-a-linked-list-around-a-given-value/1#
    /*


struct Node* partition(struct Node* head, int x) {
     Node* tempSmall= new Node(-1);
    Node* tempEqual= new Node(-1);
    Node* tempBigg= new Node(-1);


    Node* smallPtr= tempSmall;
    Node* equalPtr= tempEqual;
    Node* bigPtr= tempBigg;

    while( head){

        if( head->data<x){
            smallPtr->next=head;
            smallPtr=smallPtr->next;
        }
        else if( head->data== x){
            equalPtr->next= head;
            equalPtr= equalPtr->next;
        }
        else{
            bigPtr->next= head;
            bigPtr= bigPtr->next;
        }

        head= head->next;
    }

    // DF to put the last value as NULL
    bigPtr->next= NULL;

 equalPtr->next= tempBigg->next;
    smallPtr->next= tempEqual->next;

    return tempSmall->next;
}
     */
}
