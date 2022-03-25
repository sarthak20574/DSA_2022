package com.company;

public class Swap_Kth_nodes_from_ends {
    //https://practice.geeksforgeeks.org/problems/swap-kth-node-from-beginning-and-kth-node-from-end-in-a-singly-linked-list/1
    /*
Node *swapkthnode(Node* head, int n, int k)
{
   if( k>n) return head;

   else if(k==(n-k+1)) return head;

   Node *first=head, *fir_prev=NULL;

   for( int i=1 ; i< k; i++){

       fir_prev= first;
       first=first->next;
   }

   Node *sec_prev= NULL, *second= head;
   for( int i=1; i<n-k+1; i++){

       sec_prev= second;
       second= second-> next;
   }

  if( fir_prev!=NULL){
      fir_prev->next= second;
  }

  if( sec_prev!=NULL){
      sec_prev->next= first;
  }

Node *temp= first->next;
first->next=second->next;
second->next=temp;


if(k==1) head=second;
if(k==n)head= first;
return head;

}
     */
}
