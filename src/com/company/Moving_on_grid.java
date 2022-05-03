package com.company;

public class Moving_on_grid {
//Moving on grid
    //https://practice.geeksforgeeks.org/problems/moving-on-grid1135/1#
    /*
     string movOnGrid(int r, int c) {
        r=(r-1)%7;
        c=(c-1)%4;
        if( r!=c) return "JON";
        else return "ARYA";
    }
    /*
    After observation, the conditions for Arya Stark to win is:

The cases (1, 1), (2, 2), (3, 3), (4, 4).
If Arya can win for (r, c), she can also win for (r + 7, c) and (r, c + 4).
Otherwise Jon Snow wins.
*/

}
