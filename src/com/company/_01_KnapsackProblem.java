package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _01_KnapsackProblem {

    //naive problem, start traversing from the back and 2 options either include or don't include the object

    static int twoRaisedToN(int maxWeight, int weights[], int values[], int index_to_traverse){

        if( maxWeight ==0|| index_to_traverse ==0)
            return 0;

        //don't forget its not sorted so just because you encounter an element that whose weight
        //is bigger than the remaining weight doesn't mean that you can't come across an object of
        //lesser weight

        else if( maxWeight<weights[index_to_traverse-1])
            return twoRaisedToN(maxWeight, weights, values, index_to_traverse-1);

        return Math.max(twoRaisedToN(maxWeight, weights, values, index_to_traverse -1),
                values[index_to_traverse -1]+ twoRaisedToN(maxWeight - weights[index_to_traverse -1],
                        weights, values, index_to_traverse -1));
    }



    static int NintoK(int maxWeight, int weights[], int values[], int lenght){

        // to include the 0 case so +1....counting from 1, 1st obj starts at the index 1
        int[][] storage = new int[lenght+1][maxWeight+1];

        for (int i = 0; i < lenght+1; i++) {

            for (int weight = 0; weight < maxWeight+1; weight++) {

                if( i==0|| weight ==0) storage[i][weight]=0;

                    // don't forget this case....not weight-1 or weights[weight-1], its i-1...number of rows or objects
                else if(weights[i-1]>weight)
                    storage[i][weight]=storage[i-1][weight];

                else {
                    // i-1 means the our answer without the previous object , our previous answer
                    //System.out.println(i+" "+weight);
                    storage[i][weight]=Math.max(
                            storage[i-1][weight],
                            //value +fn(max_weight-weight...), not weight +fn(max_weight-weight...)
                            values[i-1]+ storage[i-1][weight-weights[i-1]]);
                }
            }
        }

//        System.out.println(Arrays.deepToString(storage));


                return storage[lenght][maxWeight];
    }




}
