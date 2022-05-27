//Fraction Trouble
//https://practice.geeksforgeeks.org/problems/fraction-trouble1410/1#
//https://www.youtube.com/watch?v=J8OXeo6WE9U

vector<int> numAndDen(int n, int d) {
    int x= -1, y=1, p_x;

    for( int i=d+1; i<=10000; i++){
        p_x=(n*i)/d;
        if( __gcd(p_x, i)==1){
            if((1.0*p_x/i)>1.0*x/y){
                x= p_x;
                y=i;

            }
        }
    }

    return {x,y};
    }
