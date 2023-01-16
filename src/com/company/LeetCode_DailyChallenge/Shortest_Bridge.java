package com.company.LeetCode_DailyChallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Shortest_Bridge {


/*



//         Input: N = 5,
// Arr[] = {5, -4, 1, -3, 1}
// Output: 9

    // 1, 0, 1, -3, 1
    //


// Input: N = 6,
// Arr[]={-1000, -1000, -1000, 1000, 1000, 1000}
// Output: 9000

    long wineSelling(int arr[],int n){


        int ans=0;
        int cur=arr[0];
        for( int i=1; i<n; i++){
            ans += Math.abs( cur);

            cur+=arr[i];
        }

        return ans;
    }


    // 1= 1
    // 2= 2
    // 3= 5
    // 4= 11
    // 5= 3+2 , 2+ 3 - 3( the ones)
    // 5= 24
    // 6= 53


    public int numTilings(int n) {

        int[] arr= new int[n+1];

        if( n>0)
            arr[1]= 1;

        if( n>1){
            arr[2]= 2;
        }

        if( n>2){
            arr[3]= 5;
        }


        for( int i=4; i<n; i++){
            arr[i]= 2 * arr[i-1]+ arr[i-3];
        }

        return arr[n];
    }




    class Node{
        int data;
        Node next;

        Node( int data, Node next) {
            this. data= data;
            this next= next;
        }
    }

    Node fn( Node head){

        Node pos= new Node( 0, null);
        Node neg= new Node(0, null);

        Node pos_h= pos, neg_h= neg;
        Node temp= new Node( 0, head);
        // 1 -1 3 4 -5 -6 6 -6 7 8

        Node prev= temp, cur= temp.next;
        while(temp!=null){
            if( temp.data<0){
                neg.next= temp;
                neg= neg.next;
            }
            else{
                pos.next= temp;
                pos= pos.next;
            }
            temp= temp.next;
        }
        pos.next= null;
        neg.next= null;
        reverse(neg);

        // -1 -2 -3 -4 -5
        // head becomes the tail
        neg_h.next= pos;
        return neg;
    }

//
//    Input:
//    n: 4
//    k: 2
//    flights size: 3
//    flights: [[2,1,1],[2,3,1],[3,4,1]]
//    Output:
//            2
//    Explanation:
//    to visit 1 from 2 takes cost 1
//    to visit 2 from 2 takes cost 0
//    to visit 3 from 2 takes cost 1
//    to visit 4 from 2 takes cost 2,
//            2->3->4
//    So if Alex wants to visit city 4
//    from 2, he needs 2 units of money
//
//
//    Example 2:
//
//    Input:
//    n: 4
//    k: 3
//    flights size: 3
//    flights: [[2,1,1],[2,3,1],[3,4,1]]
//    Output: -1
//    Explanation:
//    There is no direct or indirect path
//    to visit city 2 and 1 from city 3

    int minimumCost(int[][] flights, int n, int k) {
        int[][] graph = new int[n][n];
        int[] dist = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        for(int[] flight : flights){
            int u = flight[0]-1,v = flight[1]-1,w = flight[2];
            graph[u][v] = w;
        }
        int source = k-1;
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(source);
        dist[source] = 0;
        while(!queue.isEmpty()){
            int u = queue.poll();
            for(int v = 0;v < n;v++){
                if(graph[u][v] != 0 && dist[v] > dist[u] + graph[u][v]){
                    dist[v] = dist[u] + graph[u][v];
                    queue.add(v);
                }
            }
        }
        int minCost = 0;
        for(int i = 0;i<n;i++){
            minCost = Math.max(minCost,dist[i]);
        }
        return minCost == Integer.MAX_VALUE ? -1 : minCost;

    }

    class Solution {
        class X{
            int i;
            int enq;
            int proc;

            X(int i, int e, int p){
                this.i=i;
                enq= e;
                proc=p;
            }
        }

        public int[] getOrder(int[][] tasks) {

            int n=tasks.length;


            X[] t= new X[n];

            for( int i=0; i<n; i++){
                t[i]= new X(i, tasks[i][0], tasks[i][1]);
            }

            Arrays.sort(t, (a, b)->a.enq-b.enq);
            PriorityQueue<X> pq= new PriorityQueue<>((a,b)->a.proc==b.proc?a.i-b.i:a.proc-b.proc);



        }


 */

}
