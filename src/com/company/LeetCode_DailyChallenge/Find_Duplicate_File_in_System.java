package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Find_Duplicate_File_in_System {

    /*
     Intuition
store the text as the key and the list containing addresses at which the particular text occurs as the value. Then we delete all the texts where the no of times the text appears is 1(ie, the size of the list containing the adresses associated with the text is one). we then return the remaining addresses as our answer

     */

    public List<List<String>> findDuplicate(String[] paths) {

        Map<String, List<String>> m= new HashMap<>();

        for( String x: paths){

            String[] arr= x.split(" ");

// first string is the name of the directory like "root/a" in "root/a 1.txt(abcd) 2.txt(efgh)"
            String dir= arr[0];

            for( int i=1; i<arr.length; i++){

// the part before the '(' is the fileName and the part between '(' & ')' is the text
                String fileName= arr[i].substring(0, arr[i].indexOf('('));
                String text= arr[i].substring(arr[i].indexOf('(')+1, arr[i].length()-1);


                List<String> li=m.getOrDefault( text, new ArrayList<>());
                li.add(dir+"/"+ fileName);
                m.put( text, li);
            }
        }

        ArrayList<String> non_duplicates= new ArrayList<>();

// we store all the non duplicates in a list and then delete them from the map
        for( String x: m.keySet()){
            if( m.get(x).size()==1) non_duplicates.add(x);
        }

        for( String x: non_duplicates){
            m.remove(x);
        }


// now return all the remaining duplicate addresses
        return new ArrayList<>(m.values());
    }
}
