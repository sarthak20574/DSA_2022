package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Words_Within_Two_Edits_of_Dictionary {

    public List<String> twoEditWords(String[] queries, String[] dictionary) {

        List<String> ans= new ArrayList<>();

            for( String q: queries) {

                for (String d : dictionary) {
                    int cur=0;
                    for( int k=0; k< Math.min(d.length(), q.length()); k++){
                        if( d.charAt(k)!= q.charAt(k)) {
                            cur++;
                        }
                    }
                    if( cur<=2) {
                        ans.add(q);
                        break;
                    }
                }
            }

        return ans;

    }


}
