//Magnet Array Problem
    //https://www.youtube.com/watch?v=7XQoDycXjSY
    //https://practice.geeksforgeeks.org/problems/magnet-array-problem3743/1#
        void nullPoints(int n, double magnets[], double ans[])
    {

        for( int i=0; i<n-1; i++){

            ans[i]= fn(n, magnets,magnets[i], magnets[i+1]);
        }
    }

    double fn( int n, double magnet[], double lft, double ryt){

        //double lft=0, ryt=magnet[i];
        while(lft<=ryt){
            double mid= (lft+ryt)/2;
            double f= 0;
            for( int i=0; i<n ;i++){
                f+=1/(mid-magnet[i]);
            }

            if( abs(f)<0.0000001)return mid;

            else if( f>0){
                lft=mid;
            }
            else{
                ryt=mid;
            }
        }
    }