package com.company;

public class Maximum_Length {

    //Maximum Length
    //https://practice.geeksforgeeks.org/problems/84963d7b5b84aa24f7807d86e672d0f97f41a4b5/1
    int solve(int a, int b, int c) {

        int maxx=a;

        if( maxx<b) maxx=b;

        if( maxx<c) maxx= c;

        int rest= a+ b+ c - maxx;

        if( (rest+1) * 2<maxx) return -1;

        // aabaabaacaac

        return rest+ maxx;
    }
}
