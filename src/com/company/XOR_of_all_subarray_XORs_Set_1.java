package com.company;

import java.util.List;

public class XOR_of_all_subarray_XORs_Set_1 {

    //https://www.geeksforgeeks.org/xor-subarray-xors/

    //Input : arr[] = [3, 5, 2, 4, 6]
    //Output : 7
    //Total XOR of all subarray XORs is,
    //(3) ^ (5) ^ (2) ^ (4) ^ (6)
    //(3^5) ^ (5^2) ^ (2^4) ^ (4^6)
    //(3^5^2) ^ (5^2^4) ^ (2^4^6)
    //(3^5^2^4) ^ (5^2^4^6) ^
    //(3^5^2^4^6) = 7


// subarryays = (3) ^ (5) ^ (2) ^ (4) ^ (6)
    //(3^5) ^ (5^2) ^ (2^4) ^ (4^6)
    //(3^5^2) ^ (5^2^4) ^ (2^4^6)
    //(3^5^2^4) ^ (5^2^4^6) ^
    //(3^5^2^4^6)


    public static int O_N_cube(List<Integer> arr) {

        // generate all subarrays
        int length=arr.size(),ans=0;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                for (int k = i; k <= j; k++) {
                    ans=ans^arr.get(k);
                }
            }
        }

        return ans;
    }


    //3 occurred 5 times,
    //5 occurred 8 times,
    //2 occurred 9 times,
    //4 occurred 8 times,
    //6 occurred 5 times
    //So our final result will be xor of all elements which occurred odd number of times
    //i.e. 3^2^6 = 7
    //
    //From above occurrence pattern we can observe that number at i-th index will have
    //(i + 1) * (N - i) frequency.

    public static int sansaXor(List<Integer> arr) {
        int length=arr.size(),ans=0;
        for (int i = 0; i < length; i++) {

            int occurences= (length-i)*(i+1);

            if( occurences%2!=0)
                ans=ans^arr.get(i);

        }

        return ans;
    }

    //take a look at this
    //https://www.geeksforgeeks.org/xor-subarray-xors-set-2/

}
