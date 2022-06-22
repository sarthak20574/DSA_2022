//Count subsequences of type a^i, b^j, c^k
//gfg
//https://practice.geeksforgeeks.org/problems/count-subsequences-of-type-ai-bj-ck4425/1#
//https://www.youtube.com/watch?v=IV9pbZsi5cc

int fun(string &s) {
        int m = 1000000007;
        int a= 0, ab=0, abc=0;

        for( char x: s){
            if( x=='a') a= ((2*a)%m+1)%m;

            else if( x=='b') ab= ((2*ab)%m+a)%m;

            else if( x=='c') abc=((2 * abc)%m+ ab)%m;
        }

        return (abc) % m;
    }
