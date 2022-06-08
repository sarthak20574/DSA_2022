//1332. Remove Palindromic Subsequences
//https://leetcode.com/problems/remove-palindromic-subsequences/
//https://www.youtube.com/watch?v=FnwmXLZiphw

 int removePalindromeSub(string s) {
        // 3 cases
        // empty string ans=0
        // whole string is palindrome ans=1
        // else ans=2
        int n= s.size();

        int i=0,j=s.size()-1;

        while ( i<j){
            if( s[i++]!=s[j--]){
                return 2;
            }
        }
        return 1;
    }