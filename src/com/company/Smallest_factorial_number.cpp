
//Smallest factorial number
//https://practice.geeksforgeeks.org/problems/smallest-factorial-number5929/1#
///https://www.youtube.com/watch?v=8VQQbK1uMMc

int findNum(int n)
        {

            int  low= 0, high= n*5, ans, mid;

            while( low<=high){
                mid= (low + high)/2;

                int z= calc_z(mid);

                if( z>=n){

                    ans= mid;
                    high=mid-1;
                }
                else{
                    low= mid+1;

                }
            }

            return ans;
        }

        int calc_z(int mid){
            int x=5;
            int ans=0;

            while( x<= mid){
                ans+=mid/x;
                x*=5;
            }

            return ans;
        }