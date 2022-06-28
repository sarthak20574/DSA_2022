  //665. Non-decreasing Array
    //https://leetcode.com/problems/non-decreasing-array/submissions/
    //https://www.youtube.com/watch?v=RegQckCegDk

    bool checkPossibility(vector<int>& nums) {

        int n=nums.size();
        bool x=false;

        for( int i=0; i< n-1; i++){

            // if already in order go to the next iteration
            if( nums[i] <= nums[i + 1]) continue;

            //if if not in order & we have already changed a no. return false
            if( x==true) return false;

            // we can either increase or decrease a no
            // in case of 3 10 4 we can increase 4 to 10, ie, i+1 to its i
            // for   7 8 6 we can change  8 tp 6 ie, i tp its i+1

            if( i==0 || nums[i-1]<=nums[i+1]) nums[i]= nums[i+1];
            else nums[i+1]=nums[i];
            x= true;
        }
        return true;
    }