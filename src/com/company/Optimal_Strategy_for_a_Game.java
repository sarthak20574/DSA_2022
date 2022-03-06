package com.company;

public class Optimal_Strategy_for_a_Game {
    // incomplete

    //https://www.geeksforgeeks.org/optimal-strategy-for-a-game-dp-31/
    //5, 3, 7, 10 : The user collects maximum value as 15(10 + 5)
    //8, 15, 3, 7 : The user collects maximum value as 22(7 + 15)
    //Does choosing the best at each move gives an optimal solution? No.
    //In the second example, this is how the game can be finished:
    //
    //…….User chooses 8.
    //…….Opponent chooses 15.
    //…….User chooses 7.
    //…….Opponent chooses 3.
    //Total value collected by user is 15(8 + 7)
    //…….User chooses 7.
    //…….Opponent chooses 8.
    //…….User chooses 15.
    //…….Opponent chooses 3.
    //Total value collected by user is 22(7 + 15)
    //So if the user follows the second game state, the maximum value can be collected although the first move is not the best
    //The user chooses the ‘ith’ coin with value ‘Vi’: The opponent either chooses (i+1)th coin or jth coin. The opponent intends to choose the coin which leaves the user with minimum value.
    //i.e. The user can collect the value Vi + min(F(i+2, j), F(i+1, j-1) ).


}
