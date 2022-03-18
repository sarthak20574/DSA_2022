package com.company;

public class Coin_Piles {

    // https://www.youtube.com/watch?v=fn8N2vGyunw
    //https://practice.geeksforgeeks.org/problems/coin-piles5152/1

    //1 1 1 2 4 4, k=2
    // 4-1 so remove 1 coin then 4-2=3 remove 1 move forward then 1 and 2, (2-1), this is fine
    // but in case of 2, 11 , 13 and k=2
    // we can just remove the 2 coins and done

    // now for 1 1 1 2 4 4, k=2
    // we add k to min elemnt and find all elements with >=min+k, so all values after min + k or 1+2= 3 will have to be
    // reduced ( like we will have to reduce all element after 3( so 4, 4 will have to be reduced)
    // so we ae supposed to have nk * remaining element after an element is > k+min

}
