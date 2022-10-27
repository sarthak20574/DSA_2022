
    //Reverse Spiral Form of Matrix

    //https://practice.geeksforgeeks.org/problems/reverse-spiral-form-of-matrix4033/1

    vector<int> reverseSpiral(int r, int c, vector<vector<int>>&a)  {
            int r1=0, r2=r-1, c1=0, c2=c-1;


            vector<int> ans;
            while( r1<= r2 && c1<=c2){


                if( r1<=r2){
                    for( int i=c1;i<=c2; i++){
                    ans. push_back( a[r1][i]);
                }
                r1++;
                }

                if( c1<=c2){
                    for( int i=r1; i<=r2; i++){
                    ans. push_back( a[i][c2]);
                }
                c2--;
                }


                if( r1<=r2){
                     for( int i=c2 ; i>=c1; i--){
                    ans . push_back( a[r2][i]);
                }
                r2--;
                }


                if( c1<=c2){
                    for( int i=r2; i>=r1; i--){
                    ans. push_back( a[i][c1]);
                }
                c1++;
                }

            }

            // for(  i: ans){
            //         cout<<i << " ";
            //     }
            //     cout<<endl;
            reverse( ans.begin(), ans.end());


            return ans;

        }