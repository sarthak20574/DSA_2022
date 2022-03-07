package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    //Fractional Knapsack Problem
    //calculate the ratio value/weight for each item and sort
    // the item on basis of this ratio. Then take the item with the
    // highest ratio and add them until we can’t add the next item
    // as a whole and at the end add the next item as much as we can.

    public double getMaxValue(int[] weight, int[] values, int capacity) {
        int length = weight.length;
        Item[] items = new Item[length];

        for (int i = 0; i < length; i++) {
            items[i] = new Item(weight[i], values[i], i);
        }

        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return (int) (o2.cost - o1.cost);
            }
        });

        int totalValue = 0;
        int index = 0;
        while (index < length && capacity >= items[index].weight) {
            totalValue += items[index].value;
            capacity -= items[index].weight;
            index++;
        }
        if (index < length) {
            totalValue += capacity * items[index].cost;
        }

        return totalValue;
    }

    class Item {
        int weight;
        int value;
        double cost;

        int ind;//???

        public Item(int weight, int value, int ind) {
            this.weight = weight;
            this.value = value;
            this.ind = ind;
            this.cost = value / weight;
        }
    }

    //gfg solution in java but comaprato has to be in double so wrong answer
    double fractionalKnapsack(int W, Item arr[], int n) {
        Arrays.sort(arr, (a, b) ->
                b.value / b.weight/*(double)*/ - a.value / a.weight//(double)
        );

        int index = 0;
        int ans = 0;
        while (index < n && W >= arr[index].weight) {
            ans += arr[index].value;
            W -= arr[index].weight;
            index++;

        }

        if (index < n) {
            ans += (((double) W) * ((double) arr[index].value) / ((double) arr[index].weight));
        }

        return ans;
    }

    // in c++

    /*
    static bool comp( const Item &a, const Item &b){
        return (double) a.value/ a.weight > (double) b.value/b.weight;
    }

    double fractionalKnapsack(int W, Item arr[], int n)
    {
        sort( arr, arr+n, comp);
        double ans=0;

        for( int i=0; i<n ; i++){

            if( W>=arr[i].weight){
                ans+= arr[i].value;
                W-=arr[i].weight;
            }

            else{
                ans+=W*((double)arr[i].value/arr[i].weight);
                break;

            }

        }

        return ans;
    }

     */

}
