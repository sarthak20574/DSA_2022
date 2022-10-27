package com.company.LeetCode_DailyChallenge;

public class Count_and_Say {
    // 38. Count and Say
    //https://leetcode.com/problems/count-and-say/description/
    //https://www.youtube.com/watch?v=1YUqtoT9YoE&ab_channel=Yogesh%26Shailesh%28CodeLibrary%29

    public String countAndSay(int n) {

        StringBuilder ans=new StringBuilder("1");

        int i=0, j=0;
        for( int k=2; k<=n; k++){

            StringBuilder cur= new StringBuilder();

            i=j=0;

            while( j< ans.length()){

                while( i< ans.length() &&  ans.charAt(i)== ans.charAt(j)){
                    i++;
                }

                cur.append(i-j);
                cur.append(ans.charAt(j));


                j=i;
            }
            ans= cur;
        }

        return ans.toString() ;
    }

}
