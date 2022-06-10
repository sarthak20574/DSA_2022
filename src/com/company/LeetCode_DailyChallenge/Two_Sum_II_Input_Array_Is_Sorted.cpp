//167. Two Sum II - Input Array Is Sorted
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

 vector<int> twoSum(vector<int>& numbers, int target) {

        int i=0, j=numbers.size()-1;
        vector<int> ans;

        while( i<j){
            if( numbers[i]+numbers[j]==target) {
                ans.push_back(i+1);
                ans.push_back(j+1);
                break;
            }
            else if( numbers[i]+numbers[j]>target){
                j--;
            }
            else{
                i++;
            }
        }


        return ans;
    }