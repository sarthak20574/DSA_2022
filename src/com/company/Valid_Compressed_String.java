package com.company;

public class Valid_Compressed_String {

    //Valid Compressed String
    //https://practice.geeksforgeeks.org/problems/13eb74f1c80bc67d526a69b8276f6cad1b8c3401/1

    static int checkCompressed(String S, String T) {

        int tl= T.length(), sl= S.length(), j=0, i=0;

        int no=0;

        char[] t= T.toCharArray();



        while( i<tl && j<sl){

            if( 'A'<=t[i] && t[i]<='Z'){

                if( t[i]!=S.charAt(j)) return 0;
                j++;
                i++;
            }
            // nuber
            else{

                no=0;


                while( i<tl && '0'<=t[i] && t[i]<='9'){

                    no= no*10+(t[i]-'0');
                    i++;
                }

                for( int k=0; k<no; k++){

                    if( j>=sl)return 0;
                    j++;

                }
            }


            if(i>=tl || j>=sl) break;

        }

        return (i==tl && j==sl)?1:0;

    }
}
