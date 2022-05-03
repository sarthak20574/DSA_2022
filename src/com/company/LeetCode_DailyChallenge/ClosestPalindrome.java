package com.company.LeetCode_DailyChallenge;

public class ClosestPalindrome {

    //Closest Palindrome
    //https://practice.geeksforgeeks.org/problems/closest-palindrome4519/1
    //https://leetcode.com/problems/find-the-closest-palindrome/discuss/147949/Thinking-Process
    // somewhat ok video but the leet code blog is🔥🔥
    //https://www.youtube.com/watch?v=hZcindWcYI4

    public long closestPalindrome(long num) {

        String no= String.valueOf(num);

        if( palindrome(no)){
            return num;
        }

        //like 100
        if( no.charAt(0)=='1' && Long.parseLong(no.substring(1))==0){
            return num-1;
        }

        int n= no.length();

        boolean isEven= n%2==0;

        String palindromicRoot;

        if( isEven){
            palindromicRoot=no.substring(0, n/2);
        }
        else {
            palindromicRoot= no.substring(0, n/2+1);
        }

        long palin_long_root=Long.parseLong(palindromicRoot);

        // if equal to the root

        long equal_palin=changeToPalindrome(palindromicRoot,isEven);

        long difference_equ=Math.abs(num-equal_palin);

        long bigg_palin= changeToPalindrome(String.valueOf(palin_long_root+1),isEven);
        long diff_bigg= Math.abs((num-bigg_palin));

        long small_palin= changeToPalindrome(String.valueOf(palin_long_root-1),isEven);
        long diff_small= Math.abs(num-small_palin);

        long ans= diff_small>diff_bigg? bigg_palin:small_palin;
        long min_diff=Math.min(diff_bigg, diff_small);

        if(min_diff== difference_equ){
            ans= Math.min(equal_palin, ans);
        }
        else if( difference_equ<min_diff)ans= equal_palin;

        return ans;
    }

    private boolean palindrome(String no) {

        int l=0, r= no.length()-1;

        while (l<=r){

            if( no.charAt(l)!=no.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    private long changeToPalindrome(String no, boolean isEve){
        StringBuilder rev_no= new StringBuilder(no).reverse();
        String new_no= isEve? rev_no+no: no+ (rev_no.deleteCharAt(0)).toString();
        return Long.parseLong(new_no);
    }


}
