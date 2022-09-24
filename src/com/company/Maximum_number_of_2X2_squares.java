package com.company;

import java.util.HashMap;
import java.util.Map;

public class Maximum_number_of_2X2_squares {

    //Maximum number of 2X2 squares
    public static long numberOfSquares(long base)
    {

        long x= base/2 -1;

        return (x* (x+1))/2;
    }

}
