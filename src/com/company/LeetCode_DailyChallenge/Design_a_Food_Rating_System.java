package com.company.LeetCode_DailyChallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Design_a_Food_Rating_System {

    // 2353. Design a Food Rating System
//https://leetcode.com/problems/design-a-food-rating-system/
//https://leetcode.com/problems/design-a-food-rating-system/solutions/2324669/three-maps/

    class C{
        int r;
        String x;
        C( int r, String x){
            this.r=r;
            this.x=x;
        }
    }


    class FoodRatings {

        Map<String, String> x;// food, rating
        Map<String, TreeSet<C>> m; // cuisine,
        Map<String, Integer> x2;

        public FoodRatings(String[] f, String[] c, int[] r) {
            int n= f.length;
            x= new HashMap<>();
            m= new HashMap<>();
            x2= new HashMap<>();

            for( int i=0; i<n; i++){
                x.put( f[i], c[i]);

                if( m.containsKey(c[i])==false)
                    m.put( c[i], new TreeSet<>( (a,b)->a.r==b.r?a.x.compareTo(b.x):b.r-a.r) );

                m.get( c[i]).add(new C(r[i], f[i]));
                x2.put(f[i], r[i]);
            }
        }

        public void changeRating(String f, int neww) {
            m.get(x.get(f)).remove(new C(x2.get(f),f) );
            x2.put(f, neww);
            m.get(x.get(f)).add( new C(neww, f));
        }

        public String highestRated(String c) {

            // System.out.println( c);
            // for( String kk: m.get(c)){
            //     System.out.println( kk+" "+x.get(kk));
            // }
            // System.out.println();
            return m.get(c).first().x;
        }
    }

}
