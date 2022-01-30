package com.company;

public class BubbleSort {

    //swap the adjacent elements if they are not in order,pushing the greatest element to the right most index

    public static int shouldPunish (int roll[], int marks[], int length, double avg)
    {

        double sum=0;
        int no_of_swaps=0;

        for(int i=0 ; i< length; i++){
            sum+=marks[i];
        }


        for( int i=0 ; i< length-1; i++){

            for( int j=0; j<length-1-i;j++){

                if( roll[j]>roll[j+1]){

                    no_of_swaps+=2;
                    int trash=roll[j];
                    roll[j]= roll[j+1];
                    roll[j+1]=trash;
                }
            }
        }

        //System.out.println(no_of_swaps);
        //System.out.println(Arrays.toString(roll));

        //calculate avg

        if( ((double)(sum-no_of_swaps))/length < avg){
            return 0;
        }
        else {
            return 1;
        }
    }

}
