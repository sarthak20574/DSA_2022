package com.company.non_leetcode_companyQuestion;

public class Pour_Water {

    //755. Pour Water
    //https://leetcode.com/problems/pour-water/description/

    /*
    You are given an elevation map represents as an integer array heights where heights[i] representing the height of the terrain at index i. The width at each index is 1. You are also given two integers volume and k. volume units of water will fall at index k.

Water first drops at the index k and rests on top of the highest terrain or water at that index. Then, it flows according to the following rules:

If the droplet would eventually fall by moving left, then move left.
Otherwise, if the droplet would eventually fall by moving right, then move right.
Otherwise, rise to its current position.
Here, "eventually fall" means that the droplet will eventually be at a lower level if it moves in that direction. Also, level means the height of the terrain plus any water in that column.

We can assume there is infinitely high terrain on the two sides out of bounds of the array. Also, there could not be partial water being spread out evenly on more than one grid block, and each unit of water has to be in exactly one block.



Example 1:


Input: heights = [2,1,1,2,1,2,2], volume = 4, k = 3
Output: [2,2,2,3,2,2,2]
Explanation:
The first drop of water lands at index k = 3. When moving left or right, the water can only move to the same level or a lower level. (By level, we mean the total height of the terrain plus any water in that column.)
Since moving left will eventually make it fall, it moves left. (A droplet "made to fall" means go to a lower height than it was at previously.) Since moving left will not make it fall, it stays in place.

The next droplet falls at index k = 3. Since the new droplet moving left will eventually make it fall, it moves left. Notice that the droplet still preferred to move left, even though it could move right (and moving right makes it fall quicker.)

The third droplet falls at index k = 3. Since moving left would not eventually make it fall, it tries to move right. Since moving right would eventually make it fall, it moves right.

Finally, the fourth droplet falls at index k = 3. Since moving left would not eventually make it fall, it tries to move right. Since moving right would not eventually make it fall, it stays in place.

Example 2:

Input: heights = [1,2,3,4], volume = 2, k = 2
Output: [2,3,3,4]
Explanation: The last droplet settles at index 1, since moving further left would not cause it to eventually fall to a lower height.
Example 3:

Input: heights = [3,1,3], volume = 5, k = 1
Output: [4,4,4]


Constraints:

1 <= heights.length <= 100
0 <= heights[i] <= 99
0 <= volume <= 2000
0 <= k < heights.length
     */


    // explanation later in the commnets
    public int[] pourWater(int[] heights, int volume, int k) {

        int cur=k, n= heights.length;

        for( int i=0; i<volume; i++){

            // move left and see if there is any place/valley then do the same with right
            while( cur-1>=0 && heights[cur]>=heights[cur-1])
                cur--;

            while(cur+1<n && heights[cur]>= heights[cur+1])
                cur++;

            // if didn't find any valley go back to k from right side
            while( cur-1>=k && heights[cur]== heights[cur-1] )
                cur--;

            heights[cur]++;
        }

        return heights;

    }


    // by chatgpt
    /*

    The variable cur is initially set to the index K, representing the current position of the water. The code then proceeds to move the water left, checking if the height of the current position is greater than or equal to the height of the position to its left. If so, it continues moving left until it reaches the leftmost position or a position with a lower height.

Next, the code moves the water right, checking if the height of the current position is greater than or equal to the height of the position to its right. It continues moving right until it reaches the rightmost position or a position with a lower height.

After these two steps, the code checks if the current position cur is greater than K. If so, it means the water has moved to the right of the initial pour position. In this case, the code moves the water left to the original pour position K by repeating the left movement step until it reaches K or a position with a lower height.
     */

    /*

    // nice post https://leetcode.com/problems/pour-water/solutions/171104/share-my-java-straightforward-and-concise-solution/

    comment by chrislitianxin
Mar 29, 2020
This solution is brilliant but somewhat slow because it didn't take consideration of the information obtained from previous scans. We ended up scanning the same segment too many times. I propose a simple one line change that take this from 40% => 95%.

        N = len(heights)
        j = K # ! important optimization
        for i in range(V):
            while j > 0 and heights[j] >= heights[j-1]:
                j -= 1
           while j < N - 1 and heights[j] >= heights[j+1]:
                j += 1
            while j > K and heights[j]== heights[j-1]:
                j -= 1
            heights[j] += 1

        return heights
I will explain why I lifted j = K out of the for loop:
j is outside of the loop because we don't need to start scanning at K each time. Water tends to fall back to similar position based on the rule defined in the question. Therefore we only need to start scanning at where j previously is. scanning left then right to see if the next drop can 'get out' of the local minima. And the only way for j to get out of local minima is until it gets fully filled, just like real water (lol).
     */
}
