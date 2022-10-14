package com.company.LeetCode_DailyChallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Time_Based_Key_Value_Store {

    //https://www.youtube.com/watch?v=fu2cD_6E8Hw&ab_channel=NeetCode

    class Pair{
        String val;
        int time;

        Pair(String val, int time){
            this.val= val;
            this.time= time;
        }
    }

    class TimeMap {
        Map<String, List<Pair>> m;

        public TimeMap() {
            m= new HashMap<>();

        }

        public void set(String key, String value, int timestamp) {

            if(m.get(key)==null){
                m.put(key,new ArrayList<>());
            }
            m.get(key).add(new Pair(value,timestamp));
        }

        public String get(String key, int timestamp) {
            if(m.containsKey(key)==false)return "";

            return fn(m.get(key),timestamp)!=null?fn(m.get(key),timestamp).val:"";

        }

        Pair fn(List<Pair> list, int time ){

            int l=0, r= list.size()-1, mid;
            Pair ans=null;

            while(l<=r){
                mid= l+(r-l)/2;
                if(list.get(mid).time<=time){
                    ans=list.get((mid));
                    l=mid+1;
                }
                else {
                    r= mid-1;
                }
            }

            return ans;
        }
    }


}
