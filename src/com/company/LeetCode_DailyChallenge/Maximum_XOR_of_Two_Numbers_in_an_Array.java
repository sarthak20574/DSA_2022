package com.company.LeetCode_DailyChallenge;

public class Maximum_XOR_of_Two_Numbers_in_an_Array {

    //421. Maximum XOR of Two Numbers in an Array
    //https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/

    /*
    //https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/solutions/91049/java-o-n-solution-using-bit-manipulation-and-hashmap/
    https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/solutions/91049/java-o-n-solution-using-bit-manipulation-and-hashmap/comments/95581
    This algorithm's idea is:
    to iteratively determine what would be each bit of the final result from left to right. And it narrows down the candidate group iteration by iteration. e.g. assume input are a,b,c,d,...z, 26 integers in total. In first iteration, if you found that a, d, e, h, u differs on the MSB(most significant bit), so you are sure your final result's MSB is set. Now in second iteration, you try to see if among a, d, e, h, u there are at least two numbers make the 2nd MSB differs, if yes, then definitely, the 2nd MSB will be set in the final result. And maybe at this point the candidate group shinks from a,d,e,h,u to a, e, h. Implicitly, every iteration, you are narrowing down the candidate group, but you don't need to track how the group is shrinking, you only cares about the final result.

    */
    class Solution {

        static class T{
            T[] child;
            T(){
                child= new T[2];
            }
        }

        T root;

        public int findMaximumXOR(int[] nums) {

            int n= nums.length;
            root= new T();
            T cur= root;

            for( int i: nums){
                cur=root;

                for( int k=30;k>=0; k--){

                    //if( bit!=0) bit=1;
                    int bit=((i & (1<<k)));
                    if( bit!=0) bit=1;
                    // System.out.println(bit==1);

                    if( cur.child[bit^1]==null) cur.child[bit^1]=new T();
                    cur= cur.child[bit^1];

                }
            }

            int ans=0;

            for( int i: nums){
                int r=0;
                cur=root;
                // if( cur==null){System.out.println(" root failr"); break;}


                for( int j=30; j>=0; j--){
                    //if( bit!=0) bit=1;
                    //else bit=0;
                    int bit=(i & (1<<j) );
                    if( bit!=0) bit=1;
                    if( cur==null){//System.out.println(i+" ");
                        break;}

                    if( cur.child[bit]!=null){
                        r|=(1<<j);
                        cur= cur.child[bit];
                    }
                    else{
                        cur= cur.child[bit^1];
                    }
                }
                ans= Math.max( r, ans);
                if (ans == Integer.MAX_VALUE) break;
            }

            return ans;
        }
        int g(int num, int i) {
            return (num & (1 << i)) == 0 ? 0 : 1;
        }
    }

}
