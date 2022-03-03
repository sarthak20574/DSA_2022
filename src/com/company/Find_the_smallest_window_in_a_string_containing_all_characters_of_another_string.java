package com.company;

import java.util.HashMap;
import java.util.Map;

public class Find_the_smallest_window_in_a_string_containing_all_characters_of_another_string {

    // incomplete

    // if in map T= -1 means we have an extra Ts so we can remove those extra T and when the count of the
    // remaining letters to find becomes 0, means we already got the substring, try removing the extra characters
    // start moving the left ptr, if its a char then increment i and its value in map, if the freq value in
    //map reaches >0 increment the outside count variable and then we need to start hunting the missing variable
    // or increment j(ryt pointer)

    public static String smallestWindow(String bigString, String smallString)
    {
        Map<Character, Integer> smallMap = new HashMap<>();

        int smallStringLength=smallString.length();
        int bigStringLength= bigString.length();

        for (int i = 0; i <smallStringLength; i++) {
            smallMap.put(smallString.charAt(i), smallMap.getOrDefault(smallString.charAt(i),0));
        }


        String ans=bigString;
        int lft_ptr=0,count=smallStringLength,size_of_map= smallMap.size();

        HashMap <Character, Integer> bigMap= new HashMap<>();

        for (int right_ptr = 0; right_ptr < bigStringLength; right_ptr++) {

            //
            if (smallMap.containsKey(bigString.charAt(right_ptr))){
                bigMap.put(bigString.charAt(right_ptr), bigMap.get(bigString.charAt(right_ptr))+1);
                count--;
            }

            // means we got all the required cha
            if(count==0){

                if( ans.length()>right_ptr-lft_ptr+1){
//                 ans= bigString.substring()
                }
            }




        }
        return "";
    }

}
