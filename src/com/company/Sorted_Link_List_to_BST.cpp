
#include <bits/stdc++.h>

using namespace std;
 //https://practice.geeksforgeeks.org/problems/sorted-list-to-bst/1#
  //https://www.youtube.com/watch?v=yyNlZPOABA8

    TNode* sortedListToBST(LNode *head) {

        // convert to a vector
        vector<int> x;
        int n=0;

        while( head!=NULL){
            x.push_back(head->data);
            head=head->next;
            n++;
        }

        return fn(x,0, n-1);
    }

    TNode* fn( vector<int>& x, int l, int h ){

        if(l>h) return NULL;

        // 0 1 2 3 4 5     even => mid= 3 or (0+5+1)/2
        // 0 1 2 3 4 5 6    odd => mid= 3 or (0+6+1)/2

        int mid= (l+h+1)/2;

        TNode* t= new TNode(x[mid]);

        t->left=fn(x, l,mid-1);
        t->right=fn( x, mid+1, h);

        return t;


    }