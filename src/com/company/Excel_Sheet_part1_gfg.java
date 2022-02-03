package com.company;

public class Excel_Sheet_part1_gfg {

    //MS Excel columns have a pattern like A, B, C, …, Z, AA, AB, AC, …., AZ, BA, BB, … ZZ, AAA, AAB …..
    // etc. In other words, column 1 is named as “A”, column 2 as “B”, column 27 as “AA”.

    //26/27=0 and 27/27=1 also 26%27=26 and 27/27 A

    public static String excelColumn(int N){
        int remainder;
        char a='A'-1;
        StringBuilder ans= new StringBuilder();
        while(N>0){
            remainder=N%26;

            if( remainder==0){
                ans.insert(0, 'Z');
                N= N/26;
                N-=1;
            }
            else {
                ans.insert(0, (char) (a + remainder));
                N= N/26;
            }
        }
        return ans.toString();
    }

}
