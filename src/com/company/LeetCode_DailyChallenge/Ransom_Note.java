package com.company.LeetCode_DailyChallenge;

public class Ransom_Note {

    //383. Ransom Note
    //https://leetcode.com/problems/ransom-note/

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] a= new int[26];
        int n1= magazine.length();

        for( int i=0; i<n1; i++){
            a[magazine.charAt(i)-'a']++;
        }

        int n2= ransomNote.length();
        for( int i=0; i<n2; i++){
            a[ransomNote.charAt(i)-'a']--;
            if( a[ransomNote.charAt(i)-'a']<0 ) return false;
        }
        return true;
    }
}
