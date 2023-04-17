package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class Design_Browser_History {

    //1472. Design Browser History
    //https://leetcode.com/problems/design-browser-history/description/

    class BrowserHistory {



        List<String> li;

        int cur=-1, maxx=-1;

        public BrowserHistory(String homepage) {

            cur++;

            li= new ArrayList<>();
            li.add(homepage);

            maxx++;
        }

        public void visit(String url) {
            cur++;
            li.add(cur,url);
            maxx=cur;
        }

        public String back(int steps) {
            cur= Math.max(0, cur-steps);

            String ret = li.get(cur);

            return ret;
        }

        public String forward(int steps) {
            cur= Math.min(maxx, cur+steps);

            String ret = li.get(cur);

            return ret;
        }
    }
}
