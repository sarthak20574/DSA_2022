package Templates;

import java.util.*;

public class Dijstra {
    class Network_Delay_Time {



        public int networkDelayTime(int[][] times, int n, int k) {

            long[] ans= new long[n+1];

            Arrays.fill( ans, Integer.MAX_VALUE);

            List<List<int[]>> g= new ArrayList<>();

            for( int i=0; i<=n; i++){
                g.add( new ArrayList<>());
            }

            for( int[] i: times){
                g.get(i[0]).add(new int[]{i[1], i[2]});
                // g.get(i[1]).add(new int[]{i[0], i[2]});
            }

            // for( List<int[]> x: g){

            //     for( int[] xx: x)
            //     System.out.println( Arrays.toString(xx));

            // }


            Queue<Integer> pq= new PriorityQueue<>();
            ans[k]=0;
            pq.add(k);


            while( pq.isEmpty()==false){

                int x= pq.poll();
                //System.out.println( x+ " "g.get(x).size());

                for( int[] e: g.get(x)){


                    int cost= e[1];
                    int src=x;
                    int dest= e[0];

                    //\\System.out.println( src +" -> "+ dest+ " = $"+ cost);


                    if( ans[dest]> ans[src]+ cost){
                        pq.add(dest);
                        ans[dest]=ans[src]+ cost;
                        // System.out.println( src +" -> "+ dest+ " = $"+ cost);
                    }

                }

            }

            // System.out.println( Arrays.toString(ans));

            long ret=0;

            for( int i=1; i<=n; i++){
                ret= Math.max( ans[i], ret);
            }

            return ret==Integer.MAX_VALUE? -1:(int)ret;
        }


    }

}
