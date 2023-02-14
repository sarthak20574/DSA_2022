package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class Replace_the_Substring_for_Balanced_String {

    //1234. Replace the Substring for Balanced String
    //https://leetcode.com/problems/replace-the-substring-for-balanced-string/description/

    /*
    https://leetcode.com/problems/replace-the-substring-for-balanced-string/solutions/409017/java-sliding-window-solution-with-explanation/
    The idea is to first count up each type of character. Since we know there are only 4 characters: Q, W, E, R, we can easily count them up using an int[] arr of length 4.

Then once we count them up, we look at the number of occurrences of each and see if any of them > N/4 (where N is the length of the String). If they are, this means that we need this freq[character] - (N/4) number of this character in the substring we choose to replace.

E.g. If we have N = 12 and freq[Q] = freq[0] = 6. Since we know each character must occur N/4 = 12/4 = 3 times. We have 3 extra Qs. So we need to make sure our substring at the end has 3 Qs in it. The same principle applies when there are multiple characters > (N/4).

Essentially, we reduced the problem to finding a minimum substring containing a certain number of each character.

Then we go to the freq array and subtract (N/4) from each of freq[Q], freq[W], freq[E], freq[R].
If it is below 0 (this means our substring does not need to contain this letter since we are already in demand of this letter), then we just set it to 0.

     */



    public int balancedString(String s) {

        int ans=s.length(), n= s.length();

        int[] freq= new int[4];
        Map<Character, Integer> m= new HashMap<>();
        m.put('Q', 0);
        m.put('W', 1);
        m.put('E', 2);
        m.put('R', 3);

        for( char c: s.toCharArray()){
            freq[m.get(c)]++;
        }

        freq[0]-=n/4;
        freq[1]-=n/4;
        freq[2]-=n/4;
        freq[3]-=n/4;

        int j=0;

        for( int i=0; i<n; i++){

            freq[m.get(s.charAt(i))]--;

            while( i>=j && freq[m.get(s.charAt(j))]+1<=0){
                freq[m.get(s.charAt(j++))]++;
            }
            if( freq[0]<=0 && freq[1]<=0 && freq[2]<=0 && freq[3]<=0 )
                ans= Math.min(ans, i-j+1);
        }

        return ans;
    }
}
