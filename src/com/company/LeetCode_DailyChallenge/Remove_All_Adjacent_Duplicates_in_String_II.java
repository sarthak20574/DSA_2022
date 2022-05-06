package com.company.LeetCode_DailyChallenge;

public class Remove_All_Adjacent_Duplicates_in_String_II {

    //1209. Remove All Adjacent Duplicates in String II
    //https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
    //https://www.youtube.com/watch?v=w6LcypDgC4w&ab_channel=NeetCode

// not my code
public String removeDuplicates(String s, int k) {
    int[] count = new int[s.length()];
    StringBuilder sb = new StringBuilder();
    for(char c : s.toCharArray()) {
        sb.append(c);
        int last = sb.length()-1;
        count[last] = 1 + (last > 0 && sb.charAt(last) == sb.charAt(last-1) ? count[last-1] : 0);
        if(count[last] >= k) sb.delete(sb.length()-k, sb.length());
    }
    return sb.toString();
}

// my code
    /*

   //1209. Remove All Adjacent Duplicates in String II
    string removeDuplicates(string s, int k) {

        vector<pair<int, char>> stack= {{0,'#'}};

        int n=  s.size();
        for( char x : s){

            if( stack.back().second!=x){
                stack.push_back({1,x});
            }
            else if(++stack.back().first==k)
                    stack.pop_back();
                // this will automatically incremet the count of the last character

        }

        string ans="";
        for( auto & x: stack){

            ans.append(x.first, x.second);

        }

        return ans;

    }
     */
}
