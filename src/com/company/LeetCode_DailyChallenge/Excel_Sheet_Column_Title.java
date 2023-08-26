package com.company.LeetCode_DailyChallenge;

public class Excel_Sheet_Column_Title {

    //168. Excel Sheet Column Title
    //https://leetcode.com/problems/excel-sheet-column-title/description/

    public String convertToTitle(int c) {

        StringBuilder str= new StringBuilder();
        int cur=c;
        // 26 * 26+ 25

        while( cur>0){
            //int cc= 'A'-1;
            // if( cur<=26){

            //     break;
            // }

            char rem=(char)(((cur-1)%26)+'A');//(char)(cur%26))
            // System.out.println("rem= "+rem+" "+(cur%26));

            // if( rem!=0)
            str.append( ""+(char)(rem) );
            // if( cur%26==0 && cur/26==1)break;
            cur--;
            cur=cur/26;

            // System.out.println(" cur="+cur);
        }
        str.reverse();

        return str.toString();
    }
}
