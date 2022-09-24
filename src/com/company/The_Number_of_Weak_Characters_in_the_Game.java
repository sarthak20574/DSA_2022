package com.company;

import java.util.Arrays;

public class The_Number_of_Weak_Characters_in_the_Game {

    public int numberOfWeakCharacters(int[][] arr) {

//1996. The Number of Weak Characters in the Game
//https://leetcode.com/problems/the-number-of-weak-characters-in-the-game/description/
//https://www.youtube.com/watch?v=q0GUGiwSFEE&ab_channel=TechAdorabyNivedita

        // sort in ascending order by the attack and if they are equal then in the descending order by their defence
        // if the attack is equal then sort by the descending order becasue we have to ignore the elements with the same attack as a character is weak only both attack and defense levels 'strictly' greater than this character's attack and defense levels.

        Arrays.sort( arr, (a, b)-> a[0]==b[0]? b[1]- a[1]:a[0]-b[0]);

        int ans= 0, max, n= arr.length;

        // intitally set the last element's defence as the max defence found till now
        max= arr[n-1][1];

        for( int i=n-2; i>=0; i--){

            // if we found any element with less defence we increase we have found a weak character as the array is already sorted by their attack in ascending order so all the elements previously visited have greater attack power

            if( max>arr[i][1])ans++;

            // we update the max defence found
            max= Math.max( arr[i][1], max);
        }

        return ans;
    }
}
