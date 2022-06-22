package com.company;

public class Largest_BST {

    //Largest BST gfg
    //https://www.youtube.com/watch?v=4fiDs7CCxkc
    //https://practice.geeksforgeeks.org/problems/largest-bst/1

    class Node {
     int data;
     Node left, right;
     public Node(int d) {
         data = d;
         left = right = null;
     }
 }
    static class minMax{
        int len;
        int min;
        int max;
        boolean isBst;

        public minMax(){
            len=0;
            min= Integer.MAX_VALUE;
            max=Integer.MIN_VALUE;
            isBst=true;
        }
    }
    static int largestBst(Node root)
    {
        return fn(root).len;
    }

    public static minMax fn(Node root){

        if( root== null){
            return new minMax();
        }

        minMax ryt=  fn( root.right);
        minMax lft= fn( root.left);

        if( ryt.isBst==false || lft.isBst==false || root.data<=lft.max || root.data>=ryt.min){
            minMax x= new minMax();
            x.isBst=false;
            x.len= Math.max( ryt.len, lft.len);
            return x;
        }

        minMax x= new minMax();
        //System.out.println(root.data);
        x.len= 1+ ryt.len+ lft.len;
        x.isBst=true;
        x.min=root.left!=null? lft.min: root.data;
        x.max= root.right!=null? ryt.max: root.data;

        return x;
    }

}
