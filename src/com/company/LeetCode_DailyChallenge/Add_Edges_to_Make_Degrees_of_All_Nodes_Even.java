package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Add_Edges_to_Make_Degrees_of_All_Nodes_Even {

    //2508. Add Edges to Make Degrees of All Nodes Even
    //https://leetcode.com/problems/add-edges-to-make-degrees-of-all-nodes-even/description/
    //https://leetcode.com/problems/add-edges-to-make-degrees-of-all-nodes-even/solutions/2923720/python-stright-forward-with-explanation/

    public boolean isPossible(int n, List<List<Integer>> ed) {

        List<Set<Integer>> g= new ArrayList<>();

        for( int i=0; i<n; i++){
            g.add(new HashSet<>());
        }

        for( List<Integer> e: ed){
            g.get(e.get(0)-1).add(e.get(1)-1);
            g.get(e.get(1)-1).add(e.get(0)-1);
        }

        List<Integer> o= new ArrayList<>();

        for( int i=0; i<n; i++){
            if( g.get(i).size()%2!=0)o.add(i);
            if( o.size()>4) return false;
        }

        if( o.size()==0) return true;

        else if( o.size()==2){
            if( g.get(o.get(0)).contains(o.get(1))==false) return true;
            for( int k=0; k<n; k++){
                if( g.get(o.get(0)).contains(k)==false &&
                        g.get(o.get(1)).contains(k)==false ) return true;
            }
        }
        else if( o.size()==4){

            // 01 34    03 14   04 13
            return ( ( g.get(o.get(0)).contains(o.get(1))==false &&
                    g.get(o.get(2)).contains(o.get(3))==false ) ||

                    ( g.get(o.get(0)).contains(o.get(2))==false &&
                            g.get(o.get(1)).contains(o.get(3))==false ) ||

                    ( g.get(o.get(0)).contains(o.get(3))==false &&
                            g.get(o.get(1)).contains(o.get(2))==false ) );

        }

        return false;
    }
}
