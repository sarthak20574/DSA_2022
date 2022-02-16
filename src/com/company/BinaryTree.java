
// INCOMPLETE

//package com.company;
//
//import java.util.ArrayList;
//import java.util.Stack;
//
//public class BinaryTree {
//
//    class Node{
//         int data;
//         Node left;
//         Node right;
//
//         Node(int data){
//             this.data=data;
//         }
//    }
//
//    //Postorder Traversal (Iterative)
//    //Postorder (Left, Right, Root)
//    // go left left till you meet null then go right again left left if even right is null
//    // (so we have reached a leaf node) start printing, then check if its a right child of
//    // temp if not then it will have somethign to explore, so check if it has a right child
//    ArrayList<Integer> postOrder(Node root) {
//        ArrayList<Integer> ans = new ArrayList<>();
//
//        Stack<Node> nodeStack= new Stack<>();
//
//        if( root==null) return ans;
//
//        Node cur =null;
////        cur=nodeStack.peek();
////        ans.add(cur.data);
//        while (!nodeStack.isEmpty() || cur !=null){
//
//            if (cur != null) {
//                nodeStack.add(cur);
//                cur = cur.left;
//            }
//            else {
//                cur= nodeStack.peek();
//                cur=cur.right;
//
//                if( cur==null){
//                    cur=nodeStack.pop();
//                    ans.add(cur.data);
//                }
//
//            }
//
//
//        }
//
//    }
//
//
//}
