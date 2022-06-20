
//Smallest distinct window
//https://practice.geeksforgeeks.org/problems/smallest-distant-window3132/1#
//https://www.youtube.com/watch?v=zm50uGBsSz4
    int findSubString(string str)
    {
        unordered_set<char> x;

        for( char i : str){
            x.insert(i);
        }
        int n= x.size();

        unordered_map<char, int> y;
        int i=0, j=0;
        int ans=str.size();

        while( i<str.size()){

            y[str[i]]++;
            if( y.size()== n){

                while( y[str[j]]>1){
                    y[str[j]]--;
                    j++;
                }
                ans= min (ans, i-j+1);
            }
            i++;
        }
        return ans;
    }