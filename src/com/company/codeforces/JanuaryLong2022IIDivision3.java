package com.company.codeforces;

import java.util.Scanner;

public class JanuaryLong2022IIDivision3 {
    //CryingColoursProblemCodeCRYCOLR
    //There are 3 . N3⋅N balls of colours \texttt{Red,Green}Red,Green and \texttt{Blue}Blue.
    // There are "EXACTLY" NN balls of each colour. These 3 \cdot N3⋅N balls are divided into 33 boxes, such that each box has exactly NN balls.
    //We have to make a series of operations, such that, at the end, 1^{st}1
    //st
    //  box contains all the \texttt{Red}Red balls, 2^{nd}2
    //nd
    //  box contains all the \texttt{Green}Green balls and, 3^{rd}3
    //rd
    //  box contains all the \texttt{Blue}Blue balls (in the given order).
    //
    //One move is defined as: Pick any two boxes, pick 11 ball each from the boxes and swap them.
    //Find the minimum number of moves required to satisfy the conditions.

    //Start with moves which place 2 balls into their suitable boxes in a single move.
    //Still, if there exists a ball which is not in its suitable box, there would be at
    // least 2 more balls of different colours with the same condition.
    // These 3 balls of different colours can be placed into their suitable boxes using exactly 22 moves.











    //Here’s a very simple approach.
    //For the input :
    //r1 g1 b1
    //r2 g2 b2
    //r3 g3 b3
    //
    //We know r1 ,g2 and b3 are in their appropriate boxes so we focus on the rest.
    //As we can see , g1 , b1 and b2 forms an upper traingle and r2 ,r3 and g3 forms a lower triangle and all of these must be swapped.
    //
    //While swapping , we won’t always be getting numbers that cancel out each other so we would require atleast the maximum out of the sum of each triangles.
    //
    //The code would look like:
    //
    //max(g1 + b1 + b2 ,r2 + r3 + g3)

    Scanner scannerInt= new Scanner(System.in);
    public void CryingColoursProblemCodeCRYCOLR(){

        int tests= scannerInt.nextInt();
        int max, no_of_swaps;
        int[][] arr;

        for (int i= 0 ; i<tests; i++){
            max = scannerInt.nextInt();
            arr= loading();

            int sumUpperHalf= arr[0][1]+ arr[0][2]+arr[1][2];
            int sumLowerHalf= arr[1][0]+arr[2][0]+arr[2][1];
            //int sumLowerHalf=arr[1][0]+arr
            System.out.println(Math.max(sumUpperHalf,sumLowerHalf));
            }
        }

    public int[][] loading(){

        int[][] arr= new int[3][3];

        for (int i=0 ; i<3; i++){

            for (int j=0 ; j<3;j++ ){
                arr[i][j]=scannerInt.nextInt();
            }
        }

        return arr;
    }

}
