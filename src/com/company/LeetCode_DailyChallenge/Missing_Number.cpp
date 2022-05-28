//268. Missing Number

 int missingNumber(vector<int>& nums) {

        // nums has elements from 0 to n and out of them
        //one is missing but indices from 0 to n-1 so one of the element is missing

        int n=nums.size();
        int ans=n;

        for( int i=0; i< n; i++){
            ans=ans^i^nums[i];
        }
        return ans;

    }

    // or sum all the nums elements and all numbers from 0 to