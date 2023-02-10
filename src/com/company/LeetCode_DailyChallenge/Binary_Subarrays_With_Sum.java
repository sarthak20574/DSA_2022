package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Binary_Subarrays_With_Sum {

    //930. Binary Subarrays With Sum
    //https://leetcode.com/problems/binary-subarrays-with-sum/solutions/186683/c-java-python-sliding-window-o-1-space/?orderBy=most_votes

    // see lee's sliding window solution(https://leetcode.com/problems/binary-subarrays-with-sum/solutions/186683/c-java-python-sliding-window-o-1-space/?orderBy=most_votes)
    // and this explanation its comment from a user https://leetcode.com/problems/binary-subarrays-with-sum/solutions/186683/c-java-python-sliding-window-o-1-space/comments/950969
    /*
    This is my understanding of the sliding window solution. If there is anything wrong, please point it out.
atMost(A, S) counts the number of the subarrays of A the sum of which is at most(less than or equal to) S. Therefore, we can use atMost(A, S) - atMost(A, S - 1) to get the number of the subarrays the sum of which is exactly S.
In the atMost function, the i to j window represents the subarrays. We use the j pointer to expand the window, when the sum of all numbers in the window is bigger than S, it's time for us to move the i pointer to shorten the window. Through this process, we can count the number of the subarrays.

     */

    public int numSubarraysWithSum(int[] nums, int goal) {

        Map<Long, Integer> m= new HashMap<>();

        m.put(0L, 1);

        long ans = 0, cur=0;

        for( int i: nums){
            cur+=i;

            if( m.containsKey(cur-goal)){
                ans+=m.get( cur-goal);
            }

            m.put(cur, m.getOrDefault(cur, 0)+1);
        }
        return (int)ans;
    }


}
