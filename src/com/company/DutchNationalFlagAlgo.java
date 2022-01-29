package com.company;


import java.util.Arrays;

public class DutchNationalFlagAlgo {

    //sort array of 0, 1 and 2s...can count number of 0s,1s,2s then make the array
    //or

    //[0....low-1] -> 0    0000 1111 2222
    //[high+1....n] -> 2
//    3 pointers low mid and high

//
//    till mid passes high
//    if mid==0 swap(low, mid) low++, mid++ both because if the first element is 0 then?
//    else if mid== 1 mid++
//    else if mid== 2 swap(mid, high) high-- not mid as it may swap with high having 0
//
//    the low moved forward only if we get 0 so all nos before low and all before mid and before low
//    mid send 0s to the low(swap so even low has to move as it can only get 0s, anand since mid has
//    travelled all the way to mid there can't be anything except 1s in b/w low and mid and it sends
//    2s to the high so high too moves but we can't move the i as the space between the mid and high
//    isn't scanned and may contain anything so cna't move i forward unless it conatins 1
}
