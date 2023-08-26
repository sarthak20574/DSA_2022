package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Text_Justification {

    //68. Text Justification
    //https://leetcode.com/problems/text-justification/description/

    public List<String> fullJustify(String[] w, int maxWidth) {

        List<String> ans= new ArrayList<>();
        StringBuilder cur= new StringBuilder();

        int prev=0, cur_len=0, last=-1;

        for( int i=0; i<w.length; i++){

            if( cur_len+ Math.max(i - prev, 0) + w[i].length()<=maxWidth){
                cur_len+=w[i].length();
                // System.out.println(" prev="+ prev+" i="+i);

            }
            else{

                //cur_len=0;
                //double space= (maxWidth-cur_len)/(i-1 -prev-1);
                double space= maxWidth-cur_len;
                int extra= (int) (space % (i-1 -prev)), std= (int) (space/(i-1 -prev));
                //System.out.println(" extra="+ extra+" std="+std);

                for( int k=prev;k<=i-1; k++){
                    cur.append(w[k]);

                    if(k!=i-1){
                        if( extra>0){
                            cur.append(" ".repeat(std+1));
                            extra--;
                        }
                        else {
                            cur.append(" ".repeat(std));
                        }
                    }
                }
                //System.out.println(" else prev="+ prev+" i="+i);
                cur_len=0;
                cur_len+=w[i].length();
                prev=i;
                last=i-1;
                if( cur.length()!=maxWidth){
                    cur.append(" ".repeat(maxWidth-cur.length()));
                }
                ans.add(cur.toString());
                cur= new StringBuilder();
            }
        }
        cur= new StringBuilder();

        System.out.println(" prev="+ prev);
        if( last!=w.length-1){
            for( int k=prev;k<=w.length-1; k++){
                cur.append(w[k]);
                cur.append(" ");
            }
            cur.deleteCharAt(cur.length()-1);
            cur.append(" ".repeat(maxWidth- cur.length()));

            if( cur.length()!=maxWidth){
                cur.append(" ".repeat(maxWidth-cur.length()));
            }
            ans.add(cur.toString());
            return ans;
        }

        String[] x= ans.get(ans.size()-1).split(" ");


        //ans.remove(ans.size()-1);
        //ans.add(String.join(" ", x));

        //  int space=0;

        StringBuilder la= new StringBuilder(String.join(" ", x));

        la.append(" ".repeat(maxWidth-la.length()));

        // System.out.println(" la="+la.toString());

        ans.add( la.toString());

        return ans;
    }

}
