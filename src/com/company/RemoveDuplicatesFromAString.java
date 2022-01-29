package com.company;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class RemoveDuplicatesFromAString {

    //LinkedHashSet maintains the insertion order of objects
    public void RemoveDuplicatesmethod1(String x){
        LinkedHashSet<Character> characterLinkedHashSet= new LinkedHashSet<Character>();

        int length=x.length();

        for(int i= 0 ; i<length; i++){
            characterLinkedHashSet.add(x.charAt(i));
        }
        String ans="";
        for (Character c: characterLinkedHashSet){
            ans+=c;
        }
        System.out.println(ans);
    }

    //using HashMap
    public void RemoveDuplicatesMethod2(char[] c){
        Map<Character,Integer> characterIntegerMap= new HashMap<>();

        String ans="";
        for (int i=0; i<c.length; i++){
            if(!characterIntegerMap.containsKey(c[i])){
                ans+=c[i];
                characterIntegerMap.put(c[i],1);
            }
        }
        System.out.println(ans);

    }







}
