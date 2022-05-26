

    //Maximum GCD of siblings of a binary tree  gfg POTD
    //https://practice.geeksforgeeks.org/problems/maximum-gcd-of-siblings-of-a-binary-tree/1#
    //https://www.youtube.com/watch?v=aJeiMUjIqO8


    //in c++
    int maxBinTreeGCD(vector<vector<int>> arr, int N) {
        map<int, int> m;

        int ans= INT_MIN;

        for( auto ele: arr){

            int x= ele[0];
            int y=ele[1];

            //if( not present or the map value is 0
            //means that we have got the first sibling)
            //then just add else calculate the gcd of the new element with
            // already existing element

            if( m[x]==0){
                m[x]= y;
            }
            else{
                int g= __gcd( m[x], y);
                ans= max( ans, g);
            }

        }
        return ans<0?0:ans;

    }


