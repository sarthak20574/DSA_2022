package com.company;

public class Choose_and_Swap {

    //char array of 156 letters {a,b,c,d,e,...z}
    //for ccad , we store the first index of the letter inthe array(lexically sorted)
    // {2,-1,0,3...-1,}
    // now for c 1st lwtter in ccad we get, so all the numbers that are >0 before c...yes 2 with a
    // swap c and a

    /*
     string chooseandswap(string a){

        int n=a.size();
        int charr[26];
        memset(charr, -1,sizeof(charr));

        for( int i=0 ; i< n ; i++){
            if( charr[a[i]-'a']==-1) charr[a[i]-'a']=i;
        }

        int i, j;
        bool found=false;
        for( i=0 ;i< n; i++){

            for( j=0 ;j<a[i]-'a';j++){
                if( charr[a[i]-'a']<charr[j]){
                    found=true;
                    break;
                }
            }
            if( found)break;
        }

        if( i<n){
            char x=a[i];
            char y=char(j+'a');

            for( int k=0 ; k< n; k++){
                if( a[k]==x)a[k]=y;
                else if( a[k]==y)a[k]=x;
            }
        }

        return a;


        //my method
            // replace the smaller and greatest ans replace them ??
            //accd   in hash map a= 65 , c= 67*2 and d= 68
            // now replace the largest and the smallest in the hash map

        }
     */
}
