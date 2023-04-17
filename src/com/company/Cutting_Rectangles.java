package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cutting_Rectangles {

    //Cutting Rectangles

    static List<Long> minimumSquares(long l, long b)
    {

        java.math.BigInteger gcD= new java.math.BigInteger(l+"").gcd( new java.math.BigInteger(b+""));

        return new ArrayList<>(List.of((l* b) /  (gcD.longValue() * gcD.longValue()), gcD.longValue()));

    }
}
