package com.company.LeetCode_DailyChallenge;

public class FindtheDuplicateNumber {


    //FindtheDuplicateNumber
    //https://leetcode.com/problems/find-the-duplicate-number/

    // must remember
    // 1000000000000000000000IQ
    /*
    if the input array is [1, 3, 3, 2][1,3,3,2], then for 11, flip the number at index 11,
     making the array [1,-3,3,2][1,−3,3,2]. Next, for -3−3 flip the number at index 33,
      making the array [1,-3,3,-2][1,−3,3,−2]. Finally, when we reach the second 33,
      we'll notice that nums[3]nums[3] is already negative
    , indicating that 33 has been seen before and hence is the duplicate number.
     */
    public int method1(int[] nums) {
        int n = nums.length, ans = -1;
        for (int i = 0; i < n; i++) {

            int ele = Math.abs(nums[i]);

            if (nums[ele] < 0) {
                ans = nums[ele];
                break;
            } else nums[ele] = -nums[ele];
        }

        //restore

        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        return ans;
    }

    //naive sort the array then just traverse it to get the required solution if( arr[i] == arr[i+1])
    // then return arr[i]


    // next is hashing a frequency array initialised with 0 and then


    // differnenc between the distanfc travelled by the slow and the fast pointer is a as
    // fast travels 2a and slow travels a
    // where a is the multiple of the length of the cycle(nc), so the distance from the start of the node
    // to the the point of intersection is the


    // floyd tortoise and hare problem
    //https://www.youtube.com/watch?v=wjYnzkAhcNk&ab_channel=NeetCode
    // see this at 5 min to understand floyd
    // the duplicates point to the same array element
    // so we know that the duplicate is gonna be the start of the cycle
    //so we need to ge the begining of the cycle
    // we can get that from floyd's algo

    // slow pointer goes from part outside the loop(p) and then will traverse all the cycle
    // untill the x nodes from the point of intersection so it travels p+ c-x where c is the cycle length,
    // fast pointer travels p+ n*c + c-x
    // also 2 * slow = fast
    // so 2( dist1/t)= dist2/t;
    // 2( c-x + p)= c+c-x+p
    // 2c -2x +2p= 2c-x+p
    //  -x+p=0

    // fast can also many loops in case of large p then 2*(c-x+p)=  nc+ c-x+p
      /*
      //in c++

       int findDuplicate(vector<int>& nums) {
        int slow=nums[0], fast= nums[0];
       do
       {
           slow= nums[slow];
           fast= nums[nums[fast]];
       } while (slow!=fast);

       slow= nums[0];

       while (slow !=fast){
           fast= nums[fast];
           slow= nums[slow];
       }
       return fast;

    }
       */

}
