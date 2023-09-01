package com.company.LeetCode_DailyChallenge;

public class Multiply_Strings {

    //43. Multiply Strings
    //https://leetcode.com/problems/multiply-strings/description/

    public String multiply(String num1, String num2) {

        int n= num1.length(), m= num2.length();

        // int i=n-1, j=m-1;

        int[] ans= new int[n+m+2];

        for( int i=m-1, ind=0; i>=0; i--, ind++){

            for( int j=n-1; j>=0; j--){

                int ii=num1.charAt(j)-'0', jj= num2.charAt(i)-'0';

                //System.out.println(ii +" * "+jj);

                int p= ii*jj;
                ans[i+j+3]+=p%10;
                ans[i+j-1+3]+= p/10;

                if( ans[i+j+3]>9){
                    ans[i+j-1+3]+=ans[i+j+3]/10;
                    ans[i+j+3]%=10;
                }

                // if( ans[i+j-1+3]>9){
                //     ans[i+j-2+3]+=ans[i+j-1+3]/10;
                //     ans[i+j-1+3]%=10;
                // }

                // System.out.println(Arrays.toString(ans));
            }
        }

        StringBuilder s= new StringBuilder();

        //if( ans.length==0) return "0";

        int i=0;

        while(ans[i]==0 ){

            i++;
            if( i==ans.length) return "0";
        }
        for( ;i<ans.length; i++){
            s.append(ans[i]);
        }

        return s.toString();
    }


}
