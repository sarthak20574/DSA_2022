package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Merging_Details {

    //Merging Details
    //https://practice.geeksforgeeks.org/problems/merging-details/1
    //https://www.youtube.com/watch?v=S2FbaatVgus&ab_channel=SagarMalhotra

    public List<List<String>> mergeDetails(List<List<String>> details) {

        List<List<String>> ans= new ArrayList<>();

        for( int i=0; i<details.size(); i++){

            List<String> det= details.get(i);
            if( det.size()==0) continue;

            String cur_name=det.get(0);

            Set<String> email= new TreeSet<>();

            for( int j=1; j<det.size(); j++){
                email.add(det.get(j));

            }

            for( int k=i+1;k<details.size();k++){

                List<String> det2= details.get(k);


                for( int j=1; j<det2.size(); j++){

                    // if any common email merge them
                    if( email.contains(det2.get(j))){

                        for( int x=1; x<det2.size();x++) email.add(det2.get(x));

                        det2.clear();
                        break;
                    }
                }
            }
            List<String> new_li= new ArrayList<>();

            new_li.add(cur_name);

            for( String z: email) new_li.add(z);

            ans.add(new_li);
        }
        return ans;


    }
}
