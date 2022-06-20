//Number of positive integral solutions


// a + b+ c= 5 we can write it as 1 + 1 + 1 + 1 +1= 5
// here we have 4 plus sign but in the question we have 2 plus sign so distribute 4 into 2 positions, ans = 4 C 2

//https://practice.geeksforgeeks.org/problems/number-of-positive-integral-solutions2115/1
//https://www.youtube.com/watch?v=YD90lPVWaNI
 long posIntSol(string s)
    {
        long long r=0, n;

         for( int i=0; i< s.size(); i++){
             if( s[i]== '+') r++;

             // include everything after the = sign as
             //= sign has been caught at i position
             if( s[i]=='=') n= stoll( s.substr(i+1));
         }

         n--;
         long long num=1, denom=1;

         // calcualting nCr
         for( int i=0; i<r; i++){
             num*=n;
             n--;
         }

         for( int i=1; i<=r; i++){
             denom*=i;
         }

         return num/denom;

    }



